import java.util.Scanner;

public class P2nx {
	public static boolean isNumero(String line){
		return line.matches("\\d*(\\.\\d*)?");
	}

	public static void main(String[] args) {
        	Angulo ang = new Angulo();
        	Scanner scan = new Scanner(System.in);
        	double angulo;
        	String entrada;
 	 
		System.out.print("Entrada: ");
        	entrada = scan.nextLine();
      
        	while(!entrada.isEmpty()){
			if(isNumero(entrada)){
           			angulo = Double.parseDouble(entrada);
	        		ang.cvtAngulo(angulo);
		        	ang.fSeno(ang.getRadiano());
				ang.fCosseno(ang.getRadiano());
				ang.fTangente(ang.getRadiano());
            			ang.fCotangente();
            			ang.status();
            		}else{
				System.out.println("Argumento nao e um numero!");
			}
           		System.out.print("Entrada: ");
            		entrada = scan.nextLine();
        }
    }
}
