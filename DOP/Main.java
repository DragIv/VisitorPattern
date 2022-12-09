package DOP;

public class Main {
    public static void main(String[] args) {
        BMW bmw = new BMW(340,5600000);
        Volvo volvo = new Volvo(240,4300000);

        export(bmw, volvo);
    }


    private static void export(Info... info) {
        OutputVisitor outputVisitor = new OutputVisitor();
        System.out.println(outputVisitor.export(info));
    }
}
