package lojacartuchos;

public class FormasPagamento {
    private int Codigo;
    private String Nome;

    public FormasPagamento() {
    }

    public FormasPagamento(int Codigo, String Nome) {
        this.Codigo = Codigo;
        this.Nome = Nome;
    }

    
    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    
    
}
