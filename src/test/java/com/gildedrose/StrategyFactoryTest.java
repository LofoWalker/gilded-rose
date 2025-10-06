package com.gildedrose;

import com.gildedrose.strategy.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StrategyFactoryTest {

    @Test
    void shouldReturnCheeseStrategyForAgedBrie() {
        UpdateStrategy strategy = StrategyFactory.getStrategyFor("Aged Brie");
        assertInstanceOf(CheeseStrategy.class, strategy);
    }

    @Test
    void shouldReturnLegendaryStrategyForSulfuras() {
        UpdateStrategy strategy = StrategyFactory.getStrategyFor("Sulfuras, Hand of Ragnaros");
        assertInstanceOf(LegendaryStrategy.class, strategy);
    }

    @Test
    void shouldReturnPassesStrategyForBackstagePasses() {
        UpdateStrategy strategy = StrategyFactory.getStrategyFor("Backstage passes to a TAFKAL80ETC concert");
        assertInstanceOf(PassesStrategy.class, strategy);
    }

    @Test
    void shouldReturnDefaultStrategyForUnknownItem() {
        UpdateStrategy strategy = StrategyFactory.getStrategyFor("Unknown Item");
        assertInstanceOf(DefaultStrategy.class, strategy);
    }

    @Test
    void shouldReturnDefaultStrategyForEmptyString() {
        UpdateStrategy strategy = StrategyFactory.getStrategyFor("");
        assertInstanceOf(DefaultStrategy.class, strategy);
    }

    @Test
    void shouldReturnConjuredStrategyForConjuredItem() {
        UpdateStrategy strategy = StrategyFactory.getStrategyFor("Conjured abcd");
        assertInstanceOf(ConjuredStrategy.class, strategy);
    }
}
