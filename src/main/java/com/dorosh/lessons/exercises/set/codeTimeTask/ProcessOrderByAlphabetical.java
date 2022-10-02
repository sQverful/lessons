package com.dorosh.lessons.exercises.set.codeTimeTask;

import java.util.Collection;
import java.util.Set;
import java.util.TreeSet;

public class ProcessOrderByAlphabetical implements ProcessOrderStrategy {

    public static final String STRATEGY_DESCRIPTION = "ordered by alphabetical names of shop item's (TreeSet)";

    @Override
    public void processOrder(Collection<ShopItem> shopItems) {
        Set<ShopItem> shopItemSet = new TreeSet<>(shopItems);
        System.out.println(shopItemSet);
    }

    @Override
    public String getStrategyDescription() {
        return STRATEGY_DESCRIPTION;
    }
}
