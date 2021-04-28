public class FuncionarioContratado extends Funcionario{
    //Atributos
    private int dependentes;
    private float salarioFamilia;
    protected final float VALORPORDEP = 9.58f;
    protected final float ALIQUOTA = 0.15f; //15 porcento

    //Metodo Especial - Construtor
    public FuncionarioContratado(String n, String c, float s, int nDep){
        super(n, c, s);
        this.dependentes = nDep;
    }
    //Metodos Getters
    public int getDependentes(){
        return this.dependentes;
    }

    public float getSalarioFamilia(){
        return this.salarioFamilia;
    }
    
    //Metodos
    public void calculaSalario(){
        super.calculaSalario(this.ALIQUOTA);
    }

    public void calculaSalario(int numeroDependentes){
        this.salario += numeroDependentes * this.VALORPORDEP;   
        calculaSalario();  
    }

    @Override
    public String toString(){
        return super.toString() + "\n"+ String.format("Salario-Liquido: %.2f",this.salarioLiquido);
    }
} 
