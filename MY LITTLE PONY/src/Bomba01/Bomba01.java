package Bomba01;

public class Bomba01 {
public static void main(String[] args) {
//String a decodificar
String frase="PAcO Es Un cAchOndO";
//Convertimos mayusculas en vocales
frase=frase.replaceAll("A", "a");
frase=frase.replaceAll("E", "e");
frase=frase.replaceAll("I", "i");
frase=frase.replaceAll("O", "o");
frase=frase.replaceAll("U", "u");
//Por pantalla
System.out.println(frase);
}
}