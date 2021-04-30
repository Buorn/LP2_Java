import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P5x {

    public static void main(String[] args) {

        //Atributos
        String str, nome, dtNasc, sexo;
        int nPessoas;
        double peso, altura;

        //Entradas
        Scanner scan = new Scanner(System.in);

        //Numero de pessoas
        System.out.print("Digite o numero de pessoas: ");
        str = scan.nextLine();
        if (isInt(str)) {
            nPessoas = Integer.parseInt(str);
        } else {
            do {
                System.out.println("NAO FOI DIGITADO UM NUMERO!");
                System.out.print("Digite o numero de pessoas: ");
                str = scan.nextLine();
            } while (!(isInt(str)));
            nPessoas = Integer.parseInt(str);
        }
        System.out.println("");
        System.out.println("--- Cadastro de Pessoas ---");

        //Lista
        List entrada = new ArrayList();

        //lopping
        for (int i = 0; i < nPessoas; i++) {

            //sexo
            System.out.print("Inserir Homem (h) ou Mulher (m)? ");
            sexo = scan.nextLine();
            if ((!"H".equals(sexo)) && (!"h".equals(sexo))
                    && (!"M".equals(sexo)) && (!"m".equals(sexo))) {
                do {
                    System.out.println("--- DIGITE A LETRA CORRETA ---");
                    System.out.print("Inserir Homem (h) ou Mulher (m)? ");
                    sexo = scan.nextLine();
                } while ((!"H".equals(sexo)) && (!"h".equals(sexo))
                        && (!"M".equals(sexo)) && (!"m".equals(sexo)));
            }
            //Nome
            System.out.print("Digite nome: ");
            nome = scan.nextLine();

            //Data de Nascimento
            System.out.print("Digite a Data de Nascimento (dd/mm/aaa): ");
            dtNasc = scan.nextLine();
            while (!(isDate(dtNasc))) {
                System.out.println("--- DATA INEXISTENTE ---");
                System.out.print("Digite a Data de Nascimento (dd/mm/aaa): ");
                dtNasc = scan.nextLine();
            }
            //Peso
            System.out.print("Digite o peso: ");
            str = scan.nextLine();
            if (isNumero(str)) {
                peso = Double.parseDouble(str);
            } else {
                do {
                    System.out.println("NAO FOI DIGITADO UM NUMERO!");
                    System.out.print("Digite o peso: ");
                    str = scan.nextLine();
                } while (!(isNumero(str)));
                peso = Double.parseDouble(str);
            }

            //Altura
            System.out.print("Digite o altura: ");
            str = scan.nextLine();
            if (isNumero(str)) {
                altura = Double.parseDouble(str);
            } else {
                do {
                    System.out.println("NAO FOI DIGITADO UM NUMERO!");
                    System.out.print("Digite o altura: ");
                    str = scan.nextLine();
                } while (!(isNumero(str)));
                altura = Double.parseDouble(str);
            }
            System.out.println("");

            //Calculo
            if (("m".equals(sexo)) || ("M".equals(sexo))) {
                entrada.add(new Mulher(nome, dtNasc, peso, altura));
            } else {
                entrada.add(new Homem(nome, dtNasc, peso, altura));
            }
        }

        //Saída
        System.out.println("");
        System.out.println("--- Resultado ---");
        for (int i = 0; i < nPessoas; i++) {
            System.out.println(entrada.get(i).toString());
        }
    }

    //Metodos de Validacao
    public static boolean isNumero(String numero) {
        return numero.matches("\\d*(\\.\\d*)?");
    }

    public static boolean isInt(String numero) {
        return numero.matches("\\d*");
    }

    public static boolean isDate(String texto) {
        return texto.matches("^(?:(?:31(\\/|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|\\.)(?:0?[1,3-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$");
    }
}
