package homework.n6;

public class Animal {
    private String name;
    private static int count;

    public Animal(String name) {
        this.name = name;
        count++;
    }

    public Animal() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run(int length){
        System.out.println(name + " пробежал " + length + "м.");
    }

    public void swim(int length){
        System.out.println(name + " проплыл " + length + "м.");
    }

    public static int getPopulation(){
        return count;
    }
}
