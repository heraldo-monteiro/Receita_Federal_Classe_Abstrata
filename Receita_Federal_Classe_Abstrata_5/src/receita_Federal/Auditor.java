
package receita_Federal;
import receita_Federal.Format;

public class Auditor extends Funcionario{
    private Double gratificacao;
    private Auditoria auditoria;

    public Double getGratificacao() {
        return gratificacao;
    }

    public void setGratificacao(Double gratificacao) {
        this.gratificacao = gratificacao;
    }

    public Auditoria getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(Auditoria auditoria) {
        this.auditoria = auditoria;
    }

    public Auditor(int matricula, String nome, Double salario, Endereco endereco, Double gratificacao, Auditoria auditoria) {
        super(matricula, nome, salario, endereco);
        this.gratificacao = gratificacao;
        this.auditoria = auditoria;
    }
    
    public Double calculaSalario(){         
        Double salario= this.salario+(this.salario*gratificacao)+gratificacao;        
        return salario;
        
    }   
    
    public String toString(){
        return "\u27A5AUDITOR"+
                "\n     Matírcula: "+getMatricula()+
                "\n     Nome: "+getNome()+
                getEndereco()+
                "\n     Salário: "+f.df(getSalario())+
                "\n     Gratificação: "+f.df(getGratificacao())+
                "\n     Salário Liquido: "+f.df(calculaSalario())+
                getAuditoria();
    } 
    Format f = new Format();
    
}
