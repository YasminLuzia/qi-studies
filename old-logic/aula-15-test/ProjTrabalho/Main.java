/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (14/11/19)
 */
import java.util.Scanner;
public class Main{
    public static void main(String arg[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        //Declaração de variáveis
        String nome;
        byte diaNascimento;
        byte mesNascimento;
        int anoNascimento;
        byte diaAtual;
        byte mesAtual;
        int anoAtual;
        
        int idade;
        String signo;
        
        byte continua;
        
        
        System.out.println("Digite seu nome: ");
        nome=leia.nextLine();
        do{
            System.out.println("\fDigite seu dia de nascimento: ");
            diaNascimento=leia.nextByte();
            System.out.println("Digite seu mês de nascimento: ");
            mesNascimento=leia.nextByte();
            System.out.println("Digite seu ano de nascimento: ");
            anoNascimento=leia.nextInt();
            System.out.println("Digite o dia atual: ");
            diaAtual=leia.nextByte();
            System.out.println("Digite o mês atual: ");
            mesAtual=leia.nextByte();
            System.out.println("Digite o ano atual: ");
            anoAtual=leia.nextInt();
            //Fim de declaração de variáveis
            
            //Inicio calculo de idade
            if(mesAtual<mesNascimento || mesNascimento==mesAtual && diaAtual<diaNascimento){
                idade=anoAtual-anoNascimento-1;
            }else{
                idade=anoAtual-anoNascimento;
            }
            //Fim calculo idade
            
            //Inicio do retorno do signo;
            if(mesNascimento==3 && diaNascimento>=21 && diaNascimento<=31 || mesNascimento==4 && diaNascimento>=1 && diaNascimento<=19){
                signo="Áries";
            }else if(mesNascimento==4 && diaNascimento>=20 && diaNascimento<=30 || mesNascimento==5 && diaNascimento>=1 && diaNascimento<=20){
                signo="Touro";
            }else if(mesNascimento==5 && diaNascimento>=21 && diaNascimento<=31 || mesNascimento==6 && diaNascimento>=1 && diaNascimento<=20){
                signo="Gêmeos";
            }else if(mesNascimento==6 && diaNascimento>=21 && diaNascimento<=30 || mesNascimento==7 && diaNascimento>=1 && diaNascimento<=22){
                signo="Câncer";
            }else if(mesNascimento==7 && diaNascimento>=23 && diaNascimento<=31 || mesNascimento==8 && diaNascimento>=1 && diaNascimento<=22){
                signo="Leão";
            }else if(mesNascimento==8 && diaNascimento>=23 && diaNascimento<=31 || mesNascimento==9 && diaNascimento>=1 && diaNascimento<=22){
                signo="Virgem";
            }else if(mesNascimento==9 && diaNascimento>=23 && diaNascimento<=30 || mesNascimento==10 && diaNascimento>=1 && diaNascimento<=22){
                signo="Libra";
            }else if(mesNascimento==10 && diaNascimento>=23 && diaNascimento<=31 || mesNascimento==11 && diaNascimento>=1 && diaNascimento<=21){
                signo="Escorpião";
            }else if(mesNascimento==11 && diaNascimento>=22 && diaNascimento<=30 || mesNascimento==12 && diaNascimento>=1 && diaNascimento<=20){
                signo="Sagitário";
            }else if(mesNascimento==12 && diaNascimento>=21 && diaNascimento<=31 || mesNascimento==1 && diaNascimento>=1 && diaNascimento<=19){
                signo="Capricórnio";
            }else if(mesNascimento==1 && diaNascimento>=20 && diaNascimento<=31 || mesNascimento==2 && diaNascimento>=1 && diaNascimento<=17){
                signo="Aquário";
            }else{
                signo="Peixes";
            }
            //Fim retorno do signo;
            
            //Validação e Saída
            if(mesAtual<1 || mesAtual>12 || mesNascimento<1 || mesNascimento>12){
                System.out.println("\fErro! Este mês não existe.");
            }else if(diaAtual<1 || diaAtual>31 || diaNascimento<1 || diaNascimento>31){
                System.out.println("\fErro! Este dia não existe.");
            }else if(anoNascimento<0 || anoAtual<0){
                System.out.println("\fErro! O ano não pode ser negativo e nem igual à zero.");
            }else if(anoNascimento>anoAtual){
                System.out.println("\fErro! Este ano não existe.");
            }else if((mesAtual==4 || mesAtual==6 || mesAtual==9 || mesAtual==11) && diaAtual== 31){
                System.out.println("\fErro! Este mês não possui 31 dias.");
            }else if((mesNascimento==4 || mesNascimento==6 || mesNascimento==9 || mesNascimento==11) && diaNascimento==31){
                System.out.println("\fErro! Este mês não possui 31 dias.");
            }else if(diaAtual==29 && mesAtual==2 && anoAtual%4!=0){
                System.out.println("\fErro! Este ano não é bissexto.");
            }else if(diaNascimento==29 && mesNascimento==2 && anoNascimento%4!=0){
                System.out.println("\fErro! Este ano não é bissexto.");
            }else if(anoNascimento>anoAtual){
                System.out.println("\fErro!Você não tem como ter nascido.");
            }else if(anoNascimento==anoAtual && mesNascimento>mesAtual){
                System.out.println("\fErro!Você não tem como ter nascido.");
            }else if(anoNascimento==anoAtual && mesNascimento==mesAtual && diaNascimento>diaAtual){
                System.out.println("\fErro!Você não tem como ter nascido.");
            }else{
                System.out.println("\fRespostas:\nNome: "+nome+"\nData de Nascimento: "+diaNascimento+"/"+mesNascimento+"/"+anoNascimento+"\nData Atual: "+diaAtual+"/"+mesAtual+"/"+anoAtual);
                System.out.println("Você tem "+idade+" anos.");
                if(diaNascimento==diaAtual && mesNascimento==mesAtual){
                    System.out.println("FELIZ ANIVERSÁRIO USUÁRIO!! :D");
                }
                if(idade==0){
                    System.out.println("COMO VOCÊ É JOVEM!! TEM MESES DE VIDA");
                    idade = mesAtual - mesNascimento;
                    if(idade<0){
                        idade = idade+12;
                    }
                    System.out.println("Você tem "+idade+" meses.");
                }
                System.out.println("Você é do signo de "+signo+".");
            }
            System.out.println("\n\n\nDeseja Continuar? \n1-Sim \n0-Não");
            continua = leia.nextByte();
        }while(continua!=0);
    }
}