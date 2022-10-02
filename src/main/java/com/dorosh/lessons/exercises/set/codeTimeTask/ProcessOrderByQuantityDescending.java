package com.dorosh.lessons.exercises.set.codeTimeTask;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ProcessOrderByQuantityDescending implements ProcessOrderStrategy {

    public static final String STRATEGY_DESCRIPTION = "ordered by quantity descending (TreeSet)";

    @Override
    public void processOrder(Collection<ShopItem> shopItems) {
        Set<ShopItem> shopItemSet = new TreeSet<>(new Comparator<ShopItem>() {
            @Override
            public int compare(ShopItem o1, ShopItem o2) {
                return o2.getQuantity().compareTo(o1.getQuantity());
            }
        });
        shopItemSet.addAll(shopItems);
        System.out.println(shopItemSet);
    }

    @Override
    public String getStrategyDescription() {
        return STRATEGY_DESCRIPTION;
    }
}
