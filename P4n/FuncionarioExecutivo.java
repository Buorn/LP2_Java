public class FuncionarioExecutivo extends FuncionarioContratado{
    //Atributos
    private final float gratificacao;
    private Object isExecutivo;
    
    //Metodo Especial - Construtor
    public FuncionarioExecutivo(String n, String c, float s, int nDep, float grat) {
        super(n, c, s, nDep);
        this.gratificacao = grat;
    }
    
    //Metodos Getters
    public float getGratificacao() {
        return gratificacao;
    }
    
    //Metodos
    
    public void calculaSalario(boolean t){
        if(this.getDependentes()==0){
            super.calculaSalario();
            this.salarioLiquido += this.gratificacao;
        }else{
            super.calculaSalario(this.getDependentes());
            this.salarioLiquido += this.gratificacao;
        }
    }
    @Override
    public String toString(){
            return super.toString() + "\n"+ String.format("Gratificacao: %.2f",this.getGratificacao()) + "\n" + "----";

    }
}
