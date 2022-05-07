import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalsAnimals {
    public static void main(String[] args) {
        optionalAnimalB();
    }

    public static Animal optionalAnimalA(Optional<Animal> a) {
        return a.stream().findFirst().orElseThrow(() -> new NoSuchElementException("Animal is empty!"));
    }

    public static void optionalAnimalB() {
        try {
            System.out.println(optionalAnimalA(Optional.of(new Animal("Giraffe", 3500))));
            optionalAnimalA(Optional.empty());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
