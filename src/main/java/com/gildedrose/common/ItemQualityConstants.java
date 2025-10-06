package com.gildedrose.common;


/**
 * Constants defining the quality range of items.
 */
public final class ItemQualityConstants {

    /**
     * Minimal quality allowed for an item.
     */
    public static final int MIN_QUALITY = 0;

    /**
     * Maximal quality allowed for an item.
     * Note: Legendary items have a quality of 80.
     */
    public static final int MAX_QUALITY = 50;

    /**
     * Fix quality for legendary items.
     */
    public static final int LEGENDARY_QUALITY = 80;

    private ItemQualityConstants() {
        throw new AssertionError("This is a utility class and cannot be instantiated");
    }
}
