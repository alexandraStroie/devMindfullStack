public class Cat implements IAnimal{

    private AnimalName animalName;

    public Cat(AnimalName animalName) {
        this.animalName = animalName;
    }

    @Override
    public String makeSound() {
        return "cat nip";
    }

    @Override
    public String animalName() {
        return animalName.getName();
    }
}
