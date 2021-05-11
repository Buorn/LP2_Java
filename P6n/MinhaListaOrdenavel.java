import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MinhaListaOrdenavel {
    //Atributos
    private final int MENOR_NOME = 1;
    private final int MAIOR_NOME = 2;
    private final int MENOR_PESO = 3;
    private final int MAIOR_PESO = 4;
    private final int MENOR_ALTURA = 5; 
    private final int MAIOR_ALTURA = 6;
    private final int MENOR_IMC = 7;
    private final int MAIOR_IMC = 8; 
    private final int H_M = 9;
    private final int M_H = 10;
    
    //Instanciando ArrayList
    public ArrayList<PessoaIMC> arrayIMC = new ArrayList<PessoaIMC>();
    public int tam = 0;
    
    //Metodos Getters e Setters
    public void setMinhaListaOrdenavel(ArrayList<PessoaIMC> arrayIMC){
        this.arrayIMC = arrayIMC;
    }
    
    public ArrayList<PessoaIMC> getArrayList(){
        return this.arrayIMC;
    } 

    public void setTam(){
        this.tam +=1;
    }
    public int getTam(){
        return this.tam;
    }
    
    //Metodos
    public void adicionar(PessoaIMC p){
        this.arrayIMC.add(p);
        this.setTam();
    }
    
    public PessoaIMC get(int i){
        return arrayIMC.get(i);
    }
    
    public Comparator<Object> pesoc = new Comparator<Object>() {
        @Override
        public int compare(Object p1, Object p2){
            double pf1 = ((PessoaIMC) p1).getPeso();
            double pf2 = ((PessoaIMC) p2).getPeso();
            return (int)Math.round(pf1-pf2);
        }
    };

    public Comparator<Object> alturaC = new Comparator<Object>() {
        @Override
        public int compare(Object p1, Object p2){
            double af1 = ((PessoaIMC) p1).getAltura();
            double af2 = ((PessoaIMC) p2).getAltura();
            if(af1>af2){
                return -1;
            }else if(af1<af2){
                return 1;
            }
            return 0;

        }
    };
    
    public Comparator<Object> imcC = new Comparator<Object>() {
        @Override
        public int compare(Object p1, Object p2){
            double pf1 = ((PessoaIMC) p1).getImc();
            double pf2 = ((PessoaIMC) p2).getImc();
            if(pf1<pf2){
                return -1;
            }else if(pf1>pf2){
                return 1;
            }
            return 0;
        }
    };

    public Comparator<Object> hmC = new Comparator<Object>() {
        @Override
        public int compare(Object p1, Object p2){
            if(((PessoaIMC) p1) instanceof Homem){
                return -1;
            }else if(((PessoaIMC) p2) instanceof Mulher){
                return 1;
            }
            return 0;
        }
    };
    public Comparator<Object> nomeC = new Comparator<Object>() {
        @Override
        public int compare(Object n1, Object n2){
            return ((PessoaIMC) n1).getNome().compareTo(((PessoaIMC) n2).getNome());

        }
    };
  
    public ArrayList<PessoaIMC> ordena(int criterio){
        switch (criterio){
            case MENOR_NOME:
                Collections.sort(this.getArrayList(), nomeC);
                break;
            case MAIOR_NOME:
                Collections.sort(this.getArrayList(), nomeC.reversed());
                break;
            case MENOR_PESO:
                Collections.sort(this.getArrayList(), pesoc);
                break;
            case MAIOR_PESO:
                Collections.sort(this.getArrayList(), pesoc.reversed());
                break;
            case MENOR_ALTURA:
                Collections.sort(this.getArrayList(), alturaC.reversed());
                break;    
            case MAIOR_ALTURA:
                Collections.sort(this.getArrayList(), alturaC);
                break;
            case MENOR_IMC:
                Collections.sort(this.getArrayList(), imcC);
                break;
            case MAIOR_IMC:
                Collections.sort(this.getArrayList(), imcC.reversed());
                break;
            case H_M:
                Collections.sort(this.getArrayList(), hmC);
                break;
            case M_H:
                Collections.sort(this.getArrayList(), hmC.reversed());
                break;    
        }
        return this.getArrayList();
    }
        
}
