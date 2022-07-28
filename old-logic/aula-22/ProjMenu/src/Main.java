import java.util.Scanner;
/**
 *
 * @author Yasmin L
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        Calculo c1=new Calculo();//Instancia
        
        do{
            System.out.println("Digite o primeiro número: ");
            c1.setNumero1(leia.nextDouble());
            if(c1.getNumero1()<=0){
                System.out.println("ERRO");
            }
        }while(c1.getNumero1()<=0);
        
        do{
            System.out.println("Digite o segundo número: ");
            c1.setNumero2(leia.nextDouble());
            if(c1.getNumero2()<=0){
                System.out.println("ERRO");
            }
        }while(c1.getNumero2()<=0);
        
        byte menu;//Variável para ler o menu - escolha do usuário
        
        do{
            System.out.println("\n01- Editar o número"
                    + "\n02- Somar"
                    + "\n03- Multiplicar"
                    + "\n04- Dividir o primeiro número pelo segundo"
                    + "\n05- Calcular a média"
                    + "\n06- Ver os números inseridos"
                    + "\n07- Extrair raiz quadrada do primeiro número"
                    + "\n08- Extrair raiz quadrada do segundo número"
                    + "\n09- Primeiro número ao quadrado"
                    + "\n10- Segundo número ao quadrado"
                    + "\n0- Cancelar, sair");
            menu=leia.nextByte();
            switch(menu){
                case 1:
                    System.out.println("Editando...");
                    do{
                        System.out.println("Digite o primeiro número: ");
                        c1.setNumero1(leia.nextDouble());
                        if(c1.getNumero1()<=0){
                        System.out.println("ERRO");
                        }
                    }while(c1.getNumero1()<=0);

                    do{
                        System.out.println("Digite o segundo número: ");
                        c1.setNumero2(leia.nextDouble());
                        if(c1.getNumero2()<=0){
                            System.out.println("ERRO");
                        }
                    }while(c1.getNumero2()<=0);
                    break;
                case 2:
                    System.out.println("Somando...");
                    System.out.println("A soma é: "+c1.somar());
                    break;
                case 3:
                    System.out.println("Multiplicando...");
                    System.out.println("A multiplicação é: "+c1.multiplicar());
                    break;
                case 4:
                    System.out.println("Dividindo...");
                    System.out.println("A divisão é: "+c1.dividir());
                    break;
                case 5:
                    System.out.println("Calculando a média...");
                    System.out.println("A média é: "+c1.calcularMedia());
                    break;
                case 6:
                    System.out.println("Visualizando...");
                    System.out.println(c1);
                    break;
                case 7:
                    System.out.println("Calculando a raiz...");
                    System.out.println("A raiz do primeiro número é: "+c1.calcularRaiz1());
                    break;
                case 8:
                    System.out.println("Calculando a raiz...");
                    System.out.println("A raiz do segundo número é: "+c1.calcularRaiz2());
                    break;
                case 9:
                    System.out.println("Calculando o quadrado...");
                    System.out.println("O quadrado do primeiro número é: "+c1.calcularQuadrado1());
                    break;
                case 10:
                    System.out.println("Calculando o quadrado...");
                    System.out.println("O quadrado do segundo número é: "+c1.calcularQuadrado2());
                    break;
                case 0:
                    System.out.println("Obrigadahh volte sempre");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }while(menu!=0);
    }
}