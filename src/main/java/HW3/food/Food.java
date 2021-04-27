package HW3.food;

public class Food {
    protected final int feedRate;
    protected final String name;

    protected Food(int feedRate, String name) {
        this.feedRate = feedRate;
        this.name = name;
    }

    public int getFeedRate(){
        return this.feedRate;
    }

    public String getName(){
        return this.name;
    }
}
