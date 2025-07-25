package animal;

public class Chicken extends Animal {
  private String eggColor;

  public Chicken(String type, String eggColor) {
    super(type);
    this.eggColor = eggColor;
  }

  public String getEggColor() {
    return eggColor;
  }

  public void setEggColor(String eggColor) {
    this.eggColor = eggColor;
  }

  public String getDetails() {
    return "Type: " + getType() + ", Egg Color: " + eggColor;
  }
}
