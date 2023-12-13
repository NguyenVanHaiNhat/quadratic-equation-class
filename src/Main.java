import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a : ");
        double a = scanner.nextDouble();
        System.out.println("Enter b : ");
        double b = scanner.nextDouble();
        System.out.println("Enter c : ");
        double c = scanner.nextDouble();

        QuadraticEquation delta = new QuadraticEquation(a, b, c);

        if (delta.getDiscriminant() >= 0){
            System.out.println("root 1: " + delta.getRoot1() + "," +" root 2: " + delta.getRoot2());
        } else if (delta.getDiscriminant() == 0){
            System.out.println(delta.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }
    }
}