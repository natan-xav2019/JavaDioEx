//Escreva um código onde o usuário entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura * altura)) e seja exibida a mensagem de acordo com o resultado:
/**
 * Se for menor ou igual a 18,5 "Abaixo do peso";
 * se for entre 18,6 e 24,9 "Peso ideal";
 * Se for entre 25,0 e 29,9 "Levemente acima do peso";
 * Se for entre 30,0 e 34,9 "Obesidade Grau I";
 * Se for entre 35,0 e 39,9 "Obesidade Grau II (Severa)";
 * Se for maior ou igual a 40,0 "Obesidade III (Mórbida)";
 */

 import java.util.Scanner;

public class Ex002 {
    public static void main(String[] args) {
        float altura;
        float peso;
        float resposta;

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculo de IMC");
        System.out.println("Digite a altura:");
        altura = sc.nextFloat();
        System.out.println("Digite o peso:");
        peso = sc.nextFloat();

        resposta = calculoIMC(altura,peso);

        if( resposta <= 18.5 ) {
            System.out.println("Abaixo do peso");
        } else if ( resposta <= 24.9 ) {
            System.out.println("Peso ideal");
        } else if ( resposta <= 29.9 ) {
            System.out.println("Levemente acima do peso");
        } else if ( resposta <= 34.9 ) {
            System.out.println("Obesidade Grau I");
        } else if ( resposta <= 39.9 ) {
            System.out.println("Obesidade Grau II (Severa)");
        } else {
            System.out.println("Obesidade Grau III (Mórbida)");
        }

        sc.close();
    }

    public static float calculoIMC(float altura, float peso) {
        return peso/(altura * altura);
    }
}
