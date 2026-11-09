public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age, "Dog");
    }
    public void bark() {
        System.out.println("Woof!");
    }

    @Override
    public void makeSound() {
        System.out.println(getType() + " says:\t" + "Woof" + " (" + getName() + ")");
    }
}