# CDL Checkout System – Java

A command-line supermarket checkout system that supports pricing rules with special offers.

##  Features
- Item scanning in any order (SKU: A, B, C, D)
- Pricing rules with multi-price deals (e.g. 3 A's for 130 pence)
- Running total after each scan
- Final total calculation
- Configurable pricing rules

## Pricing Example
| Item | Unit Price | Special Price   |
|------|------------|-----------------|
| A    | 50 pence   | 3 for 130 pence |
| B    | 30 pence   | 2 for 45 pence  |
| C    | 20 pence   | -               |
| D    | 15 pence   | -               |

### Requirements
- Java 8+
- Maven (optional, for dependency and build management)

### Running the Program
### Steps

1. Open a terminal and go to the project folder
2. To compile the project: mvn clean compile
3. To run the program:mvn exec:java
4. Scan items by typing their letters one at a time (A, B, C, or D), then type `total` to finish.
### 🧪 Example Input:

A
B
A
B
A
total


###  Expected Output:

Running Total: 50 pence
Running Total: 80 pence
Running Total: 130 pence
Running Total: 175 pence
Running Total: 225 pence
Final Total: 225 pence


##  Project Structure

- PricingRule.java: holds pricing logic
- Checkout.java: manages scanned items and totals
- Main.java: CLI and user input loop