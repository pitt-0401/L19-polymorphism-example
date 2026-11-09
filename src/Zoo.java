public class Zoo {

    public static void main(String[] args) {
        String type = "cat";
        Animal animal; // compile-time type
        // Additional practice: use a switch-case instead!
        if (type.equals("cat")) {
            animal = new Cat("Biscuit", 3); // runtime type
        } else if (type.equals("dog")) {
            animal = new Dog("Sally", 5);
        } else {
            animal = new Pig("Peppa", 4, "pig");
        }

        animal.makeSound();
        // animal.scratchFurniture();  // -> not defined for Animal!
        // Pattern matching:
        if (animal instanceof Cat cat) {
            cat.scratchFurniture();
        } else if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.bark();
        }
    }
}
