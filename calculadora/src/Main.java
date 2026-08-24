import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o 1° número inteiro: ");
        int primeiroNumero = sc.nextInt();
        System.out.print("Agora digite o 2° número inteiro: ");
        int segundoNumero = sc.nextInt();

        int resultado = primeiroNumero + segundoNumero;
        System.out.println("A soma de " + primeiroNumero + " + " + segundoNumero + " é igual a: " + resultado);

        sc.close();
    }
}