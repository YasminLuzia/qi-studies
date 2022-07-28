/**
 * Desenvolva um programa que controle um estoque de um supermercado.
   O mesmo cadastra produtos.
   Todo produto possui: codigo, nome, quantidade, valor, e data de vencimento (dia, mês e ano) e fornecedor. O fornecedor possui: nome, cpf e endereço (cidade e estado).
   Seu programa deve contemplar o menu abaixo:
   1 - Cadastrar Produto
   2 - Ver Cadastros
   3 - Ver Quantidade
   4 - Excluir Produto
   5 - Pesquisar pelo código
   6 - Pesquisar fornecedor por cpf
   7 - Pesquisar produtos de um fornecedor
   8 - Pesquisar produtos que vençam em dezembro de 2019
   9 - Pesquisar fornecedor de um produto
   10- Ver Total R$ em Estoque
   0- Sair
 */
import java.util.Scanner;
/**
 *
 * @author Yasmin
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner (System.in);
        
        Cadastro c1=new Cadastro();
        byte menu;
        do{
            System.out.println("1 - Cadastrar Produto" +
                    "\n2 - Ver Cadastros" +
                    "\n3 - Ver Quantidade" +
                    "\n4 - Excluir Produto" +
                    "\n5 - Pesquisar pelo código" +
                    "\n6 - Pesquisar fornecedor por cpf" +
                    "\n7 - Pesquisar produtos de um fornecedor" +
                    "\n8 - Pesquisar produtos que vençam em dezembro de 2019" +
                    "\n9 - Pesquisar fornecedor de um produto" +
                    "\n10- Ver Total R$ em Estoque" +
                    "\n0- Sair");
            menu=leia.nextByte();
            switch(menu){
                case 1:
                    System.out.println("Cadastrando...");
                    Produtos p1=new Produtos();
                    
                    //criando o código
                    int codigo;
                    if(c1.getLista().isEmpty()){
                        codigo=1;
                    }else{
                        int pegarUltimoCodigo = c1.getLista().get(c1.getLista().size()-1).getCodigo();//pegando list, pegando o tamanho da lista-1 e seu codigo
                        codigo=pegarUltimoCodigo++;
                        p1.setCodigo(codigo);
                    }
                    //fim código
                    
                    //pedindo nome do produto
                    System.out.println("Digite o nome do produto: ");
                    leia.nextLine();
                    p1.setNome(leia.nextLine());
                    //fim nome 
                    
                    //pedindo quantidade de produtos
                    System.out.println("Digite a quantidade: ");
                    p1.setQuantidade(leia.nextInt());
                    //fim quantidade
                    
                    //pedindo valor do produto
                    System.out.println("Digite o valor do produto: ");
                    p1.setValor(leia.nextDouble());
                    //fim produto
                    
                    //pedindo data de validade
                    Data d1=new Data();
                    System.out.println("Informando data de vencimento...");
                    System.out.println("Digite o dia: ");
                    d1.setDia(leia.nextByte());
                    System.out.println("Digite o mês: ");
                    d1.setMes(leia.nextByte());
                    System.out.println("Digite o ano: ");
                    d1.setAno(leia.nextInt());
                    //Adicionar data no produto
                    p1.setDataVencimento(d1);
                    //fim data de validade
                    
                    //pedindo fornecedor
                    Fornecedor f1=new Fornecedor();
                    System.out.println("Informando fornecedor...");
                    System.out.println("Digite o nome: ");
                    leia.nextLine();
                    f1.setNome(leia.nextLine());
                    System.out.println("Digite o CPF: ");
                    f1.setCpf(leia.nextLine());
                    
                    Endereco e1=new Endereco();
                    System.out.println("Informando endereço do fornecedor...");
                    System.out.println("Digite a cidade: ");
                    e1.setCidade(leia.nextLine());
                    System.out.println("Digite o estado: ");
                    e1.setEstado(leia.nextLine());
                    
                    f1.setEndereco(e1);
                    
                    p1.setFornecedor(f1);
                    
                    c1.cadastrar(p1);
                    
                    System.out.println("Cadastro efetuado com sucesso!!");
                    
                    break;
                case 2:
                    System.out.println("Visualizando...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há produtos.");
                    }else{
                        System.out.println(c1);
                    }
                    break;
                case 3:
                    System.out.println("Visualizando...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há produtos.");
                    }else{
                        System.out.println("Total de produtos: "+c1.verQuantidade());
                    }
                    break;
                case 4:
                    System.out.println("Excluindo...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há produtos.");
                    }else{
                        
                    }
                    break;
                case 5:
                    System.out.println("Pesquisando...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há produtos.");
                    }else{
                        
                    }
                    break;
                case 6:
                    System.out.println("Pesquisando...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há produtos.");
                    }else{
                        
                    }
                    break;
                case 7:
                    System.out.println("Pesquisando...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há produtos.");
                    }else{
                        
                    }
                    break;
                case 8:
                    System.out.println("Pesquisando...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há produtos.");
                    }else{
                        
                    }
                    break;
                case 9:
                    System.out.println("Pesquisando...");
                    if(c1.getLista().isEmpty()){
                        System.out.println("Não há produtos.");
                    }else{
                        
                    }
                    break;
                case 10:
                    System.out.println("Visualizando...");
                    
                    break;
                case 0:
                    System.out.println("Volte sempre!!");
                    break;
                default:
                    System.out.println("Erro!! Opção inválida.");
            }
        }while(menu!=0);
    }
    
}