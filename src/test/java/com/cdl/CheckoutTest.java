package com.cdl;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheckoutTest {

    @Test
    public void testCheckoutTotalWithSpecials() {
        Map<Character, PricingRule> pricingRules = new HashMap<>();
        pricingRules.put('A', new PricingRule(50, 3, 130));
        pricingRules.put('B', new PricingRule(30, 2, 45));
        pricingRules.put('C', new PricingRule(20));
        pricingRules.put('D', new PricingRule(15));

        Checkout checkout = new Checkout(pricingRules);
        checkout.scan('A');
        checkout.scan('A');
        checkout.scan('A'); // 130
        checkout.scan('B');
        checkout.scan('B'); // 45
        checkout.scan('C'); // 20
        checkout.scan('D'); // 15

        assertEquals(210, checkout.getTotal());
    }
}