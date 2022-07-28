 /**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (05/11/19)
 * 3 O programa devera mostrar o valor a pagar
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        double quantidadeCopias;
        byte tipoCliente;
        String escolha;
        
        double valor;
        
        System.out.println("Digite o tipo de cliente onde \n1- Aluno \n2- Professor \n3- Diretor \n4- Não Aluno");
        tipoCliente=leia.nextByte();
        System.out.println("\fDigite a quantidade de cópias: ");
        quantidadeCopias=leia.nextDouble();
        
        if (tipoCliente==1){
            valor=quantidadeCopias*0.15;
            escolha="Aluno(a)";
        }else if(tipoCliente==2){
            valor=quantidadeCopias*0.07;
            escolha="Professor(a)";
        }else if(tipoCliente==3){
            valor=quantidadeCopias*0.00;
            escolha="Diretor(a)";
        }else if(tipoCliente==4){
            valor=quantidadeCopias*0.20;
            escolha="Não aluno";
        }else{
            valor=0;
            escolha="Inválido";
        }
        
        System.out.println("\fO valor que "+escolha+" é R$"+valor);
    }
}
