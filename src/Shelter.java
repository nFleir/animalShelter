import java.util.ArrayList;
import java.util.List;

public class Shelter {
    private List<Animal> animals;

    public Shelter() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println(animal.getName() + " добавлен в приют.");
    }

    public void removeAnimal(String name) {
        animals.removeIf(animal -> animal.getName().equalsIgnoreCase(name));
        System.out.println(name + " удален из приюта.");
    }

    public void listAnimals() {
        if (animals.isEmpty()) {
            System.out.println("Приют пуст.");
        } else {
            System.out.println("Список животных в приюте:");
            animals.forEach(System.out::println);
        }
    }

    public Animal findAnimal(String name) {
        for (Animal animal : animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        System.out.println("Животное с именем " + name + " не найдено.");
        return null;
    }
}
