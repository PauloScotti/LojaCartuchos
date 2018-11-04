
package lojacartuchos;

public class Fornecedor {
    private String NomeProduto;
    private String DataValidade;
    private int CodigoProduto;
    private String Fornecedor;
    private String ModeloEspecificacoes;

    public String getNomeProduto() {
        return NomeProduto;
    }

    public void setNomeProduto(String NomeProduto) {
        this.NomeProduto = NomeProduto;
    }

    public String getDataValidade() {
        return DataValidade;
    }

    public void setDataValidade(String DataValidade) {
        this.DataValidade = DataValidade;
    }

    public int getCodigoProduto() {
        return CodigoProduto;
    }

    public void setCodigoProduto(int CodigoProduto) {
        this.CodigoProduto = CodigoProduto;
    }

    public String getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    public String getModeloEspecificacoes() {
        return ModeloEspecificacoes;
    }

    public void setModeloEspecificacoes(String ModeloEspecificacoes) {
        this.ModeloEspecificacoes = ModeloEspecificacoes;
    }
    
    
}
