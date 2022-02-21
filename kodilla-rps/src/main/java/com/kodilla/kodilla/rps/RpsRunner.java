package com.kodilla.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        int rounds;
        String name;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Gra w papier kamień norzyce\n" +
                "Proszę podać swoje imie ");
        name = scanner.nextLine();
        System.out.println("Witaj " + name +
                " Proszę podaj po ilu rundach wygranych gra ma się zakończyć");
        rounds = scanner.nextInt();
        System.out.println("Gra zakończy się po " + rounds + " rundach.");

        System.out.println("Obsługa: \n" +
                "klawisz 1 – zagranie \"kamień\",\n" +
                "klawisz 2 – zagranie \"papier\",\n" +
                "klawisz 3 – zagranie \"nożyce\",\n" +
                "klawisz x – zakończenie gry \n" +
                "klawisz n – uruchomienie gry od nowa \n");

        int wonRounds = 0;
        int lostRounds = 0;
        for (int i = 0; i < rounds; i++) {
            System.out.println("Runda: " + (i + 1));
            while (wonRounds < rounds | lostRounds < rounds) {
                play();
            }
        }
    }
    public static void play(){
        Scanner scanner = new Scanner(System.in);
        String move;
        int opponentsMove;
        int wonRounds=0;
        int lostRounds=0;
        Random random = new Random();

            System.out.println("Podaj swój ruch: ");
            move = scanner.nextLine();
            opponentsMove = random.nextInt(3);
            if (move == "1"){
                if (opponentsMove == 2){
                    System.out.println("Ruch przeciwnika to 2 czyli papier");
                    lostRounds++;
                }
                if (opponentsMove == 3){
                    System.out.println("Ruch przeciwnika to 3 czyli nożyce");
                    wonRounds++;
                }
            } else if (move =="2"){

            }

        }
    }