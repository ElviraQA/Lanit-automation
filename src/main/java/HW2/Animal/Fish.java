package HW2.Animal;

public class Fish extends Herbivorus implements Swim {
    public Fish(String animalName) {
        super(animalName);
    }

    @Override
    public void swim() {
        System.out.printf("%s плавает\n", name);
    }

}
