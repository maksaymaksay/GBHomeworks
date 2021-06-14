package homework.n6;

public class Cat extends Animal {
    private static int catCount;

    public Cat(String catName, int runLengthLimit, int swimLengthLimit) {
        super(catName, runLengthLimit, swimLengthLimit);
        catCount++;
    }

    @Override
    public void swim(int length) {
        System.out.println(super.name + " не умеет плавать");
    }

    public static int getPopulation() {
        return catCount;
    }
}
