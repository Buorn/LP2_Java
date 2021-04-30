abstract class PessoaIMC extends Pessoa {
    //Atributos
    protected double peso;
    protected double altura;
 
    //Metodos Especial Construtor
    public PessoaIMC(String n, String dtNasc, double p, double a) {
        super(n, dtNasc);
        this.nome = n;
        this.dataNascimento = dtNasc;
        this.peso = p;
        this.altura = a;
    }
    
    //Metodos Getters
    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
    //Metodos
    public double calculaIMC(double p, double a){
        return p/(a*a);
    }
    abstract String resultIMC();
    
    @Override
    public String toString(){
        return super.toString() + "\n" + 
               "Peso: " + this.getPeso() + "\n" + 
               "Altura: " + this.getAltura() + "\n" +
               String.format("IMC: %.2f", this.calculaIMC(this.getPeso(), this.getAltura()));
    }
}