import java.util.List;
import java.util.stream.Collectors;

public class SortedAnimals {

    public static List<Animal> sortAnimalListLambda() {
        return Animal.animals.stream().sorted((Animal a, Animal b) -> Animal.compare(a, b)).collect(Collectors.toList());
    }

    public static List<Animal> sortAnimalListReference() {
        return Animal.animals.stream().sorted(Animal::compare).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("***These are sorted by weight***");
        System.out.println("Lambda sort:");
        List<Animal> sortedByLambda = sortAnimalListLambda();
        sortedByLambda.forEach(System.out::println);

        System.out.println("\n\rMethod reference sort:");

        List<Animal> sortedByReference = sortAnimalListReference();
        sortedByReference.forEach(System.out::println);

    }
}
