package com.dorosh.lessons.exercises.set.codetimetask;

import java.util.Collection;

public interface ProcessOrderStrategy {

    void processOrder(Collection<ShopItem> shopItemSet);

    String getStrategyDescription();
}
