public class Pessoa {
    //Atributos
    protected String nome;
    protected String dataNascimento;
    
    //Metodo Especial Construtor
    protected Pessoa(String n, String dtNasc) {
        this.nome = n;
        this.dataNascimento = dtNasc;
    }
    
    //Metodos Getters
    public String getNome() {
        return nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }
    
    //Metodos
    @Override
    public String toString() {
        return "nome: " + this.getNome() + "\n" + 
               "data de Nascimento: " + this.getDataNascimento();
    }
}
