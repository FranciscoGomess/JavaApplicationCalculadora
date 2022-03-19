
package pacote.principal.calculadora;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        double calc1, calc2, result;
        byte menu, retorno;

        
        do {
            Scanner in = new Scanner(System.in);

            System.out.println("\nMENU CALCULADORA BASÍCA\n\nEscolha uma das opções abaixo 1 a 4:\n"
                    + "\n1 Soma\n2 Multiplicação\n3 Divisão\n4 Subtração\n");
            System.out.println("Digite a opção escolhida de 1 a 4: ");
            menu = in.nextByte();
            
            switch (menu) {
                case 1:
                    System.out.println("Digite o primeiro número da operação:");
                    calc1 = in.nextDouble();
                    System.out.println("Digite o segundo número da operação:");
                    calc2 = in.nextDouble();
                    result = calc1 + calc2;
                    System.out.println("Resultado da operação = " + result);
                    break;
                case 2:
                    System.out.println("Digite o primeiro número da operação:");
                    calc1 = in.nextDouble();
                    System.out.println("Digite o segundo número da operação:");
                    calc2 = in.nextDouble();
                    result = calc1 * calc2;
                    System.out.println("Resultado da operação = " + result);
                    break;
                case 3:
                    System.out.println("Digite o primeiro número da operação:");
                    calc1 = in.nextDouble();
                    System.out.println("Digite o segundo número da operação:");
                    calc2 = in.nextDouble();
                    result = calc1 / calc2;
                    System.out.println("Resultado da operação = " + result);
                case 4:
                    System.out.println("Digite o primeiro número da operação:");
                    calc1 = in.nextDouble();
                    System.out.println("Digite o segundo número da operação:");
                    calc2 = in.nextDouble();
                    result = calc1 - calc2;
                    System.out.println("Resultado da operação = " + result);
            }

            System.out.println("\nDigite 1 para continuar ou 2 para sair: ");
            retorno = in.nextByte();

        } while (retorno == 1);
    }
}
