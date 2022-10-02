package com.dorosh.lessons.exercises.set.codeTimeTask;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class ProcessOrderByUserInputOrder implements ProcessOrderStrategy{

    public static final String STRATEGY_DESCRIPTION = "ordered by your input order (LinkedHashSet)";

    @Override
    public void processOrder(Collection<ShopItem> shopItems) {
        Set<ShopItem> shopItemSet = new LinkedHashSet<>(shopItems);
        System.out.println(shopItemSet);
    }

    @Override
    public String getStrategyDescription() {
        return STRATEGY_DESCRIPTION;
    }
}
