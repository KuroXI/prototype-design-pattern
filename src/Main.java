import Animals.Animal;

public class Main {
  public static void main(String[] args) {
    AnimalRegistry animalRegistry = new AnimalRegistry();

    Animal dolly = animalRegistry.createSheep("Dolly");
    dolly.makeSound();

    Animal cow = animalRegistry.createCow();
    cow.makeSound();

    Animal horse = animalRegistry.createHorse("Brown");
    horse.makeSound();
  }
}
