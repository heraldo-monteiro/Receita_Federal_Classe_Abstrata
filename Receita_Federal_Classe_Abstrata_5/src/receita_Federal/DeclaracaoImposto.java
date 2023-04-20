
package receita_Federal;

public abstract class DeclaracaoImposto {
    private int numero;
    private int ano;
    protected static Double valorDeclarado;
    private Bens bens;
    private Deducao deducao;
    private Pagamento pagamento;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Double getValorDeclarado() {
        return valorDeclarado;
    }

    public void setValorDeclarado(Double valorDeclarado) {
        this.valorDeclarado = valorDeclarado;
    }

    public Bens getBens() {
        return bens;
    }

    public void setBens(Bens bens) {
        this.bens = bens;
    }

    public Deducao getDeducao() {
        return deducao;
    }

    public void setDeducao(Deducao deducao) {
        this.deducao = deducao;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public DeclaracaoImposto(int numero, int ano, Double valorDeclarado, Bens bens, Deducao deducao, Pagamento pagamento) {
        this.numero = numero;
        this.ano = ano;
        this.valorDeclarado = valorDeclarado;
        this.bens = bens;
        this.deducao = deducao;
        this.pagamento = pagamento;
    }
    /*
    public String toString(){
        return "Declaração de Imposto"+
                "\n     Número: "+getNumero()+
                "       A"+getAno()+
                "       Valor do Imposto Declarado: "+getValorDeclarado()+
                getBens()+  
                getDeducao()+   
                getPagamento();
    }   
    */
    
}
