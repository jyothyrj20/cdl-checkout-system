package com.cdl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<Character, PricingRule> pricingRules = new HashMap<>();
        pricingRules.put('A', new PricingRule(50, 3, 130));
        pricingRules.put('B', new PricingRule(30, 2, 45));
        pricingRules.put('C', new PricingRule(20));
        pricingRules.put('D', new PricingRule(15));

        Checkout checkout = new Checkout(pricingRules);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Scan items one by one (A-D), type 'total' to finish:");

        while (true) {
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.equals("TOTAL")) {
                System.out.println("Final Total: " + checkout.getTotal() + " pence");
                break;
            } else if (input.length() == 1 && pricingRules.containsKey(input.charAt(0))) {
                checkout.scan(input.charAt(0));
            } else {
                System.out.println("Invalid input. Please scan A, B, C, D or type 'total'.");
            }
        }
        scanner.close();
    }
}