package com.gildedrose.strategy;

import com.gildedrose.Item;

public class CheeseStrategy implements UpdateStrategy {

    @Override
    public void update(Item item) {
        item.sellIn--;
        if (item.quality < 50) {
            item.quality++;
            if (item.sellIn < 0 && item.quality < 50) {
                item.quality++;
            }
        }
    }
}
