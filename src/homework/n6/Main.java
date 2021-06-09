package homework.n6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик");
        Dog dog = new Dog("Тузик");
        Animal animal = new Animal("Животное");

        cat.run(199);
        cat.swim(1);

        dog.run(501);
        dog.swim(11);

        System.out.println(Cat.getPopulation());
        System.out.println(Dog.getPopulation());
        System.out.println(Animal.getPopulation());


    }
}
