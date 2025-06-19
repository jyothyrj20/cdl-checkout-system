package com.cdl;

public class PricingRule {
    private final int unitPrice;
    private final int specialQty;
    private final int specialPrice;

    public PricingRule(int unitPrice) {
        this(unitPrice, 0, 0);
    }

    public PricingRule(int unitPrice, int specialQty, int specialPrice) {
        this.unitPrice = unitPrice;
        this.specialQty = specialQty;
        this.specialPrice = specialPrice;
    }

    public int getPrice(int quantity) {
        if (specialQty > 0) {
            int specialSets = quantity / specialQty;
            int remainder = quantity % specialQty;
            return specialSets * specialPrice + remainder * unitPrice;
        } else {
            return quantity * unitPrice;
        }
    }
}