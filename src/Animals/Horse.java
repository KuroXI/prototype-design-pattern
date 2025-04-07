package Animals;

public class Horse implements Animal {
  private int legs;
  private String sound;
  private String food;
  private String color;

  public Horse(int legs, String sound, String food, String color) {
    this.legs = legs;
    this.sound = sound;
    this.food = food;
    this.color = color;
  }

  @Override
  public Animal clone() {
    return this;
  }

  @Override
  public void makeSound() {
    System.out.println(this.getType() + " says " + sound);
  }

  @Override
  public String getType() {
    return this.getClass().getSimpleName();
  }

  public int getLegs() {
    return this.legs;
  }

  public String getSound() {
    return sound;
  }

  public String getFood() {
    return food;
  }

  public String getColor() {
    return color;
  }

  public void setLegs(int legs) {
    this.legs = legs;
  }

  public void setSound(String sound) {
    this.sound = sound;
  }

  public void setFood(String food) {
    this.food = food;
  }

  public void setColor(String color) {
    this.color = color;
  }
}
