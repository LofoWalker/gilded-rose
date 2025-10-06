package com.gildedrose.strategy;

import com.gildedrose.Item;

public class ConjuredStrategy implements UpdateStrategy {

    @Override
    public void update(Item item) {
        item.sellIn--;

        if (item.quality > 0) {
            item.quality -= 2;

            if (item.sellIn < 0) {
                item.quality -= 2;
            }

            if (item.quality < 0) {
                item.quality = 0;
            }
        }
    }
}
