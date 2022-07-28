import java.util.Scanner;
/**
 *
 * @author Linkk
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        Funcionario f1=new Funcionario();
        
        System.out.println("Digite o nome do funcionario: ");
        f1.nome=leia.nextLine();
        System.out.println("Digite o numero de horas trabalhadas: ");
        f1.numeroHoras=leia.nextDouble();
        System.out.println("Digite o valor da hora trabalhada: ");
        f1.valorHora=leia.nextDouble();
        
        System.out.println("Respostas:");
        System.out.println("Salário Bruto: R$"+f1.calcularSalarioBruto());
        System.out.println("INSS: R$"+f1.calcularInss());
        System.out.println("Vale Transporte: R$"+f1.calcularValeTransporte());
        System.out.println("Salário líquido: R$"+f1.calcularSalarioLiquido());
    }
    
}