/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 14/09/20
 *  Time: 10:17 AM
 *  File Name : BurgerShop.java
 * */
package examples.fastfood;

public class BurgerShop {

    private int numberOfBurgerBuns;

    private Burger makeBurger(String name) throws NotEnoughIngredientsException {
        // Exception Scenarios
        // 1. The Burger shop can run out of ingredients.
        // 2. The Burger shop can be closed.
        // 3. The Burger shop can have too many open order and new orders are not
        // taken.

        if (numberOfBurgerBuns <= 1) {
            // throw new <exceptionConstructor()>;
            // 1. This method can try to handle this exception by itself using
            // try / catch.
            // 2. This method can pass the exception object to the method
            // that is calling it using the throws keyword.
            throw new NotEnoughIngredientsException("Not Enough Burger Buns.");
        }
        Burger burger = new Burger(1, name, 100.0);
        return burger;
    }

    public boolean orderBurger(String name) throws NotEnoughIngredientsException {
        return makeBurger(name) != null;
    }
}
