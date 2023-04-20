
package receita_Federal;

public class TestaReceita_Federal {
    // Auditor , atendente e juridica
  
    public static void main(String[] args) {
        Auditor auditor = new Auditor(10002023, "nome", 6897.92, 
                new Endereco("St. QNG 4", 102), 328.98, 
                    new Auditoria(10056, "data")); 
                    System.out.println(auditor);    
        
        Atendente atendente = new Atendente(20002023, "nome", 2232.84, 
                new Endereco("St.QNM", 406), "setor", 
                    new Fisica("Heraldo Monteiro", "000.000.000-10", 
                        new Endereco("QI", 612), 
                            new ParaPessoaFisica(0.0, 
                                new Dependente(4340010, "Maria Bia", 22), 100058, 2020, 260000.00, 
                                    new Bens(2358005, "Apartamento",260000.00), 
                                        new Deducao(689001, "Alimentação, Faculdade, Escola, Pensão", 62000.00), 
                                            new Pagamento(59000020, "Imposto sobre imóvel", 200000.00))));
                                            System.out.println(atendente);        
        
        Juridica juridica = new Juridica("Heralldo Monteiro", "00.000.000/0001-10", 
                new Endereco("QSI", 43), 
                    new ParaPessoaJuridica("observacao", 12458, 2023, 10000.00, 
                        new Bens(45689002, "descricao", 82000.00), 
                            new Deducao(40056001, "descricao", 1000.00), 
                                new Pagamento(1548005, "descricao", 4000.00)));
                                System.out.println(juridica);
        
    
    }
    
}
