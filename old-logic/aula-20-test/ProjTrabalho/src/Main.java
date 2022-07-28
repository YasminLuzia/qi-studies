import java.util.Scanner;
/**
 *
 * @author Yasmin L
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        Funcionario f1=new Funcionario();
        
        System.out.println("Digite o nome do funcionário: ");
        f1.nome=leia.nextLine();
        System.out.println("Digite o CPF do funcionário: ");
        f1.cpf=leia.nextLine();
        System.out.println("Digite o cargo do funcionário: ");
        f1.cargo=leia.nextLine();
        do{
            System.out.println("Digite o valor da hora: ");
            f1.valorHora=leia.nextDouble();
            if(f1.valorHora<=0){
                System.out.println("ERRO! Valor hora inválido.");
            }
        }while(f1.valorHora<=0);
        do{
            System.out.println("Digite a quantidade de horas: ");
            f1.quantidadeHoras=leia.nextDouble();
            if(f1.quantidadeHoras<0){
                System.out.println("ERRO! Quantidade de horas inválidas: ");
            }
        }while(f1.quantidadeHoras<0);
        do{
            System.out.println("Digite o valor da passagem: ");
            f1.valorPassagem=leia.nextDouble();
            if(f1.valorPassagem<=0){
                System.out.println("ERRO! Valor da passagem inválido.");
            }
        }while(f1.valorPassagem<=0);
        do{
            System.out.println("Digite o valor refeição diária: ");
            f1.valorRefeicao=leia.nextDouble();
            if(f1.valorRefeicao<=0){
                System.out.println("ERRO! Valor da refeição diária inválido. ");
            }
        }while(f1.valorRefeicao<=0);
        do{
            System.out.println("Digite as horas extras semanais: ");
            f1.horasExtras50=leia.nextDouble();
            if(f1.horasExtras50<0){
                System.out.println("ERRO! Quantidade de horas extras semanais inválida. ");
            }
        }while(f1.horasExtras50<0);
        do{
            System.out.println("Digite as horas extras fim de semana e feriados: ");
            f1.horasExtras100=leia.nextDouble();
            if(f1.horasExtras100<0){
                System.out.println("ERRO! Quantidade de horas extras de finais de semana e feriados inválida. ");
            }
        }while(f1.horasExtras100<0);
        do{
            System.out.println("Digite a quantidade de dependentes: ");
            f1.dependentes=leia.nextByte();
            if(f1.dependentes<0){
                System.out.println("ERRO! Quantidade de dependentes inválida.");
            }
        }while(f1.dependentes<0);
        do{
        System.out.println("Digite a insalubridade:\n"
                + "1- Sem insalubridade \n"
                + "2- Mínimo\n"
                + "3- Média\n"
                + "4- Máxima");
        f1.tipoInsalubridade=leia.nextByte();
        if(f1.tipoInsalubridade<=0 || f1.tipoInsalubridade>=5){
            System.out.println("ERRO! Insalubridade inválida.");
        }
        }while(f1.tipoInsalubridade<=0 || f1.tipoInsalubridade>=5);
        
        System.out.println("RESPOSTAS: "
                + "\nSalário bruto: R$"+f1.calcularSalarioBruto()
                + "\nVale Transporte: R$"+f1.calcularValeTransporte()
                + "\nSalário Familia: R$"+f1.calcularSalarioFamilia()
                + "\nInsalubridade: R$"+f1.calcularInsalubridade()
                + "\nINSS: R$"+f1.calcularInss()
                + "\nVale Refeição: "+f1.calcularValeRefeicao()
                + "\nHoras extras semainais: R$"+f1.calcularValorExtra50()
                + "\nHoras extras de finais de semana e feriados: "+f1.calcularValorExtra100()
                + "\nValor total de horas extras: R$"+f1.calcularTotalHorasExras()
                + "\nSalário liquido: R$"+f1.calcularSalarioLiquido());
    }
}