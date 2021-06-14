package homework.n6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик", 200, 0);
        Dog dog = new Dog("Тузик", 500, 10);
        Animal animal = new Animal("Животное", 300, 50);

        cat.run(199);
        cat.swim(1);

        dog.run(499);
        dog.swim(9);

        System.out.println(Cat.getPopulation());
        System.out.println(Dog.getPopulation());
        System.out.println(Animal.getPopulation());


    }
}
