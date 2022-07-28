import java.util.Scanner;
/**
 *
 * @author Linkk
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        Aluno c1=new Aluno();
        
        
        System.out.println("Digite o nome do aluno: ");
        c1.nome=leia.nextLine();
        do{
            System.out.println("Digite a nota 1: ");
            c1.nota1=leia.nextDouble();
            if(c1.nota1<0 || c1.nota1>10){
                System.out.println("ERRO! Nota inválida.");
            }}while(c1.nota1<0 || c1.nota1>10);
        do{
            System.out.println("Digite a nota 2: ");
            c1.nota2=leia.nextDouble();
            if(c1.nota2<0 || c1.nota2>10){
                System.out.println("ERRO! Nota inválida.");
            }
        }while(c1.nota2<0 || c1.nota2>10);
        do{
            System.out.println("Digite a nota 3: ");
            c1.nota3=leia.nextDouble();
            if(c1.nota3<0 || c1.nota3>10){
                System.out.println("ERRO! Nota inválida.");
            }
        }while(c1.nota3<0 || c1.nota3>10);
        
        
        System.out.println("Resposta: ");
        System.out.println("Média: "+c1.calcularMedia());
        System.out.println("Resultado: "+c1.retornarConceito());
    }
    
}