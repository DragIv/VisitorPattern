package DOP;

public class Volvo implements Info {

    private int speed;
    private int price;

    public Volvo(int speed, int price) {
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String printInfo(Visitor visitor) {
        return visitor.visitVolvo(this);
    }


    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }
}
