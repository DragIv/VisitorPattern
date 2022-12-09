package Figure;

public interface Visitor {
    // методы для работы с каждой реализацией
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitCompoundGraphic(CompoundShape cg);
}