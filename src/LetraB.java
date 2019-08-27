import java.util.Scanner;

public class LetraB {

    public static double numero;
    public static double dobro;

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o numero:");
        numero = scanner.nextDouble();
        dobro = numero *2;
        System.out.println("O dobro do numero é: " + dobro);


    }
}
