package HW2.Animal;

import HW2.Food.Food;

public abstract class Animal{

    protected int satiety;
    protected final String name;

    protected Animal(String name) {
        this.name = name;
    }


    public abstract void eat(Food food);
}