import java.util.Scanner;

public class calcBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi sua nota?: ");
        int nota = scanner.nextInt();

        System.out.println("Quantos anos você ficou em casa?: ");
        int casa = scanner.nextInt();

        System.out.println("Qual seu salário?: ");
        float salario = scanner.nextFloat();

        if ((nota >= 8) && (casa >= 5)){
            System.out.println("Você tem direito a um bônus de 3 salários!");
            float bonus = salario * 3;
            System.out.println("Bônus: " + bonus);
        }
        else if ((nota >= 8) && (casa <5)) {
            System.out.println("Você tem direito a um bônus de 2 salários!");
            float bonus = salario * 2;
            System.out.println("Bônus: " + bonus);

        }
        else if ((nota >= 6) && (nota < 7.9)) {
            System.out.println("Você tem direito a um bônus de 1 salário!");
            float bonus = salario * 1;
            System.out.println("Bônus: " + bonus);

        }else {
            System.out.println("Você não tem direito a bônus...");
        }
    }
}
