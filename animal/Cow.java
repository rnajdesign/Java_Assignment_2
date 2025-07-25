package animal;

public class Cow extends Animal {
    private final int milkPerDay;

    public Cow(int milkPerDay) {
        super("Cow");
        this.milkPerDay = milkPerDay;
    }

    public int getMilkPerDay() {
        return milkPerDay;
    }

    @Override
    public String getDetails() {
        return "Type: " + type + ", Milk per day: " + milkPerDay + "L";
    }
}