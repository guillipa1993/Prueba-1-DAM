
public class Bombita {

	public static void main(String[] args) {
		String palabra = "el conejo quiere zanahorias";
		String codificada = "";
		String temporal = "";
		String letra = "";

		for (int i = 0; i < palabra.length(); i++) {

			if (palabra.charAt(i) == ' ') {
				temporal = temporal + "666";
			} else if (palabra.charAt(i) % 2 == 0) {
				letra = new String(new char[] { palabra.charAt(i) });
				temporal = temporal + letra + Integer.toString(i);
				codificada = codificada + temporal;
				temporal = temporal + letra + Integer.toString(i) + "ESIMPAR";
			} else if (palabra.charAt(i) % 2 != 0) {
				letra = new String(new char[] { palabra.charAt(i) });
				temporal = temporal + letra + Integer.toString(i);
				codificada = codificada + temporal;
				temporal = temporal + letra + Integer.toString(i) + "ESPAR";
			}

			codificada = temporal;
			
		}
		System.out.println(codificada);
	}
}
