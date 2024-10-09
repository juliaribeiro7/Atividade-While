/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosaten;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class NumerosAteN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro N: ");
        int N = scanner.nextInt();
        
        int i = 1;
        while (i <= N) {
            System.out.println(i);
            i++;
        }
        
        scanner.close();
    }
    
}
