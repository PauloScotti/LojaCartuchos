package lojacartuchos;

public class RegistroPedido {
    private int NumeroPedido;
    private String DataPedido;
    private String Vendedor;
    private String Cliente;
    private String Produto;
    private int Quantidade;
    private String MarcaModelo;
    private String FormaPagto;

    public RegistroPedido(int NumeroPedido, String DataPedido, String Vendedor, String Cliente, String Produto, int Quantidade, String MarcaModelo, String FormaPagto) {
        this.NumeroPedido = NumeroPedido;
        this.DataPedido = DataPedido;
        this.Vendedor = Vendedor;
        this.Cliente = Cliente;
        this.Produto = Produto;
        this.Quantidade = Quantidade;
        this.MarcaModelo = MarcaModelo;
        this.FormaPagto = FormaPagto;
    }

    public RegistroPedido() {
    }

    
    
    public int getNumeroPedido() {
        return NumeroPedido;
    }

    public void setNumeroPedido(int NumeroPedido) {
        this.NumeroPedido = NumeroPedido;
    }

    public String getDataPedido() {
        return DataPedido;
    }

    public void setDataPedido(String DataPedido) {
        this.DataPedido = DataPedido;
    }

    public String getVendedor() {
        return Vendedor;
    }

    public void setVendedor(String Vendedor) {
        this.Vendedor = Vendedor;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int Quantidade) {
        this.Quantidade = Quantidade;
    }

    public String getMarcaModelo() {
        return MarcaModelo;
    }

    public void setMarcaModelo(String MarcaModelo) {
        this.MarcaModelo = MarcaModelo;
    }

    public String getFormaPagto() {
        return FormaPagto;
    }

    public void setFormaPagto(String FormaPagto) {
        this.FormaPagto = FormaPagto;
    }
    
    
}
