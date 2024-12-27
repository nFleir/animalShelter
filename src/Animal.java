public class Animal {
    private String name;
    private String type;
    private int age;
    private boolean vaccinated;
    private String description;

    public Animal(String name, String type, int age, boolean vaccinated, String description) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.vaccinated = vaccinated;
        this.description = description;
    }


    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public boolean isVaccinated() { return vaccinated; }
    public void setVaccinated(boolean vaccinated) { this.vaccinated = vaccinated; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    @Override
    public String toString() {
        return "Животное{" +
                "имя='" + name + '\'' +
                ", порода='" + type + '\'' +
                ", возраст=" + age +
                ", вакцинация=" + vaccinated +
                ", описание='" + description + '\'' +
                '}';
    }
}
