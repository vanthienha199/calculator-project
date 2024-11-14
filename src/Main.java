import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hay nhap so thu nhat: ");
        int a = scanner.nextInt();
        System.out.print("Hay nhap so thu hai: ");
        int b = scanner.nextInt();
        Calculator calculator = new Calculator();
        System.out.println("Ban muon lam gi: ");
        System.out.println("1. Phep cong");
        System.out.println("2. Phep tru");
        System.out.println("3. Phe nhan");
        System.out.println("4. Phep chia");
        int c = scanner.nextInt();
        switch(c) {
            case 1:
                System.out.println("Ket qua: " + calculator.add(a, b));
                break;
            case 2:
                System.out.println("Ket qua: " + calculator.subtract(a, b));
                break;
            case 3:
                System.out.println("Ket qua: " + calculator.multiply(a, b));
                break;
            case 4:
                System.out.println("Ket qua: " + calculator.divide(a, b));
                break;
        }
    }
}
