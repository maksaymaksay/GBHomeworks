package homework.n7;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = false;
    }

    public void eat(Plate plate) {
        if (plate.decreaseFood(appetite)){
            satiety = true;
        } else {
            satiety = false;
        }
    }

    public boolean getSatiety(){
        return satiety;
    }

    public String getName(){
        return name;
    }
}
