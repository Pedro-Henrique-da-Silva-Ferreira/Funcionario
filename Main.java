import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Aumento aumento = new Aumento();

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um funcionario:");
        String nome = sc.nextLine();
        System.out.println("Digite o salario do funcionario:");
        Double salario = sc.nextDouble();
        aumento.adiciona(nome, salario);

        System.out.println("Digite o aumento no salario do funcionario.");
        int por = sc.nextInt();
        aumento.contaAumento(por);

        System.out.println("Lista atualizada." + aumento.mostra());

    }
}