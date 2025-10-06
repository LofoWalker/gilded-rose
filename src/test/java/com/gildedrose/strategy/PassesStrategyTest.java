package com.gildedrose.strategy;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PassesStrategyTest {

    @Test
    void shouldDecreaseSellIn() {
        Item item = new Item("Backstage passes", 15, 20);
        PassesStrategy strategy = new PassesStrategy();

        strategy.update(item);

        assertEquals(14, item.sellIn);
    }

    @Test
    void shouldIncreaseQualityByOneWhenMoreThan10Days() {
        Item item = new Item("Backstage passes", 15, 20);
        PassesStrategy strategy = new PassesStrategy();

        strategy.update(item);

        assertEquals(21, item.quality);
    }

    @Test
    void shouldIncreaseQualityByTwoWhen10DaysOrLess() {
        Item item = new Item("Backstage passes", 10, 20);
        PassesStrategy strategy = new PassesStrategy();

        strategy.update(item);

        assertEquals(22, item.quality);
    }

    @Test
    void shouldIncreaseQualityByTwoWhen6Days() {
        Item item = new Item("Backstage passes", 6, 20);
        PassesStrategy strategy = new PassesStrategy();

        strategy.update(item);

        assertEquals(22, item.quality);
    }

    @Test
    void shouldIncreaseQualityByThreeWhen5DaysOrLess() {
        Item item = new Item("Backstage passes", 5, 20);
        PassesStrategy strategy = new PassesStrategy();

        strategy.update(item);

        assertEquals(23, item.quality);
    }

    @Test
    void shouldIncreaseQualityByThreeWhen1Day() {
        Item item = new Item("Backstage passes", 1, 20);
        PassesStrategy strategy = new PassesStrategy();

        strategy.update(item);

        assertEquals(23, item.quality);
    }

    @Test
    void shouldDropQualityToZeroAfterConcert() {
        Item item = new Item("Backstage passes", 0, 20);
        PassesStrategy strategy = new PassesStrategy();

        strategy.update(item);

        assertEquals(0, item.quality);
    }

    @Test
    void shouldNotIncreaseQualityAbove50() {
        Item item = new Item("Backstage passes", 5, 50);
        PassesStrategy strategy = new PassesStrategy();

        strategy.update(item);

        assertEquals(50, item.quality);
    }

    @Test
    void shouldIncreaseQualityByTwoWhenAt48And5Days() {
        Item item = new Item("Backstage passes", 5, 48);
        PassesStrategy strategy = new PassesStrategy();

        strategy.update(item);

        assertEquals(50, item.quality);
    }

    @Test
    void shouldIncreaseQualityByOneWhenAt49And5Days() {
        Item item = new Item("Backstage passes", 5, 49);
        PassesStrategy strategy = new PassesStrategy();

        strategy.update(item);

        assertEquals(50, item.quality);
    }
}
