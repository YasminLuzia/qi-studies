
/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (28/10/19)
 * 5.Desenvolva um algoritmo com espaço para nome de um produto, o valor de custo do produto e uma quantidade. Atribua o nome "Bis", valor de custo 2,60, quantidade 10. Faça seu algoritmo apresentar o valor final da compra.
 */
public class Main{
    public static void main(String args[]){
        String nomeProduto;
        double valor;
        int quantidade;
        double valorFinal;
        
        nomeProduto="Bis";
        valor=2.60;
        quantidade=10;
        
        valorFinal=valor*quantidade;
        
        System.out.println("\fO preço do produto "+nomeProduto+" é "+valorFinal);
    }
}
