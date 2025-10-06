package com.gildedrose.strategy;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultStrategyTest {

    @Test
    void shouldDecreaseQualityByOneBeforeSellDate() {
        Item item = new Item("Normal Item", 10, 20);
        DefaultStrategy strategy = new DefaultStrategy();

        strategy.update(item);

        assertEquals(19, item.quality);
    }

    @Test
    void shouldDecreaseQualityByTwoAfterSellDate() {
        Item item = new Item("Normal Item", -1, 20);
        DefaultStrategy strategy = new DefaultStrategy();

        strategy.update(item);

        assertEquals(18, item.quality);
    }

    @Test
    void shouldDecreaseQualityByTwoOnSellDate() {
        Item item = new Item("Normal Item", 0, 20);
        DefaultStrategy strategy = new DefaultStrategy();

        strategy.update(item);

        assertEquals(18, item.quality);
    }

    @Test
    void shouldNotDecreaseQualityBelowZero() {
        Item item = new Item("Normal Item", 10, 0);
        DefaultStrategy strategy = new DefaultStrategy();

        strategy.update(item);

        assertEquals(0, item.quality);
    }

}
