package homework.n7;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Buch", 5);
        Plate plate = new Plate(10);
        plate.foodInfo();
        cat1.eat(plate);
        plate.foodInfo();

        Cat[] catArray = new Cat[5];
        catArray[0] = new Cat("Puss", 10);
        catArray[1] = new Cat("Meow", 9);
        catArray[2] = new Cat("Kisa", 8);
        catArray[3] = new Cat("Murzik", 7);
        catArray[4] = new Cat("Snezhok", 5);

        Plate plateForArray = new Plate(35);

        for (Cat cat : catArray) {
            cat.eat(plateForArray);
            checkSatiety(cat);
        }

        plateForArray.addFood(10);
        catArray[4].eat(plateForArray);
        checkSatiety(catArray[4]);
    }

    private static void checkSatiety(Cat cat) {
        if (cat.getSatiety()) {
            System.out.println(cat.getName() + " поел");
        } else {
            System.out.println(cat.getName() + " не поел");
        }
    }
}
