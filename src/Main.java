public class Main {
    public static void main(String[] args) {

        Fish fish = new Fish();
        fish.setName("Bert");
        fish.setBreed("Trout");
        fish.setWeight(700);
        fish.setAge(35);
        System.out.println(fish.getName());
        System.out.println(fish.getBreed());
        System.out.println(fish.getWeight());
        System.out.println(fish.getAge());

        System.out.println("-----------------------------");

        Parrot parrot = new Parrot();
        parrot.setName("Boss");
        parrot.setAbility("Talk");
        parrot.setColor("Colorful");
        parrot.setAge(22);
        System.out.println(parrot.getName());
        System.out.println(parrot.getAbility());
        System.out.println(parrot.getColor());
        System.out.println(parrot.getAge());

        System.out.println("----------------------------");

        Cat cat =  new Cat();
        cat.setName("Elis");
        cat.setBreed("Himalayan cat");
        cat.setCharacter("Gentle");
        cat.setAge(15);
        System.out.println(cat.getName());
        System.out.println(cat.getBreed());
        System.out.println(cat.getCharacter());
        System.out.println(cat.getAge());

        System.out.println("------------------------------");

        Dog dog = new Dog();
        dog.setName("Alex");
        dog.setBreed("German Shepherd");
        dog.setCharacter("Muscular");
        dog.setAge(35);
        System.out.println(dog.getName());
        System.out.println(dog.getBreed());
        System.out.println(dog.getCharacter());
        System.out.println(dog.getAge());

    }
}