package com.gildedrose.strategy;

import com.gildedrose.Item;

public class DefaultStrategy implements UpdateStrategy {
    @Override
    public void update(Item item) {
        item.sellIn--;

        if (item.quality > 0) {
            item.quality = item.quality - 1;
            if (item.sellIn < 0 && item.quality > 0) {
                item.quality = item.quality - 1;
            }
        }
    }
}
