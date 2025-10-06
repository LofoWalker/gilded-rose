package com.gildedrose.strategy;

import com.gildedrose.Item;

import static com.gildedrose.common.ItemQualityConstants.MAX_QUALITY;
import static com.gildedrose.common.ItemQualityConstants.MIN_QUALITY;

public class PassesStrategy implements UpdateStrategy {

    private static final int FIRST_THRESHOLD = 10;
    private static final int SECOND_THRESHOLD = 5;


    @Override
    public void update(Item item) {
        item.sellIn--;

        if (item.sellIn < 0) {
            item.quality = MIN_QUALITY;
            return;
        }

        int qualityIncrease = calculateQualityIncrease(item.sellIn);
        item.quality = Math.min(MAX_QUALITY, item.quality + qualityIncrease);
    }

    private int calculateQualityIncrease(int sellIn) {
        if (sellIn < SECOND_THRESHOLD) {
            return 3;
        } else if (sellIn < FIRST_THRESHOLD) {
            return 2;
        }
        return 1;
    }

}
