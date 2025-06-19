package com.cdl;

import java.util.HashMap;
import java.util.Map;

public class Checkout {
    private final Map<Character, PricingRule> pricingRules;
    private final Map<Character, Integer> itemCounts = new HashMap<>();

    public Checkout(Map<Character, PricingRule> pricingRules) {
        this.pricingRules = pricingRules;
    }

    public void scan(char item) {
        itemCounts.put(item, itemCounts.getOrDefault(item, 0) + 1);
        System.out.println("Running Total: " + getTotal() + " pence");
    }

    public int getTotal() {
        int total = 0;
        for (Map.Entry<Character, Integer> entry : itemCounts.entrySet()) {
            PricingRule rule = pricingRules.get(entry.getKey());
            total += rule.getPrice(entry.getValue());
        }
        return total;
    }
}