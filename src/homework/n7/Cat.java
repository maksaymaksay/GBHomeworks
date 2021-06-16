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
        if (satiety) {
            System.out.println(name + " не голоден");
        } else if (plate.checkFood(appetite)) {
            plate.decreaseFood(appetite);
            satiety = true;
            System.out.println(name + " поел");
        } else {
            System.out.println(name + " не поел");
        }
    }
}

