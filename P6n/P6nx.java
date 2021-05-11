import java.util.Scanner;


public class P6nx {
    //MENU 01
    public void opcaoPrograma(){
        System.out.println("--- MENU ---");
        System.out.println("1.Imprimir Lista");
        System.out.println("2.Sair");
        System.out.println("");
    }
    //MENU 02
    public void opcaoOrdenar(){
        System.out.println("--- Escolha seu modo de ordenacao ---");
        System.out.println("1.Alfabetica (A - Z)");
        System.out.println("2.Alfabetica (Z - A)");
        System.out.println("3.Menor Peso");
        System.out.println("4.Maior Peso");
        System.out.println("5.Menor Altura");
        System.out.println("6.Maior Altura");
        System.out.println("7.Menor IMC");
        System.out.println("8.Maior IMC");
        System.out.println("9.Homem/Mulher");
        System.out.println("10.Mulher/Homem");
    }
    //Metodo de Validacao das Entradas
    public String validateString(Scanner scan){
        String frase = "";
        boolean sucesso = false;
        do{
            try{
                System.out.print("Digite a sua opcao: ");
                frase = scan.nextLine();
                sucesso = true;
            }catch(Exception exception){
                System.out.println("===== Erro na Leitura ====");
            }
        }while((!sucesso));

        return frase;
    }
    //Metodo de Validacao das Entradas
    public int validateInt(String string, Scanner scan){
        int numero = 0;
        boolean sucesso = false;
        do{
            try{
                numero = Integer.parseInt(string);
                sucesso = true;
            }catch(NumberFormatException exception){
                System.out.println("Favor Entrar com uma Opcao Valida.");
                string = validateString(scan);
            }
        }while(!sucesso);
        return numero;
    }
    //Dados
    public void programa(){
        MinhaListaOrdenavel minhaListaOrdenavel = new MinhaListaOrdenavel();
        Scanner scan = new Scanner(System.in);
        String str;
        int num;
        int nP;

        PessoaIMC h1 = new Homem("Ragnar Lothbrok", "01/04/1987", 87.3f, 1.93f);
        PessoaIMC h2 = new Homem("Bjor Ironside", "23/04/1988", 90.7f, 1.96f);
        PessoaIMC h3 = new Homem("Uhtred of Bebbanburg", "24/04/1989", 77.2f, 1.82f);
        PessoaIMC h4 = new Homem("Suleyman Shah", "22/04/1979", 83.4f, 1.70f);
        PessoaIMC h5 = new Homem("Ertugrul Gazi", "21/04/1999", 78.8f, 1.80f);
        PessoaIMC m1 = new Mulher("Hayme Hatun", "01/06/2003", 50.2f, 1.51f);
        PessoaIMC m2 = new Mulher("Lagertha skjaldmo", "23/06/1991", 66.3f, 1.85f);
        PessoaIMC m3 = new Mulher("Ethelfled of Mercia ","09/06/1990",56.4f,1.7f);
        PessoaIMC m4 = new Mulher("Aslihan Hatun","21/06/1997",70.2f,1.68f);
        PessoaIMC m5 = new Mulher("Saori Kido","24/06/1987",48.2f,1.60f);

        minhaListaOrdenavel.adicionar(h1);
        minhaListaOrdenavel.adicionar(h2);
        minhaListaOrdenavel.adicionar(h3);
        minhaListaOrdenavel.adicionar(h4);
        minhaListaOrdenavel.adicionar(h5);
        minhaListaOrdenavel.adicionar(m1);
        minhaListaOrdenavel.adicionar(m2);
        minhaListaOrdenavel.adicionar(m3);
        minhaListaOrdenavel.adicionar(m4);
        minhaListaOrdenavel.adicionar(m5);
        //Chamada do Menu 1 e das Validacoes
        do{
            opcaoPrograma();
            str = validateString(scan);
            nP = validateInt(str, scan);
            if(nP == 0 || nP > 2){
                do{
                    System.out.println("Favor, Entrar com uma Opcao Valida.");
                    opcaoPrograma();
                    str = validateString(scan);
                    nP = validateInt(str, scan);

                }while(!(nP >= 1 && nP <= 2));
            }
            //Encerra o LOOP
            if(nP == 2){
                break;
            }
            //Chamada do Menu 2 e das Validacoes
            opcaoOrdenar();
            str = validateString(scan);
            num = validateInt(str, scan);
            if(num == 0 || num > 10){
                do{
                    System.out.println("Favor, Entrar com uma Opcao Valida.");
                    opcaoOrdenar();
                    str = validateString(scan);
                    num = validateInt(str, scan);
                }while(!(num >= 1 && num <= 10));
            }
            //Ordenacao
            minhaListaOrdenavel.setMinhaListaOrdenavel(minhaListaOrdenavel.ordena(num));
            
            //SAIDA
            System.out.println("");
            switch (num){
                case 1:        
                    System.out.println("--- LISTA ORDENADA (A - Z) ---");
                    break;
                case 2:
                    System.out.println("--- LISTA ORDENADA (Z - A) ---");
                    break;
                case 3:        
                    System.out.println("--- LISTA ORDENADA (Menor Peso) ---");
                    break;
                case 4:        
                    System.out.println("--- LISTA ORDENADA (Maior Peso) ---");
                    break;
                case 5:        
                    System.out.println("--- LISTA ORDENADA (Menor Altura) ---");
                    break;    
                case 6:        
                    System.out.println("--- LISTA ORDENADA (Maior Altura) ---");
                    break;
                case 7:        
                    System.out.println("--- LISTA ORDENADA (Menor IMC) ---");
                    break;
                case 8:        
                    System.out.println("--- LISTA ORDENADA (Maior IMC) ---");
                    break;    
                case 9:        
                    System.out.println("--- LISTA ORDENADA (Homem/Mulher) ---");
                    break;
                case 10:        
                    System.out.println("--- LISTA ORDENADA (Mulher/Homem) ---");
                    break;
            }     
            for(int i = 0; i < minhaListaOrdenavel.getTam(); i++){
                System.out.println(minhaListaOrdenavel.get(i).toString());
            }
        }while(true);
        
    }
    //Metodo Main
    public static void main(String[] args) {
        P6nx p6nx = new P6nx();
        p6nx.programa();
    }
}