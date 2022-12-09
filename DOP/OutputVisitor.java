package DOP;


public class OutputVisitor implements Visitor{


    public String export(Info... args) {
        StringBuilder sb = new StringBuilder();
        sb.append("Info about cars: \n");
        for (Info info : args) {
            sb.append(info.printInfo(this)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitVolvo(Volvo volvo) {
        return "The speed of a Volvo is " + volvo.getSpeed() + "km/h with a price of "+volvo.getPrice()+"rub";
    }

    @Override
    public String visitBMW(BMW bmw) {
        return "The speed of a BMW is " + bmw.getSpeed() + "km/h with a price of "+bmw.getPrice()+"rub";
    }
}
