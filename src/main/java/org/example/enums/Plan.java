package org.example.enums;

public enum Plan {
    BASIC("Basic Plan",40),
    STANDARD("Standard Plan", 80),
    PREMIUM("Premium Plan", 120);

    private final String name;
    private final int price;

    Plan(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}
