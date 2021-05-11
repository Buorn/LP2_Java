abstract class PessoaIMC extends Pessoa {
    //Atributos
    protected double peso;
    protected double altura;
    protected double imc;
 
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
        return this.peso;
    }

    public double getAltura() {
        return this.altura;
    }
    
    public double getImc() {
        return this.imc;
    }
    //Metodos
    public double calculaIMC(double p, double a){
        return this.imc = p/(a*a);
    }
    abstract String resultIMC();
    
    @Override
    public String toString(){
        return super.toString() + "\n" + 
               String.format("Peso: %.2f", this.getPeso()) + "\n" + 
               String.format("Altura: %.2f", this.getAltura()) + "\n" +
               String.format("IMC: %.2f", this.calculaIMC(this.getPeso(), this.getAltura()));
    }
}