 /*
A product marketer has several suppliers of a product. The stock is represented
by an array of quantities for each supplier. As items are purchased, the supplier
raises the price by 1 unit per item purchased, reducing the marketer's profit per unit.
Assume the marketer's profit on any one item is the same as the number of those items the
supplier has. For example, the supplier has 4 units, the marketer's profit on the
first unit sold is 4, then 3, then 2, and the last one the profit is 1. Given the array
of quantities at suppliers and the number of items ordered, determine the highest profit
that can be generated.

e.g.
inventory = [3,5]
order = 6

Two suppliers have inventory = [3,5] units to sell, and 6 items were ordered.
The maximum profit is made by selling 1 for 5, 1 for 4, and 2 at 3 and 2 at 2 units
profits. The two suppliers are left with a unit of product each.
The maximum profit generated is 5 + 4 + 2 * 3 + 2 * 2 = 19.




Amazon Online Assessment (OA) - Find The Highest Profit
An e-commerce company imports a type of fitness band from China and sell them
in US for a higher price for a profit. The company has multiple suppliers for
the product, each with their own inventory. The suppliers raise the price of
their product when inventory gets small due to scarcity. More specifically,
the profit the e-commerce company makes for each product sold is equal to the
number of products left from the supplier.

Given a list of integers representing the number of products each supplier has
and an integer representing the number of products sold, find the maximum profit
the company can make.

Examples
Example 1:
Input:
inventories = [4, 6] order = 4

Output: 19
Explanation:
There are two suppliers, with inventory 4 and 6 respectively.
A total of 7 items are ordered. We can make maximum profit by

getting 1 item from the first supplier for 6
getting 1 item from the first supplier for 5
getting 1 item from the first supplier for 4
getting 1 item from the second supplier for 4
The maximum profit is 6 + 5 + 4 + 4 = 19.

Example 2:
Input:
inventories = [10, 10]

order = 5

Output: 46
Explanation:
The maximum profit we can generate is by

getting 1 item for a profit of 10 from the first supplier
getting 1 item for a profit of 10 from the second supplier
getting 1 item for a profit of 9 from the first supplier
getting 1 item for a profit of 9 from the second supplier
getting 1 item for a profit of 8 from the first or second supplier
The maximum profit is 10 + 10 + 9 + 9 + 8 = 46.
java
class Solution {
    public static int findProfit(List<Integer> inventory, int order) {

    }
    public static void main(String[] args) {
    }
}
*/
