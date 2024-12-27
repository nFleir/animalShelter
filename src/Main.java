import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("\n1. Добавить животное\n2. Удалить животное\n3. Показать всех животных\n4. Найти животное\n5. Выход");
            System.out.print("Выберите действие: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Очистка ввода

            switch (choice) {
                case 1:
                    System.out.print("Введите имя: ");
                    String name = scanner.nextLine();
                    System.out.print("Введите вид: ");
                    String species = scanner.nextLine();
                    System.out.print("Введите возраст: ");
                    int age = scanner.nextInt();
                    System.out.print("Привит (true/false): ");
                    boolean vaccinated = scanner.nextBoolean();
                    scanner.nextLine(); // Очистка ввода
                    System.out.print("Введите описание: ");
                    String description = scanner.nextLine();
                    shelter.addAnimal(new Animal(name, species, age, vaccinated, description));
                    break;
                case 2:
                    System.out.print("Введите имя животного для удаления: ");
                    String removeName = scanner.nextLine();
                    shelter.removeAnimal(removeName);
                    break;
                case 3:
                    shelter.listAnimals();
                    break;
                case 4:
                    System.out.print("Введите имя животного для поиска: ");
                    String searchName = scanner.nextLine();
                    Animal found = shelter.findAnimal(searchName);
                    if (found != null) {
                        System.out.println("Найдено: " + found);
                    } else {
                        System.out.println("Животное не найдено.");
                    }
                    break;
                case 5:
                    running = false;
                    System.out.println("Выход из программы.");
                    break;
                default:
                    System.out.println("Некорректный выбор. Повторите ввод.");
                    break;
            }
        }
        scanner.close();
    }
}
