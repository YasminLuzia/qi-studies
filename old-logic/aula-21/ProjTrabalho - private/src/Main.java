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
        f1.setNome(leia.nextLine());

        do{
            System.out.println("Digite o CPF do funcionário: ");
            f1.setCpf(leia.nextLine());
            if(f1.getCpf().length()!=11){
                System.out.println("ERRO! CPF inválido.");
            }
        }while(f1.getCpf().length()!=11);
        System.out.println("Digite o cargo do funcionário: ");
        leia.nextLine();
        f1.setCargo(leia.nextLine());
        do{
            System.out.println("Digite o valor da hora: ");
            f1.setValorHora(leia.nextDouble());
            if(f1.getValorHora()<=0){
                System.out.println("ERRO! Valor hora inválido.");
            }
        }while(f1.getValorHora()<=0);
        do{
            System.out.println("Digite a quantidade de horas: ");
            f1.setQuantidadeHoras(leia.nextDouble());
            if(f1.getQuantidadeHoras()<0){
                System.out.println("ERRO! Quantidade de horas inválidas: ");
            }
        }while(f1.getQuantidadeHoras()<0);
        do{
            System.out.println("Digite o valor da passagem: ");
            f1.setValorPassagem(leia.nextDouble());
            if(f1.getValorPassagem()<=0){
                System.out.println("ERRO! Valor da passagem inválido.");
            }
        }while(f1.getValorPassagem()<=0);
        do{
            System.out.println("Digite o valor refeição diária: ");
            f1.setValorRefeicao(leia.nextDouble());
            if(f1.getValorRefeicao()<=0){
                System.out.println("ERRO! Valor da refeição diária inválido. ");
            }
        }while(f1.getValorRefeicao()<=0);
        do{
            System.out.println("Digite as horas extras semanais: ");
            f1.setHorasExtras50(leia.nextDouble());
            if(f1.getHorasExtras50()<0){
                System.out.println("ERRO! Quantidade de horas extras semanais inválida. ");
            }
        }while(f1.getHorasExtras50()<0);
        do{
            System.out.println("Digite as horas extras fim de semana e feriados: ");
            f1.setHorasExtras100(leia.nextDouble());
            if(f1.getHorasExtras100()<0){
                System.out.println("ERRO! Quantidade de horas extras de finais de semana e feriados inválida. ");
            }
        }while(f1.getHorasExtras100()<0);
        do{
            System.out.println("Digite a quantidade de dependentes: ");
            f1.setDependentes(leia.nextByte());
            if(f1.getDependentes()<0){
                System.out.println("ERRO! Quantidade de dependentes inválida.");
            }
        }while(f1.getDependentes()<0);
        do{
        System.out.println("Digite a insalubridade:\n"
                + "1- Sem insalubridade \n"
                + "2- Mínimo\n"
                + "3- Média\n"
                + "4- Máxima");
        f1.setTipoInsalubridade(leia.nextByte());
        if(f1.getTipoInsalubridade()<=0 || f1.getTipoInsalubridade()>=5){
            System.out.println("ERRO! Insalubridade inválida.");
        }
        }while(f1.getTipoInsalubridade()<=0 || f1.getTipoInsalubridade()>=5);
        
        System.out.println("\nRESPOSTAS:");
        System.out.println(f1);
        System.out.println("Salário bruto: R$"+f1.calcularSalarioBruto()
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