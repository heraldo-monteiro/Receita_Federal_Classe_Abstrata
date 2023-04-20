
package receita_Federal;

public class Juridica extends Pessoa{
    private String cnpj;
    private ParaPessoaJuridica paraPessoaJuridica;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public ParaPessoaJuridica getParaPessoaJuridica() {
        return paraPessoaJuridica;
    }

    public void setParaPessoaJuridica(ParaPessoaJuridica paraPessoaJuridica) {
        this.paraPessoaJuridica = paraPessoaJuridica;
    }

    public Juridica(String nome, String cnpj, Endereco endereco, ParaPessoaJuridica paraPessoaJuridica) {
        super(nome, endereco);
        this.cnpj = cnpj;
        this.paraPessoaJuridica = paraPessoaJuridica;
    }
   
    public String toString() {
        return "   - Pessoa Juridica"+
                "\n     nome: "+getNome()+
                "\n     CNPJ: "+getCnpj()+
                getEndereco()+
                getParaPessoaJuridica();
    }    
         
}
