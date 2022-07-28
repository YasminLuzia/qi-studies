import java.util.Scanner;
/**
 *
 * @author Alunos
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double numero1;
        double numero2;
        byte opcao;
        double calculo;
        String nomeCalculo;
        byte continua;
        
        //Balaca
        do{
            System.out.println("Digite um nº: ");
            numero1 = leia.nextDouble();
            System.out.println("Digite outro nº: ");
            numero2 = leia.nextDouble();
            System.out.println("Digite uma opção: "
                    + "\n1 - Somar números"
                    + "\n2 - Multiplicar números"
                    + "\n3 - Dividir 1º nº pelo 2º nº"
                    + "\n4 - Extrair Raiz Quadrada do 1º"
                    + "\n5 - Extrair Raiz Quadrada do 2º"
                    + "\n6 - Subtrair 1º do 2º nº");
            opcao = leia.nextByte();

            //Processamento:
            switch (opcao) {
                case 1:
                    calculo = numero1 + numero2;
                    nomeCalculo = "Soma";
                    break;
                case 2:
                    calculo = numero1 * numero2;
                    nomeCalculo = "Multiplicar";
                    break;
                case 3:
                    calculo = numero1 / numero2;
                    nomeCalculo = "Dividir";
                    break;
                case 4:
                    calculo = Math.sqrt(numero1);
                    nomeCalculo = "Raiz Quadrada do 1º";
                    break;
                case 5:
                    calculo = Math.sqrt(numero2);
                    nomeCalculo = "Raiz Quadrada do 2º";
                    break;
                default:
                    calculo = numero2 - numero1;
                    nomeCalculo = "Subtrair";
                    break;
            }

            //Respostas:
            System.out.println("\n\nRESPOSTAS:");
            if(opcao<1 || opcao>6 || (opcao==4 && numero1<0) 
                    || (opcao==5 && numero2<0) 
                    || (opcao==3 && numero2==0)){
                System.out.println("ERRO! Opção inválida.");
            }else{
                System.out.println("Cálculo: "+nomeCalculo+
                            "\nResultado: "+calculo);
            }
            System.out.println("Deseja continuar??"
                        + "\n1- Sim"
                        + "\n2- Não");
                continua=leia.nextByte();
        }while(continua!=2);
    }    
}