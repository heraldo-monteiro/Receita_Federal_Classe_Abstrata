
package receita_Federal;
import receita_Federal.Format;

public class Deducao {
    private int codigo;
    private String descricao; 
    protected static Double valor;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Deducao(int codigo, String descricao, Double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }
    //--------------------------------------------------------------------------    
    public static Double calculaDeducao(){
        Double deducao = valor*0.012;
        return deducao;
    }
    
    public String toString(){
        return "\n     Dedução"+
                "\n     Code: "+getCodigo()+
                "\n     Description: "+getDescricao()+  
                "\n     Valor: R$ "+getValor()+
                "\n     Valor da Dedução: R$ "+calculaDeducao();       
    } 
    Format f = new Format();
}
