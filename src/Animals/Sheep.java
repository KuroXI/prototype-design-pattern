package Animals;

public class Sheep implements Animal {
  private final int legs;
  private final String sound;
  private final String food;
  private String name;

  public Sheep(int legs, String sound, String food, String name) {
    this.legs = legs;
    this.sound = sound;
    this.food = food;
    this.name = name;
  }

  @Override
  public Animal clone() {
    return this;
  }

  @Override
  public void makeSound() {
    System.out.println(name + " the " + this.getType() + " says " + sound);
  }

  @Override
  public String getType() {
    return this.getClass().getSimpleName();
  }

  public void setName(String name) {
    this.name = name;
  }
}
