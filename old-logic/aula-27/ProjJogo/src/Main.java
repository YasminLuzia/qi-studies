import java.util.Scanner;//importando classe Scanner
/**
 *
 * @author Yasmin L
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);//instanciando classe Scanner
        
        byte escolha;//variavel do menu
        byte saida;
        
        do{//inicio do Do
            
            System.out.println("1- Jogar"//mostrando na tela o menu
                    + "\n2- Como jogar"
                    + "\n0- Sair");
            escolha=leia.nextByte(); //lendo escolha do usuario
            
            switch(escolha){ //executando escolha - Inicio Switch
                case 1:
                    System.out.println("Digite seu nome:");
                    leia.nextLine();
                    String nome = leia.nextLine();//lendo o nome
                    byte jogadaUsuario;
                    do{//validando escolha de jogada
                        System.out.println("Escolha sua jogada!" //mostrando na tela jogadas
                                + "\n1- Pedra"
                                + "\n2- Papel"
                                + "\n3- Tesoura");
                        jogadaUsuario = (leia.nextByte()); //lendo jogada do usuario
                        if(jogadaUsuario<1 || jogadaUsuario>3){
                            System.out.println("Erro!!");
                        }
                    }while(jogadaUsuario<1 || jogadaUsuario>3);
                    
                    Jogo j1=new Jogo(jogadaUsuario,nome); //invocando a classe jogo
                        System.out.println(j1); //mostrando jogadas
                        System.out.println("Resultado: "+j1.verificarVencedor()); //resultados
                    
                    break;
                case 2:
                    System.out.println("Para jogar basta escolher 1 para pedra, 2 para papel ou 3 para tesoura."
                            + "\nApós sua escolha a máquina também sorteará uma opção."
                            + "\nVocê vence se:"
                            + "\nSelecionou pedra e a máquina tesoura,"
                            + "\nSelecionou papel e a máquina pedra ou"
                            + "\nSelecionou tesoura e a máquina papel. ");
                    break;
                case 0:
                    System.out.println("Sentiremos sua falta :( Você tem certeza que deseja sair?"
                            + "\n1- Não, desejo ficar."
                            + "\n0- Sim, desejo sair.");
                    escolha=leia.nextByte();
                    switch(escolha){
                        case 1:
                            System.out.println("Obrigado por ficar conosco!");
                            break;
                        case 0:
                            System.out.println("Tudo bem, obrigado por jogar!");
                            escolha = 0;
                            break;
                        default:
                            System.out.println("Erro! Selecione uma opção válida.");
                    }
                    break;
                default:
                    System.out.println("ERRO! Número inválido.");
            }//fim do Switch
            
        }while(escolha!=0);//fim do Do
    
    }//fim public static void main
    
}//fim public class main