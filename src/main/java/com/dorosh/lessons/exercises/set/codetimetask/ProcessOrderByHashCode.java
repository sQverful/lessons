package com.dorosh.lessons.exercises.set.codetimetask;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ProcessOrderByHashCode implements ProcessOrderStrategy {

    public static final String STRATEGY_DESCRIPTION = "ordered by hashCode (HashSet)";

    @Override
    public void processOrder(Collection<ShopItem> shopItems) {
        Set<ShopItem> shopItemSet = new HashSet<>(shopItems);
        System.out.println(shopItemSet);
    }

    @Override
    public String getStrategyDescription() {
        return STRATEGY_DESCRIPTION;
    }
}
