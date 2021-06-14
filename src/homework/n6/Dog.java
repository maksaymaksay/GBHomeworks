package homework.n6;

public class Dog extends Animal {
    private static int dogCount;

    public Dog(String dogName,  int runLengthLimit, int swimLengthLimit) {
        super(dogName, runLengthLimit, swimLengthLimit);
        dogCount++;
    }

    public static int getPopulation(){
        return dogCount;
    }
}
