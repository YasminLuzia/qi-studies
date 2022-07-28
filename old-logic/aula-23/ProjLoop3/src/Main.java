import java.util.Scanner;
/**
 *
 * @author Alunos
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        Numero n1=new Numero();
        
        byte escolha;//escolha do menu
        do{
            System.out.println("Escolha: "
                    + "\n1- Digite um número"
                    + "\n2- Ver número"
                    + "\n3- Ver tabuada"
                    + "\n4- Ver fatorial"
                    + "\n5- Ver somatório"
                    + "\n0- Sair");
            escolha=leia.nextByte();
            switch(escolha){
                case 1:
                    do{
                        System.out.println("Informando o numero...");
                        System.out.println("Dgite um nº: ");
                        n1.setNumero1(leia.nextInt());
                        if(n1.getNumero1()<0){
                            System.out.println("ERRO! Dados inválidos");
                        }
                    }while(n1.getNumero1()<0);
                    break;
                case 2:
                    System.out.println("Ver o numero...");
                    System.out.println(n1);
                    break;
                case 3:
                    System.out.println("Tabuada...");
                    int cont=1;
                    while(cont<=10){
                        System.out.println(n1.getNumero1()+" X "+cont+" = "+n1.calcularTabuada(cont));
                        cont++;
                    }
                    break;
                case 4:
                    System.out.println("Fatorando...");
                    System.out.println(n1.calcularFatorial());
                    break;
                case 5:
                    System.out.println("Somando...");
                    System.out.println(n1.calcularSomatorio());
                    break;
                case 0:
                    System.out.println("Obrigad volte sempre!!");
                    break;
                default:
                    System.out.println("DADOS INVÁLIDOS");
                }
        }while(escolha!=0);       
    }
}