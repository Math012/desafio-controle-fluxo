import exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o primeiro parametro inteiro: ");
        int patametro1 = scanner.nextInt();

        System.out.println("Informe o segundo parametro inteiro: ");
        int patametro2 = scanner.nextInt();

        try {
            if (patametro1 > patametro2){
                throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
            }
            contar(patametro1,patametro2);
        }catch (ParametrosInvalidosException e){
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }
    }

    static void contar(int parametro1, int parametro2){
        int number = 1;
        for (int i=parametro1; i<parametro2;i++){
            System.out.println("Imprimindo o número " + number);
            number++;
        }
    }
}