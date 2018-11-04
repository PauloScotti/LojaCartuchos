
package lojacartuchos;

import java.util.Scanner;

public class Fornecedor {
    private String NomeProduto;
    private String DataValidade;
    private int CodigoProduto;
    private String Fornecedor;
    private String ModeloEspecificacoes;
    private double PrecoProduto;

    public Fornecedor() {
    }

    public Fornecedor(String NomeProduto, String DataValidade, int CodigoProduto, String Fornecedor, String ModeloEspecificacoes, double PrecoProduto) {
        this.NomeProduto = NomeProduto;
        this.DataValidade = DataValidade;
        this.CodigoProduto = CodigoProduto;
        this.Fornecedor = Fornecedor;
        this.ModeloEspecificacoes = ModeloEspecificacoes;
        this.PrecoProduto = PrecoProduto;
    }

    public void CadastroFornecedor(){
        Scanner scam = new Scanner(System.in);
        System.out.println("Nome do Fornecedor");
        setFornecedor(scam.next());
        System.out.println("Código do Produto");
        setCodigoProduto(scam.nextInt());
        System.out.println("Nome do Produto");
        setNomeProduto(scam.next());
        System.out.println("Data de Validade do Produto");
        setDataValidade(scam.next());
        System.out.println("Modelo / Especificações do Produto");
        setModeloEspecificacoes(scam.next());
    }

    
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

    public double getPrecoProduto() {
        return PrecoProduto;
    }

    public void setPrecoProduto(double PrecoProduto) {
        this.PrecoProduto = PrecoProduto;
    }
    
    
}
