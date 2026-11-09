public abstract class Animal {
    // Instance variables
    private String name;
    private int age;

    private final String type;

    // Constructor
    public Animal(String name, int age, String type) {
        this.name = name;
        if (age >= 0) {
            this.age = age;
        } else {
            this.age = 0;
        }
        this.type = type;
    }

    // getters
    public final String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getType() {
        return type;
    }

    // Behavior
    public abstract void makeSound(); // There is no "generic" sound all animals make

    // public void makeSound(String sound) {
    //     System.out.println(sound);
    // }

    // public String makeSound(String sound, boolean isLoud) {
    //     return sound;
    // }

    // public void makeSound(String sound, int times) {
    //     System.out.println(sound);
    // }

    @Override
    public String toString() {
        return "Animal {name=" + name + ", age=" + age + "}";
    }
}
