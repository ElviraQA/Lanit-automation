package HW2.Animal;

import HW2.Food.Food;

public abstract class Animal{

    protected int satiety;
    protected final String name;

    protected Animal(String name) {
        this.name = name;
    }


    public void eat(Food food) {
        if(checkFoodType(food)){
            int feedRate = food.getFeedRate();
            satiety += feedRate;
            System.out.printf("%s покормили %s и оно востановило %d голода\n", name, food.getName(), feedRate);
        } else {
            System.out.printf("%s не может есть %s\n", name, food.getName());
        }
    }

    abstract boolean checkFoodType(Food food);
}