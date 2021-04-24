package HW2.Animal;


import HW2.Food.Food;
import HW2.Food.Grass;

public abstract class Herbivorus extends Animal{
    public Herbivorus(String name) {
        super(name);
    }

    @Override
    public void eat(Food food) {
        if(food instanceof Grass){
            int feedRate = food.getFeedRate();
            satiety += feedRate;
            System.out.printf("%s покормили %s и оно востановило %d голода\n", name, food.getName(), feedRate);
        } else {
            System.out.printf("%s не может есть %s\n", name, food.getName());
        }
    }
}