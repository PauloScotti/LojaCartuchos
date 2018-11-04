
package lojacartuchos;

import java.util.Scanner;

public class Funcionarios extends DadosCadastro {
    public void CadastroFuncionario() {
        Scanner scam = new Scanner(System.in);
        setCodigo(this.getCodigo()+1);
        System.out.println("Nome do Funcionário");
        setNome(scam.next());
        System.out.println("Logradouro do Funcionário");
        setLogradouro(scam.next());
        System.out.println("Número do imóvel");
        setNumero(scam.next());
        System.out.println("Complemento");
        setComplemento(scam.next());
        System.out.println("Bairro");
        setBairro(scam.next());
        System.out.println("Cidade");
        setCidade(scam.next());
        System.out.println("CEP");
        setCep(scam.next());
        System.out.println("Telefone");
        setTelefone(scam.next());
        System.out.println("E-mail");
        setEmail(scam.next());

    }
}
