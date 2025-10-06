package com.gildedrose.strategy;

import com.gildedrose.Item;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LegendaryStrategyTest {

    @Test
    void shouldNotChangeQuality() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        LegendaryStrategy strategy = new LegendaryStrategy();

        strategy.update(item);

        assertEquals(80, item.quality);
    }

    @Test
    void shouldNotChangeSellIn() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", 0, 80);
        LegendaryStrategy strategy = new LegendaryStrategy();

        strategy.update(item);

        assertEquals(0, item.sellIn);
    }

    @Test
    void shouldNotChangeAnythingWithNegativeSellIn() {
        Item item = new Item("Sulfuras, Hand of Ragnaros", -1, 80);
        LegendaryStrategy strategy = new LegendaryStrategy();

        strategy.update(item);

        assertEquals(-1, item.sellIn);
        assertEquals(80, item.quality);
    }
}
