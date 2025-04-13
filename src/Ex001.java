//Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número

import java.util.Scanner;

public class Ex001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número para fazer a tabuada dele: ");

        int numero = sc.nextInt();

        System.out.println("Tabuada do " + numero);
        for (int contador = 1 ; contador < 10 ; contador++) {
            System.out.println(contador + " X " + numero + " = " + (contador * numero));
        }
    }
}
