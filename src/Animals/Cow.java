package Animals;

public record Cow(Integer legs, String sound, String food) implements Animal {
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
}
