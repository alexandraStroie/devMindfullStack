public class Dog implements IAnimal{

    private AnimalName animalName;

    public Dog(AnimalName animalName) {
        this.animalName = animalName;
    }

    @Override
    public String makeSound() {
        return "I am a wolf :))";
    }

    @Override
    public String animalName() {
        return null;
    }
}
