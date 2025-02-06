# DIO - Trilha Java Básico
www.dio.me

#### Autores
- [Matheus Silva](https://github.com/Math012)

### Configuração

- Java 17.
- IntelliJ

## Controle de Fluxo - Desafio


O sistema deverá receber dois parâmetros via terminal que representarão dois números inteiros, com estes dois números você deverá obter a quantidade de interações (for) e realizar a impressão no console (System.out.print) dos números incrementados, exemplo:

* Se você passar os números 12 e 30, logo teremos uma interação (for) com 18 ocorrências para imprimir os números, exemplo: `"Imprimindo o número 1"`, `"Imprimindo o número 2"` e assim por diante.
* Se o primeiro parâmetro for MAIOR que o segundo parâmetro, você deverá lançar a exceção customizada chamada de `ParametrosInvalidosException` com a segunda mensagem: "O segundo parâmetro deve ser maior que o primeiro"   


1. Crie o projeto `DesafioControleFluxo`
2. Dentro do projeto, crie a classe `Contador.java` para realizar toda a codificação do nosso programa.
3. Dentro do projeto, crie a classe `ParametrosInvalidosException` que representará a exceção de negócio no sistema. 

# Implementação do código abaixo: 

```java
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
```
