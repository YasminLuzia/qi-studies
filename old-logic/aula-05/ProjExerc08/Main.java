/**
 * Write a description of class Main here.
 *
 * @author (Yasmin L)
 * @version (29/10/19)
 * 8.Desenvolva um programa que leia um número de bits e converta para: byte, megabyte, gigabyte e terabyte.
 */
import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        Scanner leia=new Scanner(System.in);
        System.out.print("\f");
        
        long bits;
        long bytes;
        long megabyte;
        long gigabyte;
        long terabyte;
        
        System.out.println("Insira a quantidade de bits: ");
        bits=leia.nextLong();
        
        bytes=bits/8;
        megabyte=bytes/1048576;
        gigabyte=megabyte/1024;
        terabyte=gigabyte/1024;
        
        System.out.println(bits+" bits é igual a "+bytes+" bytes, "+megabyte+" megabytes, "+gigabyte+" gigabytes e "+terabyte+" terabytes.");
    }
}