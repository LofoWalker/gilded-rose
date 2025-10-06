package com.gildedrose.strategy;

import com.gildedrose.Item;
import com.gildedrose.common.ItemQualityConstants;

public class ConjuredStrategy implements UpdateStrategy {

    private static final int DEGRADATION_MULTIPLIER = 2;

    @Override
    public void update(Item item) {
        item.sellIn--;

        int baseDegradation = item.sellIn < 0 ? 2 : 1;
        int totalDegradation = baseDegradation * DEGRADATION_MULTIPLIER;

        item.quality = Math.max(ItemQualityConstants.MIN_QUALITY, item.quality - totalDegradation);
    }
}
