package com.gildedrose.strategy;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheeseStrategyTest {

    @Test
    void shouldDecreaseSellIn() {
        Item item = new Item("Aged Brie", 10, 20);
        CheeseStrategy strategy = new CheeseStrategy();

        strategy.update(item);

        assertEquals(9, item.sellIn);
    }

    @Test
    void shouldIncreaseQualityByOneBeforeSellDate() {
        Item item = new Item("Aged Brie", 10, 20);
        CheeseStrategy strategy = new CheeseStrategy();

        strategy.update(item);

        assertEquals(21, item.quality);
    }

    @Test
    void shouldIncreaseQualityByTwoAfterSellDate() {
        Item item = new Item("Aged Brie", 0, 20);
        CheeseStrategy strategy = new CheeseStrategy();

        strategy.update(item);

        assertEquals(22, item.quality);
    }

    @Test
    void shouldNotIncreaseQualityAbove50() {
        Item item = new Item("Aged Brie", 10, 50);
        CheeseStrategy strategy = new CheeseStrategy();

        strategy.update(item);

        assertEquals(50, item.quality);
    }

    @Test
    void shouldNotIncreaseQualityAbove50AfterSellDate() {
        Item item = new Item("Aged Brie", 0, 50);
        CheeseStrategy strategy = new CheeseStrategy();

        strategy.update(item);

        assertEquals(50, item.quality);
    }

    @Test
    void shouldIncreaseQualityByOneWhenAt49BeforeSellDate() {
        Item item = new Item("Aged Brie", 10, 49);
        CheeseStrategy strategy = new CheeseStrategy();

        strategy.update(item);

        assertEquals(50, item.quality);
    }

    @Test
    void shouldIncreaseQualityByOneWhenAt49AfterSellDate() {
        Item item = new Item("Aged Brie", 0, 49);
        CheeseStrategy strategy = new CheeseStrategy();

        strategy.update(item);

        assertEquals(50, item.quality);
    }

    @Test
    void shouldIncreaseQualityFromZero() {
        Item item = new Item("Aged Brie", 5, 0);
        CheeseStrategy strategy = new CheeseStrategy();

        strategy.update(item);

        assertEquals(1, item.quality);
    }
}
