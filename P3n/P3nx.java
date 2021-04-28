import java.io.IOException;
import java.util.Scanner;

public class P3nx {
    public static boolean isNumero(String numero){
        return numero.matches("\\d*(\\.\\d*)?");
    }

    public static boolean isInt(String numero){
        return numero.matches("\\d*");
    }

    public static void main(String[] args) throws IOException{
        int qtd;
        double numero;
        String numAngulos, num;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o numero de angulos: ");
        numAngulos = scan.nextLine();

        if(isInt(numAngulos)){
            qtd = Integer.parseInt(numAngulos);
        }else{
            do{
                System.out.println("NAO FOI DIGITADO UM NUMERO!");
                System.out.print("Digite o numero de angulos, por favor: ");
                numAngulos = scan.nextLine();
            }while(!(isInt(numAngulos)));
            qtd = Integer.parseInt(numAngulos);
        }
       
        AnguloObj[] angulo = new AnguloObj[qtd];

        for(int index = 0; index< angulo.length; index++){
            System.out.print("Digite o " + (index+1) + "º angulo: " );
            num = scan.nextLine();
            if(isNumero(num)){
                numero = Double.parseDouble(num);
                angulo[index] = new AnguloObj(numero);
            } else{
                do{
                    System.out.println("NAO FOI DIGITADO UM NUMERO!");
                    System.out.println("Digite um angulo valido: " );
                    num = scan.nextLine();
                } while(!(isNumero(num)));

                numero = Double.parseDouble(num);
                angulo[index] = new AnguloObj(numero);
                }
       }
        for (AnguloObj angulo1 : angulo) {
            System.out.println(angulo1.toString());
        }
    }
}
