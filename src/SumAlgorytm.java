import java.util.Scanner;

public class SumAlgorytm {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("wpisz liczbę dodatnią mniejszą od 100:");
        for (int x = 0; (x ^ 2) < 100; x = sc.nextInt()) {

            if ((x ^ 2) < 100 ) {
                sum += x;
            }
        }
       if (sum == sum % 2){
           System.out.println("wyświetl " + sum);
        }
    }
}
