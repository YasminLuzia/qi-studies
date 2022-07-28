import java.util.Scanner;
/**
 *
 * @author Luzia
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        double numero1;
        double numero2;
        byte opcao;
        double calculo;
        
        System.out.println("Digite o tipo de operação:");
        System.out.println("1- Soma");
        System.out.println("2- Multiplicação");
        System.out.println("3- Divisão do primero numero pelo segundo");
        System.out.println("4- Raiz quadrada do primeiro numero");
        System.out.println("5- Raiz quadrada do segundo numero");
        System.out.println("6- Subtrair o primeiro numero pelo segundo");
        opcao=leia.nextByte();
        System.out.println("Digite o primeiro número:");
        numero1=leia.nextDouble();
        System.out.println("Digite o segundo número");
        numero2=leia.nextDouble();
        
        if(opcao==1){
            calculo=numero1+numero2;
        }else if(opcao==2){
            calculo=numero1*numero2;
        }else if(opcao==3){
            calculo=numero1/numero2;
        }else if(opcao==4){
            calculo=Math.sqrt(numero1);
        }else if(opcao==5){
            calculo=Math.sqrt(numero2);
        }else{
            calculo=numero1-numero2;
        }
        
        if(opcao<1 || opcao>6){
            System.out.println("ERROOO!!! Digite uma opção válida.");
        }else if(opcao==3 && numero2==0){
            System.out.println("ERROOO!!! Não é possível dividir por zero.");
        }else if(opcao==4 && numero1<0){
            System.out.println("ERROOO!!! Não é possível extrair a raiz quadrada de um numero negativo.");
        }else if(opcao==5 && numero2<0){
            System.out.println("ERROOO!!! Não é possível extrair a raiz quadrada de um numero negativo.");
        }else{
            System.out.println("O resultado da operação é: "+calculo+".");
        }
    }
}