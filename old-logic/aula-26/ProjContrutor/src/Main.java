import java.util.Scanner;
/**
 *
 * @author Yasmin
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        Aluno a1=new Aluno();
        
        byte opcao;
        int aulas;
            do{
                System.out.println("Digite o numero de aulas: ");
                aulas=leia.nextInt();
                if(aulas<0){
                    System.out.println("Erro!!");
                }
            }while(aulas<0);
        do{
            System.out.println("Selecione a opção:"
                    + "\n1- Cadastrar"
                    + "\n2- Visualizar dados"
                    + "\n3- Vizualizar média"
                    + "\n4- Vizualizar frequência"
                    + "\n5- Conceito final"
                    + "\n0- Sair");
            opcao=leia.nextByte();
            
            switch(opcao){
                case 1:
                    
                    do{
                        System.out.println("Digite o nome do aluno: ");
                        leia.nextLine();
                        a1.setNome(leia.nextLine());
                        if(a1.getNome().length()<2){
                            System.out.println("Erro!!");
                        }
                    }while(a1.getNome().length()<2);
                    do{
                        System.out.println("Digite o CPF: ");
                        a1.setCpf(leia.nextLine());
                        if(a1.getCpf().length()!=11){
                            System.out.println("Erro!!");
                        }
                    }while(a1.getCpf().length()!=11);
                    
                    do{
                        System.out.println("Digite o telefone: ");
                        a1.setTelefone(leia.nextLine());
                        if(a1.getTelefone().length()<8){
                            System.out.println("Erro!!");
                        }
                    }while(a1.getTelefone().length()<8);
                    
                    
                    //pedindo o endereço
                    
                    System.out.println("Informe seu endereço: ");
                    Endereco e1=new Endereco();
                    
                    System.out.println("Digite a rua: ");
                    e1.setRua(leia.nextLine());
                    
                    System.out.println("Digite o número: ");
                    e1.setNumero(leia.nextLine());
                    
                    System.out.println("Digite a cidade: ");
                    e1.setCidade(leia.nextLine());
                    
                    //inserindo o endereço no aluno
                    a1.setEndereco(e1);
                    
                    
                    do{
                        System.out.println("Digite a nota 1: ");
                        a1.setNota1(leia.nextDouble());
                        if(a1.getNota1()<0 || a1.getNota1()>10){
                            System.out.println("Erro!!");
                        }
                    }while(a1.getNota1()<0 || a1.getNota1()>10);
                    
                    do{
                        System.out.println("Digite a nota 2: ");
                        a1.setNota2(leia.nextDouble());
                        if(a1.getNota2()<0 || a1.getNota2()>10){
                            System.out.println("Erro!!");
                        }
                    }while(a1.getNota2()<0 || a1.getNota2()>10);
                    
                    do{
                        System.out.println("Digite as faltas: ");
                        a1.setFaltas(leia.nextInt());
                        if(a1.getFaltas()<0){
                            System.out.println("Erro!!");
                        }
                    }while(a1.getFaltas()<0);
                    
                    //data nascimento
                    do{
                        System.out.println("Informe sua data de nascimento: ");
                        Data d1=new Data();
                        
                        System.out.println("Digite o dia: ");
                        d1.setDia(leia.nextByte());
                        System.out.println("Digite o mês");
                        d1.setMes(leia.nextByte());
                        System.out.println("Digite o ano: ");
                        d1.setAno(leia.nextInt());
                        if(d1.)
                    }while()
                    
                    break;
                    
                case 2:
                    
                    System.out.println(a1);
                    break;
                    
                case 3:
                    
                    System.out.println("A media do aluno é "+a1.calcularMedia());
                    break;
                    
                case 4:
                    
                    System.out.println("A frequencia do aluno é de "+a1.calcularFrequencia(aulas)+"%");
                    break;
                    
                case 5:
                    
                    System.out.println("Seu conceito é: "+a1.conceito(aulas));
                    break;
                    
                case 0:
                    
                    System.out.println("Tchau!!");
                    break;
                    
                default:
                    System.out.println("Erro!! Opção inválida!");
                    
            }
            
        }while(opcao!=0);
        
    }
    
}