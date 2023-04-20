
package receita_Federal;
import receita_Federal.Format;


public class Atendente extends Funcionario{
    private String setor;
    private Fisica fisica;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Fisica getFisica() {
        return fisica;
    }

    public void setFisica(Fisica fisica) {
        this.fisica = fisica;
    }

    public Atendente(int matricula, String nome, Double salario, Endereco endereco, String setor, Fisica fisica) {
        super(matricula, nome, salario, endereco);
        this.setor = setor;
        this.fisica = fisica;
    }
    
    public Double calculaSalario(){
        Double salario= this.salario+(this.salario*0.15);
        return salario;
       
    }
    
    public String toString(){
        return "\u27A5ATENDENTE"+
                "\n     Matrícula: "+getMatricula()+
                "\n     Nome: "+getNome()+
                "\n     Setor: "+getSetor()+
                getEndereco()+
                getFisica()+
                "\n     Salário: "+f.df(calculaSalario());
        
    }
    Format f = new Format();
    
}
