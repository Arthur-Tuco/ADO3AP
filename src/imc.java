import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class imc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso e altura (em Metros): ");
        float peso = scanner.nextFloat();
        float altura = scanner.nextFloat();

        float imc = (peso / (altura * altura));
        System.out.println(imc);

        if (imc < 18.5){
            System.out.println("Abaixo do peso");
        }
        else if ((imc >= 18.5) && (imc < 24.9)){
            System.out.println("Peso normal");
        }
        else if ((imc >= 25) && (imc <29.0)){
            System.out.println("Sobrepeso");
        }
        else if ((imc >= 30) && (imc < 34.9)){
            System.out.println("Obesidade grau I");
        }
        else {
            System.out.println("Obesidade grau II ou superior");
        }
    }
}