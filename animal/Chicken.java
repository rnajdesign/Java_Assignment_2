package animal;

public class Chicken extends Animal {
    private final String eggColor;

    public Chicken(String eggColor) {
        super("Chicken");
        this.eggColor = eggColor;
    }

    public String getEggColor() {
        return eggColor;
    }

    @Override
    public String getDetails() {
        return "Type: " + type + ", Egg Color: " + eggColor;
    }
}