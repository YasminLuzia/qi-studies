import java.util.Scanner;

/**
 *
 * @author Luzia
 */

public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        String nome;
        String cpf;
        String cargo;
        double valorHora;
        double horasTrabalhadas;
        double valorTotalPassagem;
        byte dependentes;
        byte tipoInsalubridade;
        double valorDiarioRefeicao;
        double horaExtra50;
        double horaExtra100;
        
        double salarioBruto;
        double valeTransporte;
        double salarioFamilia;
        double insalubridade;
        double inss;
        double salarioLiquido;
        double valeRefeicao;
        double valorHoraExtra50;
        double valorHoraExtra100;
        double valorTotalHorasExtras;
        
        System.out.println("Digite o nome: ");
        nome=leia.nextLine();
        System.out.println("Digite o CPF: ");
        cpf=leia.nextLine();
        System.out.println("Digite o cargo:");
        cargo=leia.nextLine();
        System.out.println("Digite o valor da hora:");
        valorHora=leia.nextDouble();
        System.out.println("Digite as horas trabalhadas:");
        horasTrabalhadas=leia.nextDouble();
        System.out.println("Digite o valor total da passagem ao mês: ");
        valorTotalPassagem=leia.nextDouble();
        System.out.println("Digite a quantidade de dependentes: ");
        dependentes=leia.nextByte();
        System.out.println("Digite o tipo de insalubridade:"
                + "\n1- Nenhum"
                + "\n2- Mínimo"
                + "\n3- Média"
                + "\n4- Máxima");
        tipoInsalubridade=leia.nextByte();
        System.out.println("Digite o valor diario refeição:");
        valorDiarioRefeicao=leia.nextDouble();
        System.out.println("Digite a quantidade de horas extras de 50% feitas:");
        horaExtra50=leia.nextDouble();
        System.out.println("Digite a quantidade de horas extras de 100% feitas:");
        horaExtra100=leia.nextDouble();
        
        salarioBruto=valorHora*horasTrabalhadas;
        valeRefeicao=(valorDiarioRefeicao*25)*0.2;
        valorHoraExtra50=(valorHora*1.5)*horaExtra50;
        valorHoraExtra100=(valorHora*2)*horaExtra100;
        valorTotalHorasExtras=valorHoraExtra50+valorHoraExtra100;
        if((salarioBruto*0.06)>valorTotalPassagem){
            valeTransporte=0;
        }else{
            valeTransporte=salarioBruto*0.06;
        }
        if(salarioBruto<=907.77){
            salarioFamilia=46.54*dependentes;
        }else if(salarioBruto>907.77 && salarioBruto<=1364.43){
            salarioFamilia=32.80*dependentes;
        }else{
            salarioFamilia=0;
        }
        switch (tipoInsalubridade) {
            case 1:
                insalubridade=0;
                break;
            case 2:
                insalubridade=997*0.1;
                break;
            case 3:
                insalubridade=997*0.2;
                break;
            default:
                insalubridade=997*0.4;
        }
        if(salarioBruto<=1751.81){
            inss=salarioBruto*0.08;
        }else if(salarioBruto>1751.81 && salarioBruto<=2919.72){
            inss=salarioBruto*0.09;
        }else if(salarioBruto>2919.72 && salarioBruto<=5839.45){
            inss=salarioBruto*0.11;
        }else{
            inss=salarioBruto*0.27;
        }
        salarioLiquido=salarioBruto+salarioFamilia+insalubridade+valorTotalHorasExtras-valeTransporte-inss-valeRefeicao;
        
        if(valorHora<0 || horasTrabalhadas<0 || valorTotalPassagem<0 || dependentes<0 || tipoInsalubridade<1 || tipoInsalubridade>4 || valeRefeicao<0 || horaExtra50<0 || horaExtra100<0){
            System.out.println("DADOS INVÁLIDOS");
        }else{
            System.out.println("Respostas:"
                    + "\nSalario Bruto: R$"+salarioBruto
                    + "\nVale Tranporte: R$"+valeTransporte
                    + "\nSalário Família: R$"+salarioFamilia
                    + "\nInsalubridade: R$"+insalubridade
                    + "\nINSS: R$"+inss
                    + "\nVale Refeição: R$"+valeRefeicao
                    + "\nValor de horas extras 50%: R$"+valorHoraExtra50
                    + "\nValor de horas extras 100%: R$"+valorHoraExtra100
                    + "\nValor total em horas extras: R$"+valorTotalHorasExtras
                    + "\nSalário Líquido: R$"+salarioLiquido);
        }
    }
    
}