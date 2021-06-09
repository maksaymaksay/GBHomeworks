package homework.n6;

public class Dog extends Animal {
    private static int dogCount;

    public Dog(String dogName) {
        super(dogName);
        dogCount++;
    }

    @Override
    public void run(int length){
        if (length > 500) {
            System.out.println(super.getName() + " устал");
        } else {
            System.out.println(super.getName() + " пробежал " + length + "м.");
        }
    }

    @Override
    public void swim(int length){
        if (length > 10) {
            System.out.println(super.getName() + " устал");
        } else {
            System.out.println(super.getName() + " проплыл " + length + "м.");
        }
    }

    public static int getPopulation(){
        return dogCount;
    }
}
