import java.util.Scanner;
/**
 *
 * @author Yasmin
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        Idades i1=new Idades();
        
        byte menu;
        do{
            System.out.println("Digite:"
                    + "\n1- Cadastrar idades"
                    + "\n2- Ver idades"
                    + "\n3- Ver a primeira idade"
                    + "\n4- Ver a ultima idade"
                    + "\n5- Ver a média das idades"
                    + "\n6- Ver a maior idade"
                    + "\n7- Ver a menor idade"
                    + "\n0- Sair");
            menu=leia.nextByte();
            switch(menu){
                case 1:
                    System.out.println("Cadastrando...");
                    int idade;
                    for(int i=0; i<i1.getIdades().length;i++){
                        do{
                            System.out.println("Digite a "+(i+1)+"º idade: ");
                            idade=leia.nextInt();
                            if(idade<0){
                                System.out.println("Você não pode ter idade negativa!");
                            }
                        }while(idade<0);
                        i1.cadastrar(i, idade);
                        System.out.println("Cadastrado com sucesso!");
                    }
                    break;
                case 2:
                    System.out.println("Visualizando...");
                    System.out.println(i1);
                    break;
                case 3:
                    System.out.println("Visualizando a primeira idade...");
                    System.out.println(i1.verPrimeira());
                    break;
                case 4:
                    System.out.println("Visualizando a ultima idade...");
                    System.out.println(i1.verUltima());
                    break;
                case 5:
                    System.out.println("Calculando a média...");
                    System.out.println(i1.calcularMedia());
                    break;
                case 6:
                    System.out.println("Visualizando a maior idade...");
                    System.out.println(i1.verMaior());
                    break;
                case 7:
                    System.out.println("Visualizando a menor idade...");
                    System.out.println(i1.verMenor());
                    break;
                case 0:
                    System.out.println("Volte sempre!");
                    break;
                default:
                    System.out.println("Erro! Opção inválida!");
            }
        }while(menu!=0);
    }
    
}