import java.util.Scanner;
/**
 *
 * @author Yasmin
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        Conta c1=new Conta ();
        
        byte menu;
        do{
            System.out.println("\nDigite: "
                    + "\n1- Criar conta"
                    + "\n2- Ver dados bancários"
                    + "\n3- Ver saldo"
                    + "\n4- Depositar"
                    + "\n5- Sacar"
                    + "\n0- Sair");
            menu=leia.nextByte();
            switch(menu){
                case 1:
                    System.out.println("Criando conta...");
                    System.out.println("Gerando nº da conta...");
                    int geraNumero=(int)(Math.random()*800+1);
                    System.out.println(geraNumero);
                    c1.setNumeroConta(geraNumero);
                    
                    System.out.println("\nSenha: ");
                    c1.setSenha(leia.nextInt());
                    
                    do{
                        System.out.println("\nSaldo: ");
                        c1.setSaldo(leia.nextDouble());
                        if(c1.getSaldo()<0){
                            System.out.println("ERRO");
                        }
                    }while(c1.getSaldo()<0);
                    System.out.println("Conta cadastrada com sucesso!");
                    break;
                case 2:
                    System.out.println("Dados bancários...");
                    System.out.println(c1);
                    break;
                case 3:
                    System.out.println("Verificando saldo... ");
                    System.out.println(c1.verificarSaldo());
                    break;
                case 4:
                    System.out.println("Depositando...");
                    double valorDeposito;
                    do{
                        System.out.println("Digite o valor do depósito: ");
                        valorDeposito=leia.nextDouble();
                        if(valorDeposito<=0){
                            System.out.println("ERRO");
                        }
                    }while(valorDeposito<=0);
                    c1.depositar(valorDeposito);
                    System.out.println("Depósito efetuado com sucesso!");
                    break;
                case 5:
                    System.out.println("Efetuando saque...");
                    double valorSaque;
                    do{
                        System.out.println("Digite o valor do saque: ");
                        valorSaque=leia.nextDouble();
                        if(valorSaque<=0){
                            System.out.println("ERRO");
                        }
                    }while(valorSaque<=0);
                    if(c1.verificarSeHaSaldo(valorSaque)){
                        c1.sacar(valorSaque);
                        System.out.println("Saque efetuado com sucesso!");
                    }else{
                        byte opcoes;
                        System.out.println("Você está com saldo negativo! Deseja entrar em um crédito especial de R$"+c1.calcularCreditoEspecial(valorSaque)+"? Digite:"
                                + "\n1- Para continuar"
                                + "\n2- Para cancelar");
                        opcoes=leia.nextByte();
                        switch(opcoes){
                            case 1:
                                c1.sacar(valorSaque);
                                System.out.println("Saque efetuado com sucesso!");
                                break;
                            case 2:
                                System.out.println("Saque cancelado");
                                break;
                            default:
                                System.out.println("ERRO");
                        }
                    }
                    break;
                case 0:
                    System.out.println("GOOBYE");
                    break;
                default:
                    System.out.println("ERRO DADOS INVALIDOS");
            }
        }while(menu!=0);
    }
}