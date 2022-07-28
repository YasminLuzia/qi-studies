
/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (28/10/19)
 * 6. Desenvolva um programa que leia o nome e o ano de uma pessoa e ano atual. Atribua para as variáveis o seu nome, o ano do seu nascimento e o ano atual. Seu programa deve calcular e mostrar sua idade.
 */
public class Main{
    public static void main(String args[]){
        String nome;
        int anoAtual;
        int anoNascimento;
        int idade;
        
        nome="Yasmin";
        anoAtual=2019;
        anoNascimento=2001;
        
        idade=anoAtual-anoNascimento;
        
        System.out.println("\f"+nome+" tem "+idade+ " anos.");
    }
}
