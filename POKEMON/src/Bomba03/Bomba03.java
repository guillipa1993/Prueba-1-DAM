package Bomba03;

public class Bomba03 {

	public static void main(String[] args) {
		// String frase = "Paco@es@un c1ch4nd4";

		String frase1 = "Paco@es@un";
		String frase2 = " c1ch4nd4";
		String decodificada = "";

		for (int i = 0; i < frase1.length(); i++) {
			if (frase1.substring(i, i + 1).contains("@")) {
				decodificada = decodificada + " ";
			} else {
				decodificada = decodificada + frase1.substring(i, i + 1);
			}
		}
		for (int i = 0; i < frase2.length(); i++) {
			if (frase2.substring(i, i + 1).contains("1")) {
				decodificada = decodificada + "a";
			} else if (frase2.substring(i, i + 1).contains("4")) {
				decodificada = decodificada + "o";
			} else {
				decodificada = decodificada + frase2.substring(i, i + 1);
			}		
		}
		System.out.println(decodificada);
	}
}