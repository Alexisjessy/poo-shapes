package fr.afpa.shapes;

// TODO implémenter la classe Rectangle
// se référer au diagramme UML contenu dans le sous-dossier "doc" pour retrouver les informations concernant ses attributs
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Rectangle implements Shape {
    private static final Logger logger = LogManager.getLogger(Rectangle.class);

    private double length;
    private double width;
    public Rectangle(double length, double width) throws InvalidInputException {
        if (length <= 0 || width <= 0) {
            throw new InvalidInputException("Les dimensions du rectangle doivent être positives.");
        }
        this.length = length;
        this.width = width;
    }
    @Override

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle [length=" + length + " , width=" + width+  "]";

    }
}