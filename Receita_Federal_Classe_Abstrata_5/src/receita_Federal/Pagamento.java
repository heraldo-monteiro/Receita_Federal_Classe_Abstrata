
package receita_Federal;
import receita_Federal.Format;

public class Pagamento {
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

    public Pagamento(int codigo, String descricao, Double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public static Double calculaTaxa(){
        Double taxa= valor*0.03;
        return taxa;
    }
    
    @Override
    public String toString(){
        return "\n   - Pagamento"+
                "\n     Code: "+getCodigo()+
                "\n     Descrição: "+getDescricao()+
                "\n     Taxa: R$ "+f.df(calculaTaxa());
    }
    Format f = new Format();
}
