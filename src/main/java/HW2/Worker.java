package HW2;

import HW2.Animal.Animal;
import HW2.Animal.Voice;
import HW2.Food.Food;

public abstract class Worker {
    public static void feed(Animal animal, Food food){
        animal.eat(food);
    }

    public static String getVoice(Voice animal){
        return animal.voice();
    }
}