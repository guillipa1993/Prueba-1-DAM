
public class Bomba07 {
	public static void main(String[] args) {
	    String mensaje="Este examen esta tirado";
	    String abecedario="abcdefghijklmnñopqrstuvwxyz";
	    String codificador="ªº¡!|12@3#$4%5&6¬/7(8)9=0?¿";
	    String mensajeCodificado="";
	    mensaje=mensaje.toLowerCase();
	    for(int i=0;i<mensaje.length();i++){
	      int posicionDentroDeAbecedario=abecedario.indexOf(mensaje.charAt(i));
	      if(abecedario.indexOf(mensaje.charAt(i))>-1){
	        mensajeCodificado=mensajeCodificado+codificador.charAt(posicionDentroDeAbecedario);
	      }else{
	        mensajeCodificado=mensajeCodificado+"[]";
	      }
	    }
	    System.out.println(mensajeCodificado);
	  }
}
