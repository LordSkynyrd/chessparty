package com.company;

import java.util.Scanner;

public class Main {
    //fonction

    public static void main(String[] args) {
        // write your code here
        int boucle = 0;
        int boucle2 = 0;
        int boucle3 = 0;
        int A = 0;
        Scanner myScan = new Scanner(System.in);

        //print menu
        fonction.writeMenu();
        while (boucle < 1) { // create a loop for the menu
            String inputUser = myScan.nextLine();

            if (inputUser.equals("rules")) {
                // access the game's rules
                fonction.clearConsole();
                fonction.rules();
                fonction.optionMenu();
            }
            else if (inputUser.equals("play")) {
                // start the game
                fonction.clearConsole();
                fonction.initBoard();
                fonction.playerChoice(1, 2);
                fonction.keys();
                System.out.println(" ");
                System.out.println("Tapez 'rules' pour afficher les règles.");
                System.out.println("Tapez 'leave pour quitter.");
                System.out.println("Tapez 'menu' pour revenir au menu.");
                while (boucle3 < 1) {
                    inputUser = myScan.nextLine();
                    if (inputUser.equals("rules")) {
                        // access the game's rules
                        fonction.clearConsole();
                        fonction.rules();
                        fonction.optionMenu();
                    }
                    if (inputUser.equals("menu")) {
                        fonction.clearConsole();
                        fonction.writeMenu();
                    }
                    if (inputUser.equals("play")){
                        fonction.clearConsole();
                        fonction.initBoard();
                        fonction.keys();
                        System.out.println(" ");
                        System.out.println("Tapez 'rules' pour afficher les règles.");
                        System.out.println("Tapez 'leave pour quitter.");
                        System.out.println("Tapez 'menu' pour revenir au menu.");
                    }
                    if (inputUser.equals("leave")) {
                        // close the game
                        fonction.clearConsole();
                        System.out.println("Le logiciel va se fermer.");
                        boucle3 = 1;
                        boucle = 1;
                    }
                    if (inputUser.equals("d")) {
                        global_variables.RX++;
                        fonction.clearConsole();
                        fonction.showPlayer();
                        fonction.keys();
                    }
                    if (inputUser.equals("q")) {
                        global_variables.RX--;
                        fonction.clearConsole();
                        fonction.showPlayer();
                        fonction.keys();
                    }
                    if (inputUser.equals("s")) {
                        global_variables.RY++;
                        fonction.clearConsole();
                        fonction.showPlayer();
                        fonction.keys();
                    }
                    if (inputUser.equals("z")) {
                        global_variables.RY--;
                        fonction.clearConsole();
                        fonction.showPlayer();
                        fonction.keys();
                    }
                    if (inputUser.equals("k")) {
                        global_variables.BY++;
                        fonction.clearConsole();
                        fonction.showPlayer();
                        fonction.keys();
                    }
                    if (inputUser.equals("i")) {
                        global_variables.BY--;
                        fonction.clearConsole();
                        fonction.showPlayer();
                        fonction.keys();
                    }
                    if (inputUser.equals("l")) {
                        global_variables.BX++;
                        fonction.clearConsole();
                        fonction.showPlayer();
                        fonction.keys();
                    }
                    if (inputUser.equals("j")) {
                        global_variables.BX--;
                        fonction.clearConsole();
                        fonction.showPlayer();
                        fonction.keys();
                    }
                }
            }
            else if (inputUser.equals("leave")) {
                // close the game
                fonction.clearConsole();
                System.out.println("Le logiciel va se fermer.");
                boucle = 1;
            }
            else if (inputUser.equals("menu")) {
                // write menu
                fonction.clearConsole();
                fonction.writeMenu();
            }
        }

    }
}
