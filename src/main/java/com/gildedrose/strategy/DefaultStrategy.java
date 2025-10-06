package com.gildedrose.strategy;

import com.gildedrose.Item;

import static com.gildedrose.common.ItemQualityConstants.MIN_QUALITY;

public class DefaultStrategy implements UpdateStrategy {

    @Override
    public void update(Item item) {
        item.sellIn--;

        int degradation = item.sellIn < 0 ? 2 : 1;
        item.quality = Math.max(MIN_QUALITY, item.quality - degradation);
    }
}
