package DOP;

public class BMW implements Info{

    private int speed;
    private int price;

    public BMW(int speed, int price) {
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String printInfo(Visitor visitor) {
        return visitor.visitBMW(this);
    }


    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

}
