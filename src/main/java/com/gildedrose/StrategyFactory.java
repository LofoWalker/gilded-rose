package com.gildedrose;

import com.gildedrose.strategy.*;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory {

    public static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    public static final String AGED_BRIE = "Aged Brie";
    public static final String BACKSTAGE_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    public static final String CONJURED_PREFIX = "Conjured";

    private static final Map<String, UpdateStrategy> STRATEGY_MAP = new HashMap<>();

    static {
        STRATEGY_MAP.put(SULFURAS, new LegendaryStrategy());
        STRATEGY_MAP.put(AGED_BRIE, new CheeseStrategy());
        STRATEGY_MAP.put(BACKSTAGE_PASSES, new PassesStrategy());
    }

    /**
     * Private constructor to prevent instantiation.
     */
    private StrategyFactory() {
    }

    public static UpdateStrategy getStrategyFor(String itemName) {
        if (itemName.startsWith(CONJURED_PREFIX)) {
            return new ConjuredStrategy();
        }

        return STRATEGY_MAP.getOrDefault(itemName, new DefaultStrategy());
    }
}
