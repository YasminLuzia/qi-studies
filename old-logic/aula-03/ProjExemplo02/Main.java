
/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (24/10/2019)
 */
public class Main{
    public static void main(String args[]){
        //Declaração das variáveis:
        int anoNascimento;
        int anoAtual;
        int idade;
        //Atribuição de valores para as variáveis:
        anoNascimento = 2000;
        anoAtual = 2019;
        //Processamento - cáculos:
        idade = anoAtual - anoNascimento;
        //Saída de dados:
        System.out.println("\fAno Nascimento: "+anoNascimento);
        System.out.println("Ano Atual: "+anoAtual);
        System.out.println("Idade: "+idade+" anos.");
    }
}
