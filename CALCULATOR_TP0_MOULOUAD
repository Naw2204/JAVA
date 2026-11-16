/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/*
 * Nom      : MOULOUAD Nawal
 * Groupe   : BDML3
 * Rôle     : Calculatrice qui effectue une opération (addition, soustraction, multiplication, division, modulo)
 * Date     : 16/11/2026
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        Scanner sc = new Scanner(System.in);
        int operateur;
        operateur = sc.nextInt();
        
        if (operateur < 1 || operateur > 5) {
            System.out.println("Error: the operator must be between 1 and 5");
            System.exit(0);
        }

        int operande1;
        System.out.println("Please enter the first number:");
        operande1 = sc.nextInt();

        int operande2;
        System.out.println("Please enter the second number:");
        operande2 = sc.nextInt();

        int resultat = 0;
        switch (operateur) {
            case 1:
                resultat = operande1 + operande2;
                break;
            case 2:
                resultat = operande1 - operande2;
                break;
            case 3:
                resultat = operande1 * operande2;
                break;
            case 4:
                resultat = operande1 / operande2;
                break;
            case 5:
                resultat = operande1 % operande2;
                break;
        }
        System.out.println("The result is : " + resultat);
    }

}
