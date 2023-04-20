
package receita_Federal;
import java.text.*;

public class Format {
    Double valor;
    
    public  String df (Double valor){        
        return  df.format(valor);  
        
    }    
    DecimalFormat df = new DecimalFormat("#,##0.00");
}
