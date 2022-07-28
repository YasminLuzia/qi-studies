import java.util.Scanner;
/**
 *
 * @author Yasmin
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        Pessoa p1=new Pessoa();
        
        byte menu;
        do{
            System.out.println("Digite a operação desejada: "
                    + "\n1- Cadastrar pessoa"
                    + "\n2- Ver dados"
                    + "\n3- Editar nome"
                    + "\n4- Editar cidade"
                    + "\n0- Sair");
            menu=leia.nextByte();
            switch(menu){
                case 1:
                    
                    System.out.println("\nGerando número da conta...");
                    int geraNumero=(int)(Math.random()*100+1);
                    System.out.println("Seu número da conta é: "+geraNumero);
                    p1.setCodigo(geraNumero);
                    
                    do{
                        System.out.println("\nCadastre o nome: ");
                        leia.nextLine();
                        p1.setNome(leia.nextLine());
                        if(p1.getNome().length()<2){
                            System.out.println("Erro!!");
                        }
                    }while(p1.getNome().length()<2);
                    
                    do{
                        System.out.println("\nCadastre o CPF: ");
                        p1.setCpf(leia.nextLine());
                        if(p1.getCpf().length()!=11){
                            System.out.println("Erro!! CPF precisa ser 11 digitos.");
                        }
                    }while(p1.getCpf().length()!=11);
                    
                    System.out.println("\nCadastrando data de nascimento...");
                    Data d1 = new Data();
                    do{
                        System.out.println("Digite o dia que nasceu: ");
                        d1.setDia(leia.nextByte());
                        System.out.println("Digite o mês que nasceu: ");
                        d1.setMes(leia.nextByte());
                        System.out.println("Digite o ano que nasceu: ");
                        d1.setAno(leia.nextInt());
                        if(d1.validaData()==false){
                        System.out.println("Erro!!");
                    }
                    }while(d1.validaData()==false);
                    p1.setData(d1);//inserindo data na pessoa NÃO ESQUECER
                    
                    System.out.println("\nCadastrando endereço... ");
                    Endereco e1=new Endereco();
                    System.out.println("Digite a cidade: ");
                    leia.nextLine();
                    e1.setCidade(leia.nextLine());
                    p1.setEndereco(e1);
                    
                    System.out.println("\nCadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println(p1);
                    break;
                case 3:
                    System.out.println("\nEdite o nome: ");
                    leia.nextLine();
                    p1.setNome(leia.nextLine());
                    System.out.println("Editado com sucesso!!");
                    break;
                case 4:
                    System.out.println("\nEdite a cidade: ");
                    leia.nextLine();
                    p1.getEndereco().setCidade(leia.nextLine());
                    System.out.println("Cidade editada com  sucesso!");
                    break;
                case 0:
                    System.out.println("\nTchau!!");
                    break;
                default:
                    System.out.println("\nErro!!");
            }
        }while(menu!=0);
        
    }
    
}