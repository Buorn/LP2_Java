import java.util.*;
public class Pn1x {
    public static void main(String[] args) {
        String line;

        Scanner scan = new Scanner(System.in);
        Calcula area = new Calcula(); 
        
        double a = 0, b = 0, c = 0;
        double test;
         System.out.print("Entrada: ");
         line = scan.nextLine();
        
        while(!line.isEmpty()){
            int contador = 0;
            String[] arrayValores = line.split(" ");
            for (int i = 0; i < arrayValores.length; i++){
                if(!arrayValores[i].isEmpty()){
                    contador++;
                }
            }
            switch (contador) {
                case 0:
                    System.out.println("numero de argumentos insuficientes!");
                    break;
                case 1:
                    System.out.println("Vamos calcular a area do circulo!");
                    a = Double.parseDouble(arrayValores[0]);
                    area.areaCirculo(a);
                    area.setResult(area.getAreaCirculo());
                    area.setNome("Circulo");
                    area.status();
                    break;
                case 2:
                   System.out.println("Vamos calcular a area do retangulo!");
                    a = Double.parseDouble(arrayValores[0]);
                    b = Double.parseDouble(arrayValores[1]);
                    area.areaRetangulo(a,b);
                    area.setResult(area.getAreaRetangulo());
                    area.setNome("Retangulo");
                    area.status();
                    break;
                case 3:
                    a = Double.parseDouble(arrayValores[0]);
                    b = Double.parseDouble(arrayValores[1]);
                    c = Double.parseDouble(arrayValores[2]);
                    test = (a+b+c)/2;                               // Não está funcionando esta condição.
                    if(((test-a)<=0)||((test-b)<=0)||((test-c)<=0)){ 
                        System.out.println("Nao existe Triangulo com essas medidas!");
                        break;
                    }else{
                        System.out.println("Vamos calcular a area do triangulo!");
                        area.areaTriangulo(a, b, c);
                        area.tipoTriangulo(a, b, c);
                        area.setResult(area.getAreaTriangulo());
                        area.setNome("Triangulo");
                        area.status();
                        break;
                    }
                default:
                    System.out.println("Digite no máximo 3 argumentos!");
                    break;
            }
            System.out.print("Entrada: ");
            line = scan.nextLine();
        }
    }
}
