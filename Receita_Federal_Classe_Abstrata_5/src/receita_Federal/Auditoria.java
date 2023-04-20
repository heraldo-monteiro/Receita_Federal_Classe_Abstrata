
package receita_Federal;


public class Auditoria {
    private int numero;
    private String data;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Auditoria(int numero, String data) {
        this.numero = numero;
        this.data = data;
    }
    
    public String toString(){
        return "\n   - Auditoria"+
                "\n     Número: "+getNumero()+
                "\n     Data: "+getData();
        
    }
    
}
