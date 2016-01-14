
public class BombaNormal {

	public static void main(String[] args) {
		String palabra = "la muñeca inchable está pinchada";
		String codificada = "";
		String temporal = "";
		String numero = "";
		String letra = "";
		
		for(int i = 0 ; i<palabra.length();i++){
			
			numero = Integer.toString(i);	
			
			if (palabra.charAt(i)!= ' '){
			letra =  new String(new char[]{palabra.charAt(i)});		
			temporal = temporal+ letra + Integer.toString(i);
			codificada = codificada + temporal ;
			}else {
				temporal = temporal + " ";
				
			}
		}
		codificada = temporal ;
		System.out.println(codificada);
	}

}
