package homework.n6;

public class Cat extends Animal {
    private static int catCount;

    public Cat(String catName) {
        super(catName);
        catCount++;
    }

    @Override
    public void run(int length) {
        if (length > 200) {
            System.out.println(super.getName() + " устал");
        } else {
            System.out.println(super.getName() + " пробежал " + length + "м.");
        }
    }

    @Override
    public void swim(int length) {
        System.out.println(super.getName() + " не умеет плавать");
    }

    public static int getPopulation(){
        return catCount;
    }
}
