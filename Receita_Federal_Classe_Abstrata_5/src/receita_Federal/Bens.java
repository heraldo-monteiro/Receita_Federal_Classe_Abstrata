
package receita_Federal;
import receita_Federal.Format;

public class Bens {
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

    public Bens(int codigo, String descricao, Double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
    }
    
    public static Double calculaTarifacao(){
        Double tarifa= valor*0.15;
        return tarifa;
    }
    
    public String  toString(){
        return "\n     Bens"+
                "\n     Código: "+getCodigo()+
                "\n     Descrição: "+getDescricao()+
                "\n     Valor: "+f.df(getValor())+
                "\n     Tarifação: "+f.df(calculaTarifacao());        
    }
    Format f = new Format();
 
}
