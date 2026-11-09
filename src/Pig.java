public class Pig extends Animal {

    public Pig(String name, int age, String type) {
        super(name, age, type);
    }

    @Override
    public void makeSound() {
        System.out.println("Pig says oink");
    }
}
