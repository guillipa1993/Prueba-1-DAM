
public class BombaConvierteVocalesEnNumeros {

	public static void main(String[] args) {
		String palabra = "Si descifras el mensaje birrita por las noches";
		String codificada = "";
		String temporal = "";

		temporal = palabra;

		temporal = temporal.replaceAll("a", "1");
		temporal = temporal.replaceAll("e", "2");
		temporal = temporal.replaceAll("i", "3");
		temporal = temporal.replaceAll("o", "4");
		temporal = temporal.replaceAll("u", "5");
		
		codificada = temporal;

		System.out.println(codificada);
	}
}
