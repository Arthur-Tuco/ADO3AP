import java.util.Scanner;

public class acesso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?: ");
        System.out.println("Qual ser cargo? (Administrador, Gerente, Operador): ");
        System.out.println("Quantas horas extras você trabalhou?: ");

        String nome = scanner.next();
        String cargo = scanner.next();
        int horas = scanner.nextInt();

        if (cargo.equalsIgnoreCase("Administrador")){
            int dinheiro = 50 * horas;
            System.out.printf("Bem vindo, %s %s!", cargo, nome);
            System.out.printf("\nVocê teve um total de %d horas extras, resultando em um total de R$%d!", horas, dinheiro);

        } else if (cargo.equalsIgnoreCase("Gerente")) {
            int dinheiro = 35 * horas;
            System.out.println();
            System.out.printf("Bem vindo, %s %s!", cargo, nome);
            System.out.printf("\nVocê teve um total de %d horas extras, resultando em um total de R$%d!", horas, dinheiro);
            
        } else if (cargo.equalsIgnoreCase("Operador")) {
            int dinheiro = 20 * horas;
            System.out.printf("Bem vindo, %s %s!", cargo, nome);
            System.out.printf("\nVocê teve um total de %d horas extras, resultando em um total de R$%d!", horas, dinheiro);

        }else {
            System.out.println("Cargo inválido");
        }
    }
}
