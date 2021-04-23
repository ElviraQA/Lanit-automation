package HW2.Animal;

import HW2.Food.Food;
import HW2.Food.Grass;

public class Herbivorus extends Animal{
    public Herbivorus(String name) {
        super(name);
    }

    @Override
    boolean checkFoodType(Food food) {
        return food instanceof Grass;
    }
}
