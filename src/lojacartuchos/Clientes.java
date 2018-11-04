
package lojacartuchos;

public class Clientes extends DadosCadastro {
    private String RgInscEst;
    private String CpfCnpj;

    public Clientes() {
    }

    public Clientes(String RgInscEst, String CpfCnpj) {
        this.RgInscEst = RgInscEst;
        this.CpfCnpj = CpfCnpj;
    }

    
    
    public String getRgInscEst() {
        return RgInscEst;
    }

    public void setRgInscEst(String RgInscEst) {
        this.RgInscEst = RgInscEst;
    }

    public String getCpfCnpj() {
        return CpfCnpj;
    }

    public void setCpfCnpj(String CpfCnpj) {
        this.CpfCnpj = CpfCnpj;
    }
    
    
}
