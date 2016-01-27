package Bomba02;

public class Bomba02 {

	public static void main(String[] args) {

		// String a decodificar
		String frase = "PaCo es un CaChondo";
		// Convertimos mayusculas en vocales
		frase = frase.replaceAll("C", "c");
		// Por pantalla
		System.out.println(frase);
	}

}
