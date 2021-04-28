import java.io.*;
import java.util.*;

public class P4nx {
    //Atributos Classe Principal    
    public String nome, codigo, valor, isExecutivo;
    public float salario;
    public float gratificacao;
    public int nDependentes;
    public int nFuncionarios;
    
    
    //Metodos Especial - Contrutor
    public P4nx(int nFun){
         this.nFuncionarios = nFun;
    }
    //Metodo Getters
    public String getIsExecutivo(){
        return isExecutivo;
    }
    
    //Metodos
    public void calculaSalarios()throws IOException{
        
        Scanner scan = new Scanner(System.in);
        List<FuncionarioContratado> data = new ArrayList<>();
        List<FuncionarioExecutivo> dados = new ArrayList<>();
        
        System.out.println("");
        System.out.println("--- Cadastro de funcionario ---");
        for(int i = 0; i<this.nFuncionarios;i++){
            System.out.println("");
            System.out.print("Contratado ou Executivo (c/e): ");
            isExecutivo = scan.nextLine();
            if(("C".equals(isExecutivo)) || ("c".equals(isExecutivo)) || ("e".equals(isExecutivo)) || ("E".equals(isExecutivo))){
            }else{
                do{
                    System.out.println("--- DIGITE A LETRA CORRETA ---");
                    System.out.print("Contratado ou Executivo (c/e): ");
                    isExecutivo = scan.nextLine();
                }while((!"C".equals(isExecutivo)) && (!"c".equals(isExecutivo)) && (!"e".equals(isExecutivo)) && (!"E".equals(isExecutivo)));
            }
            
            System.out.print("Nome do empregado: ");
            nome = scan.nextLine();
            if(("e".equals(isExecutivo)) || ("E".equals(isExecutivo))){
                nome+= " (Executivo)";
            }

            System.out.print("Codigo: ");
            codigo = scan.nextLine();

            System.out.print("Salario: ");
            valor = scan.nextLine();
            if(isNumero(valor)){
                salario = Float.parseFloat(valor);
            }else{
                do{
                    System.out.println("--- DIGITE UM VALOR NUMERICO ---");
                    System.out.print("Salario: ");
                    valor = scan.nextLine();
                }while(!(isNumero(valor)));
                salario = Float.parseFloat(valor);
            }

            System.out.print("Numero de dependentes: ");
            valor = scan.nextLine();
            if(isInt(valor)){
                nDependentes = Integer.parseInt(valor);
            }else{
                do{
                    System.out.println("--- DIGITE UM INTEIRO ---");
                    System.out.print("Numero de dependentes: ");
                    valor = scan.nextLine();
                }while(!(isInt(valor)));
                nDependentes = Integer.parseInt(valor);
            }
            if(("c".equals(isExecutivo)) || ("C".equals(isExecutivo))){
                    gratificacao = 0f;
            }else{
                System.out.print("Gratificacao: ");
                valor = scan.nextLine();
                if(isNumero(valor)){
                    gratificacao = Float.parseFloat(valor);
                }else{
                    do{
                        System.out.println("--- DIGITE UM VALOR NUMERICO ---");
                        System.out.print("Gratificacao: ");
                        valor = scan.nextLine();
                    }while(!(isNumero(valor)));
                    gratificacao = Float.parseFloat(valor);
                }
            }
            data.add(new FuncionarioContratado(nome, codigo, salario, nDependentes));
            dados.add(new FuncionarioExecutivo(nome, codigo, salario, nDependentes, gratificacao));
            
        }
        System.out.println("");
        System.out.println("--- Folha Salarial ---");
        for(int i = 0; i<dados.size(); i++){
            if (("e".equals(isExecutivo)) || ("E".equals(isExecutivo))){
                dados.get(i).calculaSalario(true);
                System.out.println(dados.get(i).toString());
            }else if (("c".equals(isExecutivo)) || ("C".equals(isExecutivo))){
                if (nDependentes == 0){
                    data.get(i).calculaSalario();
                }else{
                    data.get(i).calculaSalario(nDependentes);
                }
                System.out.println(data.get(i).toString());
            }        
        }
    }
    
    public static boolean isInt(String str){
        return str.matches("\\d*"); 
    }

    public static boolean isNumero(String num){
        return num.matches("\\d*(\\.\\d*)?");
    }

    public static void main(String[] args) throws IOException {
        String nEmpregados;
        int qtdEmp;
        Scanner input = new Scanner(System.in);

        
        System.out.print("Digite o numero de empregados: ");
        nEmpregados = input.nextLine();
        if(isInt(nEmpregados)){
            qtdEmp = Integer.parseInt(nEmpregados);
        } else{
            do{
                System.out.println("--- DIGITE UM NUMERO INTEIRO --- ");
                System.out.print("Digite o numero de empregados: ");
                nEmpregados = input.nextLine();

            }while(!(isInt(nEmpregados)));
            qtdEmp = Integer.parseInt(nEmpregados);
        }
        P4nx func = new P4nx(qtdEmp);
        func.calculaSalarios();

    }
}
