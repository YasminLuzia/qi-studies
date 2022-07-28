import java.util.Scanner;
/**
 *
 * @author Yasmin L
 */
public class Main {
    public static void main(String[] args) {
        Scanner leia=new Scanner(System.in);
        
        int cont=1;
        while(cont<=20){
            if(cont%2==0){
                if(cont<20){
                System.out.print(cont+", ");
                }else{
                    System.out.println(cont);
                }
            }
            cont++;
        }
    }
}