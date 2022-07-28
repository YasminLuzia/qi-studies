import java.util.Scanner;
/**
 *
 * @author Yasmin
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        Treino t1=new Treino();
        
        System.out.println("Digite o nome do Atleta: ");
        t1.setNomeAtleta(leia.nextLine());
        
        for(int i=0; i<10; i++){
            System.out.println("Informe a marca "+i+": ");
            t1.armazenarMarca(i, leia.nextDouble());
        }
        
        System.out.println(t1);
        double media = t1.calcularMediaDeMarcas();
        double maior = t1.obterMaiorMarca();
        
        System.out.println("Média de marcas: "+media);
        System.out.println("Maior marca: "+maior);
    }
    
}