package com.gildedrose.strategy;

import com.gildedrose.Item;
import com.gildedrose.common.ItemQualityConstants;

public class LegendaryStrategy implements UpdateStrategy {

    /**
     * No update for legendary items.
     * Their quality remains at {@value ItemQualityConstants#LEGENDARY_QUALITY}
     * and their sellIn does not change.
     */
    @Override
    public void update(Item item) {

    }
}
