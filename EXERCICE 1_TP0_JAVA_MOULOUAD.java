/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo1;

import java.util.Scanner;

/*
 * Nom      : MOULOUAD Nawal
 * Groupe   : BDML3
* Rôle     : Demander le prénom et afficher un message personnalisé
 * Date     : 16/11/2026
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String prenom;
       Scanner sc;
       sc = new Scanner(System.in);
       System.out.println("Bonjour, quel est votre prenom ?");
       prenom = sc.nextLine();
       System.out.println("Bonjour " + prenom + " !");
       System.out.println("Au revoir " + prenom + " !");
    }
    
}
