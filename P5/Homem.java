public class Homem extends PessoaIMC {
    //Metodo Especial Construtor
    public Homem(String n, String dtNasc, double p, double a) {
        super(n, dtNasc, p, a);
        this.nome = n;
        this.dataNascimento = dtNasc;
        this.peso = p;
        this.altura = a;
    }
    //Metodos
    @Override
    public String resultIMC() {
        if (super.calculaIMC(this.getPeso(), this.getAltura()) < 20.7) {
            return "Abaixo do Peso Ideal!";
        }else if(super.calculaIMC(this.getPeso(), this.getAltura()) > 26.4){
            return "Acima do Peso Ideal!";
        }else{
            return "Peso Ideal!";
        }
    }
        
    @Override
    public String toString(){
        return super.toString() + " " + this.resultIMC() + "\n" + "----";
    }
    
}