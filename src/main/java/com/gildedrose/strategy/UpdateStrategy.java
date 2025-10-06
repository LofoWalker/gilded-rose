package com.gildedrose.strategy;

import com.gildedrose.Item;

/**
 * Defines a strategy for updating the properties of an {@link Item}.
 * Implementations of this interface encapsulate the logic for modifying
 * the {@code sellIn} and {@code quality} values of an item based on
 * specific rules for different item types.
 *
 * This interface follows the Strategy design pattern, enabling dynamic
 * assignment of update logic for various item categories.
 *
 * Implementations may define how and when the {@code quality} and
 * {@code sellIn} values of an item are adjusted, including behaviors
 * such as degradation, improvement, or exemption from updates.
 *
 * Example usages might include strategies for legendary items, aged
 * cheese, backstage passes, and conjured items.
 *
 * Implementing classes are expected to:
 * - Update the {@code sellIn} property of the item.
 * - Adjust the {@code quality} property according to specific rules.
 */
public interface UpdateStrategy {

    void update(Item item);
}
