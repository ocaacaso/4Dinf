# Point

Creare una classe `Point` che abbia due coordinate x e y di tipo double.

Pensiamo a due costruttori:

* un costruttore vuoto che imposta il punto a 0, 0
* un costruttore che prenda in input x e y

La classe avrà un metodo `print` che stamperà il punto con questo formato: "(x: 32.5, y: 23.2)".

La classe inoltre avrà dei metodo che permettono al punto di spostarsi nello spazio:

* moveUp(double y)
* moveDown(double y)
* moveLeft(double x)
* moveRight(double x)

Avrà infine i seguenti metodi:

* double distance(Point p): metodo che prende in input un altro punto e mi dice qual è la distanza da questo con il teorema di Pitagora (vedere la funzione [potenza](https://www.geeksforgeeks.org/math-pow-method-in-java-with-example/) e la funzione [radice quadrata](https://www.geeksforgeeks.org/java-sqrt-method-examples/)
* boolean sameQuadrant(Point p): metodo che prende in input un altro punto e mi dice se sono nello stesso quadrante del piano cartesiano

Scrivere un `main` che crei più punti e che testi i vari metodi.