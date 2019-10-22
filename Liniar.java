import java.util.Random;
import java.util.Scanner;

public class Liniar{
    // x(i+1) = (a * x(i) + b) % m.
    Random rand = new Random();
    final static int a = 25173;
    int b = rand.nextInt(50000);
    final static int m = 32768;
    //int m = rand.nextInt(50000);
    int x;

    public Liniar() {
        x = m / 2; //setarea valorii lui x la m.2
    }

    double next() {
        x = (a * x + b) % m; //calculeaza urmatoarea varianta din secventa
        return (double)x / m;
    }

    public static void main(String[] args) {
        // crea o instanta de lnr
        Liniar r = new Liniar();
        Scanner no = new Scanner(System.in);
        int nr = no.nextInt();
        for (int i = 0; i < nr; i++) {
            System.out.println (r.next());
        }
    }
}