 /**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (05/11/19)
 * 2 Programa que calcule o valor a pagar de acordo com os valor inseridos
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double codigo;
        double quantidadeLitros;

        String escolha;
        double valor;
        
        System.out.println("Digite o código do combustivel: \n1- GNV \n2- Etanol \n3- Gasolina Comum \n4- Gasolina Aditivada");
        codigo=leia.nextDouble();
        System.out.println("\fDigite a quantidade de litros: ");
        quantidadeLitros=leia.nextDouble();
        
        if(codigo==1){
            valor=2.10*quantidadeLitros;
            escolha = "GNV";
        }else if(codigo==2){
            valor=2.98*quantidadeLitros;
            escolha="Etanol";
        }else if(codigo==3){
            valor=4*quantidadeLitros;
            escolha="Gasolina Comum";
        }else if(codigo==4){
            valor=4.40*quantidadeLitros;
            escolha="Gasolina Aditivada";
        }else{
            valor=0;
            escolha = "Inválido";
        }
        
        System.out.println("\fO valor total do combustível "+escolha+ " é R$"+valor);
    }
}
