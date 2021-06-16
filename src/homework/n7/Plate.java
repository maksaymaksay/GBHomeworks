package homework.n7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void foodInfo() {
        System.out.println("plate: " + food);
    }

    public void decreaseFood(int n) {
        if (checkFood(n)) {
            food -= n;
        } else {
            System.out.println("Мало еды!");
        }
    }

    public void addFood(int food) {
        System.out.println("В тарелке еды = " + this.food + " Добавлено еды " + food);
        this.food += food;
    }

    public boolean checkFood(int food){
        return food <= this.food;
    }
}
