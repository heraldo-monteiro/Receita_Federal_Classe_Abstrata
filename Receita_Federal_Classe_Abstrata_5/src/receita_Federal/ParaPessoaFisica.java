
package receita_Federal;
import receita_Federal.Format;

public class ParaPessoaFisica extends DeclaracaoImposto{
    private Double multa;
    private Dependente dependente;

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Dependente getDependente() {
        return dependente;
    }

    public void setDependente(Dependente dependente) {
        this.dependente = dependente;
    }
    //----- Construtor ---------------------------------------------------------
    public ParaPessoaFisica(Double multa, Dependente dependente, int numero, int ano, Double valorDeclarado, Bens bens, Deducao deducao, Pagamento pagamento) {
        super(numero, ano, valorDeclarado, bens, deducao, pagamento);
        this.multa = multa;
        this.dependente = dependente;
    }
    //----- Métodos de Serviços ------------------------------------------------   
    public Double calculaParcial(){
        Double valor_Parcial = DeclaracaoImposto.valorDeclarado + Bens.valor + Bens.calculaTarifacao();
        return valor_Parcial;        
    }            
           
    public Double calculaDesconto(){
        Double v_Desconto =  DeclaracaoImposto.valorDeclarado - Pagamento.calculaTaxa()- Deducao.calculaDeducao();
        return v_Desconto;
        
    }            
            
    public Double calculaImpostoPessoaFisica(){
        Double impost_PF = DeclaracaoImposto.valorDeclarado + ParaPessoaJuridica.calculaParcial() - calculaDesconto();
        return impost_PF;
        
    }
    
    //----- Saída de Dados -----------------------------------------------------    
    public String toString(){
        return "\n\u27A5Declaração de Imposto Pessoa Fisica"+
                "\n     Número: "+getNumero()+
                "\n     Ano: "+getAno()+
                "\n     Qnt.Dependentes: "+getDependente()+
                "\n     Valor da Declaração: "+f.df(getValorDeclarado())+
                getBens()+
                getDeducao()+
                getPagamento()+
                "\n     Valor Parcial: R$ "+f.df(calculaParcial())+
                "\n     Valor do Desconto: R$ "+f.df(calculaDesconto())+
                "\n     Valor do Imposto: R$ "+f.df(calculaImpostoPessoaFisica());
    }
   
    Format f = new Format();
    
}
