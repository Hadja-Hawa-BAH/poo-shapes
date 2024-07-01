package fr.afpa.shapes;

 public class Rectangle implements Shape{
    //Déclarations des attributs
    private double lenght;
    private double width;

    public Rectangle(double lenght, double width){
        this.lenght = lenght;
        this.width = width;
    }

    @Override
    public double calculatePerimeter(){
        return 2*lenght + 2*width;
    }

    @Override
    public double calculateArea(){
        return lenght * width;
    }

    @Override
    public String toString(){
        return "\nRectangle {"
        + "\nLongueur: " + lenght
        + "\nLageur: " + width
        + "\nPérimètre:  " + calculatePerimeter()
        + "\nAire: " + calculateArea()
        + "}";
        
    }
}