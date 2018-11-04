
package lojacartuchos;

import java.util.Scanner;

public class LojaCartuchos {

    public static void main(String[] args) {
        int opcoes = 20;
        Clientes c1 = new Clientes();
        Fornecedor f1 = new Fornecedor();
        Funcionarios func1 = new Funcionarios();
        Scanner s1 = new Scanner(System.in);
        
        while(opcoes!=0) {
            System.out.println("-------------------------------");
            System.err.println("---- Menu de Cadastros --------");
            System.out.println("--- 01-Cadastrar Cliente ------");
            System.out.println("--- 02-Cadastrar Fornecedor ---");
            System.out.println("--- 03-Cadastrar Funcionário --");
            System.out.println("--- 04-Registrar Pedidos ------");
            System.out.println("--- 0-Para Encerrar -----------");
            System.out.println("--- Digite a opção desejada ---");
            opcoes = s1.nextInt();

            switch(opcoes) {
            case 0:
                System.out.println("Fim do programa!!");
            break;
            
            case 1:
                c1.CadastroCliente();
            break;
            
            case 2:
                f1.CadastroFornecedor();
            break;
            
            case 3:
                func1.CadastroFuncionario();
            break;
        }
    }
    } 
}
