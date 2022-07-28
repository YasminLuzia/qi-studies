import java.util.Scanner;
/**
 *
 * @author Linkk
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        Aluno a1=new Aluno();
        
        System.out.println("Digite o nome: ");
        a1.nome=leia.nextLine();
        do{
            System.out.println("Digite a nota 1: ");
            a1.nota1=leia.nextDouble();
            if(a1.nota1<0 || a1.nota1>10){
                System.out.println("ERRO DADOS INVALIDOS");
            }
        }while(a1.nota1<0 || a1.nota1>10);
        
        do{
            System.out.println("Digite a nota 2: ");
            a1.nota2=leia.nextDouble();
            if(a1.nota2<0 || a1.nota2>10){
                System.out.println("ERRO DADOS INVALIDOS");
            }
        }while(a1.nota2<0 || a1.nota2>10);
        
        do{
        System.out.println("Digite a quantidade de faltas: ");
        a1.faltas=leia.nextDouble();
        if(a1.faltas<0){
                System.out.println("ERRO DADOS INVALIDOS");
            }
        }while(a1.faltas<0);
        
        do{
        System.out.println("Digite a quantidade de aulas a assitir: ");
        a1.aulasAssitir=leia.nextDouble();
        if(a1.aulasAssitir<1){
                System.out.println("ERRO DADOS INVALIDOS");
            }
        }while(a1.aulasAssitir>1);
        
        System.out.println("A média do aluno é "+a1.calcularMedia()+" e a frequêndia é "+a1.calcularFrequencia()+"%");
    }
    
}