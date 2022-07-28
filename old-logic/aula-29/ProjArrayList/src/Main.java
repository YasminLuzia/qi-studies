import java.util.Scanner;
/**
 *
 * @author Yasmin
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        Cadastro c1=new Cadastro();
        
        byte menu;
        System.out.println("Digite a opção desejada:"
                + "\n1- Cadastrar Pessoa" +
                  "\n2- Ver Cadastros" +
                  "\n3- Ver Quantidade de Pessoas cadastradas" +
                  "\n4- Excluir cadastro" +
                  "\n5- Editar cadastro (apenas a idade)" +
                  "\n0- Sair");
        menu=leia.nextByte();
        switch(menu){
            case 1:
                System.out.println("Cadastrando...");
                Pessoa p1=new Pessoa();//instanciando Pessoa
                System.out.println("Digite o nome: ");
                leia.nextLine();
                p1.setNome(leia.nextLine());//setando o nome
                
                do{//validando cpf
                    System.out.println("Digite o CPF: ");
                    p1.setCpf(leia.nextLine());//setando cpf
                    if(p1.getCpf().length()!=11){
                        System.out.println("Erro!! Seu CPF precisa de 11 digitos.");
                    }
                }while(p1.getCpf().length()!=11);
                
                Endereco e1=new Endereco();//instanciando Endereço
                System.out.println("Informe seu endereço... ");
                System.out.println("Digite a cidade: ");
                e1.setCidade(leia.nextLine());//setando cidade
                System.out.println("Digite o estado: ");
                e1.setEstado(leia.nextLine());//setando estado
                
                p1.setEndereco(e1);//colocando Endereco em Pessoa
                
                do{//validando idade
                    System.out.println("Digite a idade: ");
                    p1.setIdade(leia.nextInt());//setando idade
                    if(p1.getIdade()<0){
                        System.out.println("Erro! Idade não pode ser negativa.");
                    }
                }while(p1.getIdade()<0);
                
                c1.cadastrar(p1);//colocando CADASTRO NO ARRAYLIST
                
                System.out.println("Cadastro efetuado com sucesso!");
                
                break;
            case 2:
                System.out.println("Visualizando...");
                if(c1.getLista().isEmpty()){
                    System.out.println("Não há cadastros.");
                }else{
                    System.out.println(c1);
                }
                break;
            case 3:
                System.out.println("Quantidade...");
                if(c1.getLista().isEmpty()){
                    System.out.println("Não há cadastros.");
                }else{
                    System.out.println("Total de cadastros: "+c1.verQuantidade());
                }
                break;
            case 4:
                System.out.println("Excluindo...");
                
                break;
            case 5:
                
                break;
            case 0:
                System.out.println("Volte sempre!");
                break;
            default:
                System.out.println("Erro!! Opção inválida.");
        }
    }
    
}