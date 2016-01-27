package Bomba04;

public class Bomba04 {

	public static void main(String[] args) {
		String codificado = "SDFRCHVCXQCFDFKRQGR";
		String decodificado = "";
		String tabla ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz ";
		String prov = "";
		int key = 3;
		
	       for(int i = 0; i < codificado.length();i++)
	        {            
	            int pos = tabla.indexOf(codificado.charAt(i));            
	            if ((pos - key) < 0){
	            	prov = prov + tabla.charAt((pos-key) + tabla.length());
	            }
	            else
	            {
	            	prov = prov + tabla.charAt(pos-key);
	            }         
	        }        
	        decodificado = prov;
		System.out.println(decodificado);
	}
}