import java.util.Scanner;
/**
 *
 * @author Yasmin
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        byte menu;
        
        do{
            System.out.println("Digite: "
                    + "\n1- Instruções do jogo"
                    + "\n2- Jogar"
                    + "\n0- Sair");
            menu=leia.nextByte();
            switch(menu){
                case 1:
                    System.out.println("Como jogar?"
                            + "O programa sorteará um número de 1 a 5."
                            + "\nVocê deve tentar adivinhar o número sorteado.");
                    break;
                case 2:
                    System.out.println("Bem-vindo ao Jogo da Sorte!");
                    byte numeroSorte;
                    do{
                        System.out.println("Digite seu número da sorte de 1 a 5: ");
                        numeroSorte=leia.nextByte();
                        if(numeroSorte<1 || numeroSorte>5){
                            System.out.println("Erro!! Número inválido.");
                        }else{
                        }
                    }while(numeroSorte<1 || numeroSorte>5);
                    Sorteio s1=new Sorteio(numeroSorte);
                    
                    if(s1.verificarSeVenceu()==false){
                        System.out.println("Você perdeu!! A máquina sorteou o número "+s1+". Deseja tentar novamente?");
                    }else{
                        System.out.println("Parabéns!! Você acertou!");
                    }
                    
                    break;
                case 0:
                    System.out.println("Obrigado, volte sempre!");
                    break;
                default:
                    System.out.println("Erro!! Opção inválida.");
            }
            
        }while(menu!=0);
    }
    
}
