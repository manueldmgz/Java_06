package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ciclo for
        /*
        for(contador = 0; contador < numero; contador++) {
            // codigo que se repite;
        }


         Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int numero = sc.nextInt();

        for(int i = 1; i <= 10;i++){
          if (i % 2 !=0){
              continue;
          }
            System.out.println(numero + " x " + i + " = " + (numero*i));


            if (i == 8) {
                break;
            }
        }
        */



        /*Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un número y obten su serie Fibonacci");
        int n = sc.nextInt();
        int numero1 = 0, numero2 = 1;

        for(int i = 1; i <= n; i++) {
            System.out.println(numero1 + ", ");

            int sigLoop = numero1 + numero2;
            numero1 = numero2;
            numero2 = sigLoop;
        }
*/



        //While
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el número sxcrxto");
        int numero = sc.nextInt();
        int numeroSecreto = 33;

        while(numero != numeroSecreto){
            System.out.println("Adivina el número secreto. Ingresa un número");
            numero = sc.nextInt();
        }
        sc.close();
        System.out.println("Felicidades. Ganaste la vida");
    }*/

    //Ciclo do-while
        /*
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int numeroSecreto = 33;

        do {
            System.out.println("Adivina el número");
            numero = sc.nextInt();
        } while(numero != numeroSecreto);

        sc.close();
        System.out.println("Felicidades");
*/




//Encuentra el factorial de un número
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa el número factorial");
        int numero = 0, fact = 1;

        numero=sc.nextInt();
        int i=1;
        do{
            fact=fact*i;
            i++;
        }while(i<=numero);
        System.out.println("el factorial es:"+fact);


    }
}
