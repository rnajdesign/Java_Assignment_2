package animal;

public abstract class Animal {
    protected String type;

    public Animal(String type) {
        this.type = type;
    }

    public abstract String getDetails();
}