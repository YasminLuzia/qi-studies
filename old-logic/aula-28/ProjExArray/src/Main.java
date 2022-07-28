import java.util.Scanner;
/**
 *
 * @author Yasmin
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        int[] numeros=new int[6];//declarando quantos espaços terá o array
        
        for(int i=0; i<6; i++){//começa na primeira posiçao até a posição 5, cada numero é inserido no proximo espaço
            System.out.println("Digite um numero: ");
            numeros[i]=leia.nextInt();//lendo o numero dentro dos espaços
        }
    }
    
}
