public class Voice {
    public Animal[] prepareVoice() {
        Animal[] animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        return animals;
    }

    public static void hear(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeVoice();  
        }
    }
}
