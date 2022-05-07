import java.util.stream.Collectors;

public class StreamAnimals {
    public static void main(String[] args) {
        System.out.println("***Sorted by name (natural order)***");
        String animalStreamString = Animal.animals.stream().map(Animal::getName).sorted().collect(Collectors.joining(", "));
        System.out.println(animalStreamString);
    }
}
