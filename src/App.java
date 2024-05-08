import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Contador cont = new Contador();

        System.out.println("Por favor digite o primeiro número:");
        int n1 = sc.nextInt();
        System.out.println("Por favor digite o segundo número:");
        int n2 = sc.nextInt();

        cont.contador(n1, n2);

        sc.close();
    }
}
