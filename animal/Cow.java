package animal;

public class Cow extends Animal {
  private int milkPerDay;

  public Cow(String type, int milkPerDay) {
    super(type);
    this.milkPerDay = milkPerDay;
  }

  public int getMilkPerDay() {
    return milkPerDay;
  }

  public void setMilkPerDay(int milkPerDay) {
    this.milkPerDay = milkPerDay;
  }

  public String getDetails() {
    return "Type: " + getType() + ", Milk per day: " + milkPerDay + "L";
  }
}
