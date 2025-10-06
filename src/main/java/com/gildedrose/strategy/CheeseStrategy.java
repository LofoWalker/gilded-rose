package com.gildedrose.strategy;

import com.gildedrose.Item;

import static com.gildedrose.common.ItemQualityConstants.MAX_QUALITY;

public class CheeseStrategy implements UpdateStrategy {

    @Override
    public void update(Item item) {
        item.sellIn--;

        int improvement = item.sellIn < 0 ? 2 : 1;
        item.quality = Math.min(MAX_QUALITY, item.quality + improvement);
    }
}
