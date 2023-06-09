
package receita_Federal;

public class Fisica  extends Pessoa{
    private String cpf;
    private ParaPessoaFisica paraPessoaFisica;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public ParaPessoaFisica getParaPessoaFisica() {
        return paraPessoaFisica;
    }

    public void setParaPessoaFisica(ParaPessoaFisica paraPessoaFisica) {
        this.paraPessoaFisica = paraPessoaFisica;
    }

    public Fisica(String nome, String cpf, Endereco endereco , ParaPessoaFisica paraPessoaFisica) {
        super(nome, endereco);
        this.cpf = cpf;
        this.paraPessoaFisica = paraPessoaFisica;
    }
    
    public String toString(){
        return "\n   - Pessoa Fisica"+
                "\n     Nome: "+getNome()+
                "\n     CPF: "+getCpf()+
                "\n     Endereço: "+getEndereco()+
                getParaPessoaFisica();
        
    }
    
    
}
