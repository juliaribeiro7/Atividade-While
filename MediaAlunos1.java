/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mediaalunos1;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class MediaAlunos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quantos alunos tem na sala? ");
        int numeroAlunos = scanner.nextInt();
        
        double somaNotas = 0;
        int contador = 0;

        while (contador < numeroAlunos) {
            System.out.print("Digite a nota do aluno " + (contador + 1) + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
            contador++;
        }

        double media = somaNotas / numeroAlunos;
        System.out.println("A média aritmética da turma é: " + media);
        
        scanner.close();
    }
    
}
