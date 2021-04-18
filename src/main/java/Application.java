import model.Kotik;

public class Application {

    public static void main(String[] args) {
        Kotik Sam = new Kotik(1, "Sam", 5, "Cat is playing");
        Kotik Tom = new Kotik();
        Tom.SetKotik(2, "Tom", 7, "Cat is sleeping!");

        if(Sam.getMeow().equals(Tom.getMeow()))
            System.out.println("Коты мяукают одинаково");
        else
            System.out.println("Коты мяукают по-разному " + Sam.getName() + " - " + Sam.getMeow() + "; "  + Tom.getName() + " - " + Tom.getMeow());

        System.out.println("Кот: " + Sam.getName() + " весит " + Sam.getWeight() + "кг");
        Sam.liveAnotherDay();
        System.out.println("Количество котов: " + Kotik.getObjectCounter());
        }
    }









