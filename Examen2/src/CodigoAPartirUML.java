
public class CodigoAPartirUML {
	static String mensaje = "paquito es el tio mas guapo que conozco";
	static String codificada = "";
	static String vacia = "";

	public static void main(String[] args) {
		// Convertir mayusculas en minusculas
		codificada = mensaje.toUpperCase();
		// for para que recorra todo el mensaje codificado
		for (int i = 0; i < codificada.length(); i = i + 2) {
		// Si me encuentro en una posicion par, pasamos el caracter a una
		// posicion impar y a la inversa
			if (i + 1 == codificada.length()) {
				vacia = vacia + codificada.charAt(i);
			} else {
				vacia = vacia + codificada.charAt(i + 1) + codificada.charAt(i);
			}
		}
		System.out.println(vacia);
	}
}
