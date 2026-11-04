public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age, "Dog");
    }

    @Override
    public void makeSound() {
        System.out.println(getType() + " says:\t" + "Woof" + " (" + getName() + ")");
    }
}