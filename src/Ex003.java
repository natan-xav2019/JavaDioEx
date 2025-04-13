/*
 * Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares (de acordo com a seleção inicial) no intervalo de números informados, incluindo os números informados e em ordem decrescente;
 */

import java.util.Scanner;

public class Ex003 {
    public static int primeiroNumero;
    public static int segundoNumero;
    public static String escolha;

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número");
        primeiroNumero = sc.nextInt();

        do {
            System.out.println("Digite o segundo número (Lembre-se o segundo numero precisa ser MAIOR que o primeiro)");
            segundoNumero = sc.nextInt();            
        } while (primeiroNumero >= segundoNumero);

        sc.nextLine();

        do {
            System.out.println("Organizar por Impar ou Par:");
            escolha = sc.nextLine();
        } while ( !(escolha.equalsIgnoreCase("impar") || escolha.equalsIgnoreCase("par")) );

        System.out.println(primeiroNumero+" - "+segundoNumero);

        for(int contador = segundoNumero; primeiroNumero <= contador; contador--) {
            if (contador % 2 == 0 && escolha.equalsIgnoreCase("par")) {
                System.out.println(contador);
            }
            if (contador % 2 != 0 && escolha.equalsIgnoreCase("impar")) {
                System.out.println(contador);
            }
        }

        sc.close();
    }
}
