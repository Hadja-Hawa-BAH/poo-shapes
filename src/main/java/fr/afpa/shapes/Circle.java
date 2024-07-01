package fr.afpa.shapes;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    // Implémentation de deux méthodes/fonctions

    @Override
    public double calculatePerimeter(){
        return Math.PI * 2 * this.radius;

    }

    @Override
    public double calculateArea(){
        return  Math.PI * Math.pow(this.radius,2);
        
    }

    @Override
    public String toString(){
        return "\nCircle {"
        + "\nRayon: " + radius
        + "\nPérimètre:  " + calculatePerimeter()
        + "\nAire: " + calculateArea()
        + "}";
        
    }

}
