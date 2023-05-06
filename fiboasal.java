
import java.util.ArrayList;
import java.util.List;
// fatih ozkaynak soru 38

public class asalfibo {
    /*
     * fibo--> 1,1,2,3,5,8,13
     * asal--> 2,3,5,7,11
     * 
     */
    public static void main(String[] args) {
        // System.out.println(fibobul(7));
        // System.out.println(asalBul(3));
        // asalBul(5);
        System.out.println(hesapla(1, 8));

    }

    public static double hesapla(int x, int terimSayisi) {
        int fibo = 1;
        int asal = 2;
        int bolum = 3;
        double toplam = 0;

        for (int i = 0; i < terimSayisi; i++) {
            if (i % 2 == 0) {
                toplam -= ((fibobul(fibo) * asalBul(asal)) / (bolum * x));
            } else {
                toplam += +((fibobul(fibo) * asalBul(asal)) / (bolum * x));
            }
            fibo += 2;
            asal += 3;
            bolum += 4;

        }

        return toplam;
    }

    public static int fibobul(int n) {
        List<Integer> fibo = new ArrayList<Integer>();
        fibo.add(0, 1);
        fibo.add(1, 1);
        for (int i = 2; i < n; i++) {
            fibo.add(i, fibo.get(i - 1) + fibo.get(i - 2));
        }
        return fibo.get(n - 1);
    }

    public static int asalBul(int n) {
        List<Integer> asallar = new ArrayList<Integer>();
        int kontrol;
        for (int i = 2; i < 1000; i++) {
            kontrol = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    kontrol = 1;
                }
            }
            if (kontrol == 0) {
                asallar.add(i);
            }
        }
        return asallar.get(n - 1);
    }

}
