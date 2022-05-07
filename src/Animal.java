import java.util.List;

public class Animal {
    public static List<Animal> animals = List.of(new Animal("Cat", 10), new Animal("Dog", 80), new Animal("Bird", 2), new Animal("Elephant", 8000), new Animal("Rhino", 2000), new Animal("Horse", 1500));
    private final String name;
    private final int weight;

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public static int compare(Animal a, Animal b) {
        if (a.weight < b.weight) {
            return -1;
        } else if (a.weight > b.weight) {
            return 1;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" + "name='" + name + '\'' + ", weight=" + weight + "lbs.}";
    }
}
