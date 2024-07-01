package fr.afpa.shapes;

import java.util.ArrayList;

/*
	Objectif : développer des classes représentant des formes géométriques (Rectangle, Cercle et Triangle)
	Pour chacune de ces classes il faudra implémenter deux méthodes :
	 - une qui renverra le périmètre -> double calculatePerimeter()
	 - une qui renverra l'aire -> double calculateArea()

	Pour apprendre à implémenter une interface vous pouvez vous référer au diaporama présenté en formation
	Vous pouvez également regarder la vidéo suivante : https://www.youtube.com/watch?v=OkEwPtRaqY4

	// implémentez une classe "Rectangle" comprenant les attributs présentés sur le diagramme UML contenu dans le sous-dossier "doc"
	Le diagramme UML est sous format "uxf". Pour pouvoir le lire il vous faudra le logiciel UMLET
	UMLET est disponible à l'adresse suivante : https://www.umlet.com/
//  implémentez une classe "Circle" comme présentée par le diagramme UML

// créez une interface nommée "Shape" comprenant deux méthodes abstraites de calcul :
	 - double calculatePerimeter()
	 - double calculateArea()

	// faites en sorte que la classe "Rectangle" implémente l'interface "Shape" et implémentez les deux méthodes 
	Rappel de calcul :
	 - perimetre_rectangle = 2 * longueur + 2 * largeur
	 - aire_rectangle = longueur * largeur

	// faites en sorte que la classe "Circle" implémente l'interface "Shape" et implémentez les deux méthodes
	Rappel de calcul :
	 - périmètre du cercle = 2 * π * rayon
	 - aire_cercle = π * rayon^2

	 La valeur π peut être retrouvée en Java en utilisant "Math.PI" 
	 La puissance de 2 peut être effectuée en utilisant la méthode static "pow" de la classe "Math" 
	 -> plus d'informations par ici https://codegym.cc/fr/groups/posts/fr.575.math-pi-en-java

*/
class GeometricShapeMain {
	public static void main(String[] args) {
	//Instanciation des objets rectangle et cercle
		Shape rectangle1 = new Rectangle(4.0, 2.0);
		rectangle1.calculatePerimeter();
		//System.out.println("Le périmètre du rectangle1 est: " + rectangle1.calculatePerimeter());
		
		rectangle1.calculateArea();
		//System.out.println("L'aire du rectangle1 est: " + rectangle1.calculateArea());


		Shape rectangle2 = new Rectangle(6, 3);
		rectangle1.calculatePerimeter();
		//System.out.println("\nLe périmètre du rectangle2 est: " + rectangle2.calculatePerimeter());

		rectangle2.calculateArea();
		//System.out.println("L'aire du rectangle2 est: " + rectangle2.calculateArea());
		
		Shape cercle1 = new Circle(4.0);
		cercle1.calculatePerimeter();
		//System.out.println("\nLe périmètre du cercle1 est: " + cercle1.calculatePerimeter());
		
		rectangle1.calculateArea();
		//System.out.println("L'aire du cercle1 est: " + cercle1.calculateArea());


		Shape cercle2 = new Circle(6);
		cercle1.calculatePerimeter();
		//System.out.println("\nLe périmètre du cercle2 est: " + cercle2.calculatePerimeter());

		cercle2.calculateArea();
		//System.out.println("L'aire du cercle2 est: " + cercle2.calculateArea());

		// plus d'information sur la classe "ArrayList" -> https://info.clg.qc.ca/java/structures/array-list
		ArrayList<Shape> shapeList = new ArrayList<>();
		shapeList.add(rectangle1);
		shapeList.add(rectangle2);
		shapeList.add(cercle1);
		shapeList.add(cercle2);

		//Boucle pour afficher la liste du périmètre et de l'aire de chaque objet 
		for (Shape Formes: shapeList){
			System.out.println(Formes);
		
		}
	}	
}
