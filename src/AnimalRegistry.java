import Animals.Animal;
import Animals.Cow;
import Animals.Horse;
import Animals.Sheep;

public class AnimalRegistry {
  private final Sheep sheepPrototype;
  private final Cow cowPrototype;

  private final Horse horsePrototype;

  public AnimalRegistry() {
    sheepPrototype = new Sheep(4, "Meeeeeeh", "Grass", "Bulats");
    cowPrototype = new Cow(4, "Mooooooh", "Hay");
    horsePrototype = new Horse(4, "Neigh", "Grass", "Brown");
  }

  public Animal createSheep(String name) {
    Sheep cloned = (Sheep) sheepPrototype.clone();
    cloned.setName(name);
    return cloned;
  }

  public Animal createCow() {
    return cowPrototype.clone();
  }

  public Animal createHorse(String color) {
    Horse cloned = (Horse) horsePrototype.clone();
    cloned.setColor(color);
    return cloned;
  }
}
