package homework.n7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void foodInfo() {
        System.out.println("plate: " + food);
    }

    public boolean decreaseFood(int n) {
        if (food - n < 0) {
            System.out.println("Мало еды!");
            return false;
        } else {
            food -= n;
            return true;
        }
    }

    public void addFood(int food) {
        System.out.println("В тарелке еды = " + this.food + " Добавлено еды " + food);
        this.food += food;
    }
}
