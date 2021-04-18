package model;

public class Kotik {
    private int prettiness;
    private String name;
    private int weight;
    private String meow;
    private int satiety;
    private static int objectCounter = 0;

    public Kotik() {
        this.satiety = 8;
        objectCounter++;
    }

    public Kotik(int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
        this.satiety = 8;
        objectCounter++;
    }

    public void SetKotik (int prettiness, String name, int weight, String meow) {
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }

    public int getPrettiness() {
        return prettiness;
    }

    public void setPrettiness() {
        this.prettiness = prettiness;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight() {
        this.weight = weight;
    }

    public String getMeow() {
        return meow;
    }

    public void setMeow() {
        this.meow = meow;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety() {
        this.satiety = satiety;
    }

    public static int getObjectCounter() {
        return Kotik.objectCounter;
    }

    private boolean CatPlays() {
        if (this.satiety != 0) {
            this.meow = "I like to play!";
            System.out.println(meow + "Cat is playing");
            return true;
        } else {
            this.meow = "I want to eat!!!";
            System.out.println(meow);
            return false;
        }
    }

    private boolean CatSleeps() {
        if (this.satiety != 0) {
            this.meow = "I like to sleep!";
            System.out.println(meow + "Cat is sleeping!");
            return true;
        } else {
            this.meow = "I want to eat!!!";
            System.out.println(meow);
            return false;
        }
    }
    private boolean CatEats(int satiety) {
        this.satiety += satiety;
        System.out.println("Nyam-Nyam!" + this.satiety);
        return true;
    }
    private boolean CatEats(int satiety, int food) {
        this.satiety = this.satiety + satiety*food;
        System.out.println("Nyam-Nyam!" + this.satiety);
        return true;
    }
    private boolean CatEats() {
        return CatEats(1, 1);
    }
    private boolean CatCatchesMice() {
        if (this.satiety != 0) {
            this.meow = "I'm the greatest hunter!";
            System.out.println(meow + "Rrrrrrrrr!Gotcha!");
            return true;
        } else {
            this.meow = "I want to eat!!!";
            System.out.println(meow);
            return false;
        }
    }

    private boolean CatPurrs() {
        if (this.satiety != 0) {
            this.meow = "Murrr-Murrr";
            System.out.println(meow + "Murrr-Murrr");
            return true;
        } else {
            this.meow = "I want to eat!!!";
            System.out.println(meow);
            return false;
        }
    }

    public void liveAnotherDay() {
        for (int i = 0; i < 24; i++) {
 //           System.out.println(i);
            int func = ((int) (Math.random() * 5) )+ 1;
 //           System.out.println(func);
            switch (func) {
                case 1: {
                    if (this.CatPlays() != true)
                        this.CatEats(2);
                }
                break;
                case 2: {
                    if (this.CatSleeps() != true)
                        this.CatEats(2);
                }
                break;
                case 3: {
                    this.CatEats(2);
                }
                break;
                case 4: {
                    if (this.CatCatchesMice() != true)
                        this.CatEats(2);
                }
                break;
                case 5: {
                    if (this.CatPurrs() != true)
                        this.CatEats(2);
                }
                break;
            }
            this.satiety--;
        }
    }
}

