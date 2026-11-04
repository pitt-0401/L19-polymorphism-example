public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age, "Cat");
    }

    public void scratchFurniture() {
        System.out.println("Oh no!" + " " + getName() + " is scratching your new couch!");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow" + " (" + getName() + ")");
    }
}
