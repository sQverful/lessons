package com.dorosh.lessons.exercises.set.codetimetask;

class ShopItem implements Comparable<ShopItem>{

    private String name;
    private Integer quantity;

    public ShopItem(String name, Integer quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(ShopItem o) {
        return this.getName().toLowerCase().compareTo(o.getName().toLowerCase());
    }

    @Override
    public String toString() {
        return "ShopItem" + "{"
                + "name=" + this.getName()
                + ", quantity=" + this.getQuantity()
                + "}";
    }

}

