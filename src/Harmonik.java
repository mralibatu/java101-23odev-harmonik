import java.util.Scanner;
public class Harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n sayisini giriniz : ");
        int n = input.nextInt();
        double sonuc = 0.0;

        for(int i = 1; i <=n; i++){

            sonuc += (1.0/i);

        }
        System.out.println(sonuc);
    }
}
