import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextInt();
        float pen = sc.nextInt();
        float eraser = sc.nextInt();
        float tol = pencil + pen + eraser;
        float tax = (tol/100) * 18;
        float after_tax = tol+tax;

        System.out.println("Total : " + tol);
        System.out.println("Total after 18% tax : " + after_tax);

    }
}
