import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite as 4 notas do aluno");
        Scanner n1 = new Scanner(System.in);
        Scanner n2 = new Scanner(System.in);
        Scanner n3 = new Scanner(System.in);
        Scanner n4 = new Scanner(System.in);


        Media aluno = new Media();

        aluno.setNota1(n1.nextFloat());
        aluno.setNota2(n2.nextFloat());
        aluno.setNota3(n3.nextFloat());
        aluno.setNota4(n4.nextFloat());

        System.out.println("A média do aluno é: " + aluno.calculaMedia());

    }
}