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
        do{
            System.out.println("1- Cadastrar salários"
                    + "\n2- Ver salários"
                    + "\n3- Ver primeiro salário"
                    + "\n4- Ver último salário"
                    + "\n5- Ver média de salário"
                    + "\n0- Sair");
            menu=leia.nextByte();
            switch(menu){
                case 1:
                    System.out.println("Cadastrando...");
                    double salario;
                    for(int i=0; i<c1.getSalarios().length;i++){
                        System.out.println("Digite o "+(i+1)+"º salário: ");
                        salario=leia.nextDouble();
                        c1.cadastrarSalario(i, salario);
                        System.out.println("Cadastrado com sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("Visualizando...");
                    System.out.println(c1);
                    break;
                case 3:
                    System.out.println("Primeiro salário...");
                    System.out.println("O primeiro salário é R$ "+c1.verPrimeiroSalario());
                    break;
                case 4:
                    System.out.println("Último salário...");
                    System.out.println("O último salário é R$ "+c1.verUltimoSalario());
                    break;
                case 5:
                    System.out.println("Calculando média...");
                    System.out.println("A média dos salários é R$ "+c1.calcularMediaSalarios());
                    break;
                case 0:
                    System.out.println("Obrigada volte sempre");
                    break;
                default:
                    System.out.println("Erro!! Opção inválida.");
            }
        }while(menu!=0);
    }
    
}
