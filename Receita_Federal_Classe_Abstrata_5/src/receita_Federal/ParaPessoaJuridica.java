
package receita_Federal;
import receita_Federal.Format;

public class ParaPessoaJuridica extends DeclaracaoImposto{
    private String observacao;

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }
    //----- Construtor ---------------------------------------------------------

    public ParaPessoaJuridica(String observacao, int numero, int ano, Double valorDeclarado, Bens bens, Deducao deducao, Pagamento pagamento) {
        super(numero, ano, valorDeclarado, bens, deducao, pagamento);
        this.observacao = observacao;
    }
    
    //----- Métodos de Serviços ------------------------------------------------
    public static Double calculaParcial(){
        Double v_Parcial = DeclaracaoImposto.valorDeclarado + (Bens.valor*2)+ Bens.calculaTarifacao();
        return v_Parcial;
        
    }
    public Double calculaImpostoPessoaJuridica(){
        Double imposto_PJ = calculaParcial() - Deducao.calculaDeducao() + Pagamento.valor + DeclaracaoImposto.valorDeclarado;
        return imposto_PJ;
        
    }
    
    //----- Saída de Dados -----------------------------------------------------
    public String toString(){
        return "\n\u27A5Declaraçã de Imposto Pessoa Juridica"+
                "\n     Número: "+getNumero()+ 
                "        Ano: "+getAno()+
                "\n     Valor da Declaração: R$"+getValorDeclarado()+                
                getBens()+
                getDeducao()+
                getPagamento()+
                "\n     Observação: "+getObservacao() +
                "\n     Valor Parcial: R$"+f.df(calculaParcial())+
                "\n     Valor do Imposto: "+f.df(calculaImpostoPessoaJuridica());       
        
    }    
    Format f = new Format();
   
   
    
    
}
