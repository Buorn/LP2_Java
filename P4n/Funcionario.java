public class Funcionario {
    //Atributos
    private String nome;
    private String codigo;
    protected float salario;
    protected float salarioLiquido;
    //Metodo Especial - Construtor
    public Funcionario(String n, String c, float s){
        this.nome = n;
        this.codigo = c;
        this.salario = s;
        this.salarioLiquido = s;
    }
    //Metodos Getters
    public String getNome(){
        return this.nome;
    }

    public String getCodigo(){
        return this.codigo;
    }

    public float getSalario(){
        return this.salario;
    }
    public float getSalarioLiquido(){
        return this.salarioLiquido;
    }
    //Metodos
    public void calculaSalario(float desconto){
        this.salarioLiquido = this.salario*( 1 - desconto); 
    }
        
    @Override
        public String toString(){
            return "Nome: " + this.nome + "\n" + "Codigo: "+this.cod
