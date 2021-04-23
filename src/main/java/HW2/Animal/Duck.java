package HW2.Animal;

public class Duck extends Herbivorus implements Swim, Run, Voice {
    public Duck(String animalName) {
        super(animalName);
    }

    @Override
    public void run() {
        System.out.printf("%s бежит\n", name);
    }

    @Override
    public void swim() {
        System.out.printf("%s плавает\n", name);
    }

    @Override
    public String voice() {
        return "Кря";
    }
}