package HW2.Animal;

import HW2.Food.Food;
import HW2.Food.Meat;

public class Carnivoures extends Animal{
    public Carnivoures(String name) {
        super(name);
    }

    @Override
    boolean checkFoodType(Food food) {
        return food instanceof Meat;
    }
}
