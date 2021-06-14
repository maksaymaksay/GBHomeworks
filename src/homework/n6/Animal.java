package homework.n6;

public class Animal {
    public String name;
    public int runLengthLimit;
    public int swimLengthLimit;
    public static int count;

    public Animal(String name, int runLengthLimit, int swimLengthLimit) {
        this.name = name;
        this.runLengthLimit = runLengthLimit;
        this.swimLengthLimit = swimLengthLimit;
        count++;
    }

    public void run(int length) {
        if (length > runLengthLimit) {
            System.out.println(name + " устал");
        } else {
            System.out.println(name + " пробежал " + length + "м.");
        }
    }

    public void swim(int length) {
        if (length > swimLengthLimit) {
            System.out.println(name + " устал");
        } else {
            System.out.println(name + " проплыл " + length + "м.");
        }
    }

    public static int getPopulation() {
        return count;
    }
}
