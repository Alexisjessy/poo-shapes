package fr.afpa.shapes;

// TODO implémenter la classe Circle
// se référer au diagramme UML contenu dans le sous-dossier "doc" pour retrouver les informations concernant ses attributs

public class Circle implements Shape {

    private double radius;

public Circle(double radius){
    this.radius =radius;
}

@Override

public Circle(double radius) {
    this.radius = radius;
}
@Override
public double calculatePerimeter() {

    return 2 * Math.PI * radius;
}
@Override
public double calculateArea() {
    return Math.PI * Math.pow(radius, 2);
}
@Override
public String toString() {
    return "Circle [radius=" + radius +   "]";
}
}