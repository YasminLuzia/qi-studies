import java.util.Scanner;
/*
 * @author Yasmin
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        Valida v1=new Valida();
        Pessoa p1=new Pessoa();
        
        byte dia; byte mes; int ano;
        do{
            System.out.println("Informe a data atual: ");
            System.out.println("Digite o dia: ");
            dia=leia.nextByte();
            System.out.println("Digite o mês atual: ");
            mes=leia.nextByte();
            System.out.println("Digite o ano atual: ");
            ano=leia.nextInt();
            if(v1.validaData(dia, mes, ano)==false){
                System.out.println("ERRO DATA INVALIDA");
            }
        }while(v1.validaData(dia, mes, ano)==false);
        
        byte menu;
        
        do{
            System.out.println("Escolha: "
                    + "\n1- Informar dados"
                    + "\n2- Ver dados"
                    + "\n3- Calcular idade"
                    + "\n0- Sair");
            menu=leia.nextByte();
            switch(menu){
                case 1:
                    System.out.println("Informando dados: ");
                    System.out.println("Digite o nome: ");
                    leia.nextLine();
                    p1.setNome(leia.nextLine());
                    
                    do{
                        System.out.println("Digite o CPF: ");
                        p1.setCpf(leia.nextLine());
                        if(v1.validaCpf(p1.getCpf())==false){
                            System.out.println("ERRO CPF INVALIDO");
                        }
                    }while(v1.validaCpf(p1.getCpf())==false);
                    
                    do{
                        System.out.println("Informe a data de nascimento: ");
                        System.out.println("Digite o dia que nasceu: ");
                        p1.setDiaNasceu(leia.nextByte());
                        System.out.println("Digite o mês que nasceu: ");
                        p1.setMesNasceu(leia.nextByte());
                        System.out.println("Digite o ano em que nasceu: ");
                        p1.setAnoNasceu(leia.nextInt());
                        if(v1.validaData(p1.getDiaNasceu(), p1.getMesNasceu(), p1.getAnoNasceu())==false){
                            System.out.println("ERRO DATA INVALIDA");
                        }
                    }while(v1.validaData(p1.getDiaNasceu(), p1.getMesNasceu(), p1.getAnoNasceu())==false);
                    break;
                case 2:
                    System.out.println("Visualizando...");
                    System.out.println(p1);
                case 3:
                    System.out.println("Calculando idade...");
                    System.out.println("Idade: "+p1.calcularIdade(dia, mes, ano));
                    break;
                case 0:
                    System.out.println("Bah, Felicia!");
                    break;
                default:
                    System.out.println("ERRO!");
            }
        }while(menu!=0);
    }
    
}