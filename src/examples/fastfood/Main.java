/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 14/09/20
 *  Time: 10:33 AM
 *  File Name : Main.java
 * */
package examples.fastfood;

public class Main {
    public static void main(String[] args) {
        BurgerShop shop = new BurgerShop();
        try {
            shop.orderBurger("Paneer Burger");
        } catch (NotEnoughIngredientsException e) {
            System.out.println(e.getMessage());
        }
    }
}
