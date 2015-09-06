package ACO7.week4.day1;

/**
 * Created by acer on 11.08.2015.
 */
import java.util.Arrays;
import java.util.Comparator;

public class Ex2 {
    public static void main(String[] args) {
        Coin coin1 = new Coin(5, 1.5);
        Coin coin2 = new Coin(50, 1.3);
        Coin coin3 = new Coin(10, 0.5);
        Coin coin4 = new Coin(10, 0.5);
        Coin coin5 = new Coin(10, 0.5);
        System.out.println(coin1.equals(coin2));
        System.out.println(coin4.equals(coin5));

        Coin[] wallet = new Coin[5];
        wallet[0] = coin1;
        wallet[1] = coin2;
        wallet[2] = coin3;
        wallet[3] = coin4;
        wallet[4] = coin5;

        for (Coin coin : wallet) {
            System.out.println(coin);
        }
        sort(wallet);
        System.out.println("After sort");
        for (Coin coin : wallet) {
            System.out.println(coin);
        }

        CoinSizeComparator comparator = new CoinSizeComparator();
//    sort(wallet, comparator);
        sort(wallet, new Comparator<Coin>() {
            @Override
            public int compare(Coin coin1, Coin coin2) {
                if (coin1.getSize() > coin2.getSize()) {
                    return 1;
                } else if (coin1.getSize() < coin2.getSize()) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println("~~~~~~~~~~");
//    Arrays.sort(wallet, comparator);
        System.out.println("After comparator sort");


        for (Coin coin : wallet) {
            System.out.println(coin);
        }


//    System.out.println(Arrays.toString(wallet));

        Arrays.sort(wallet, comparator);
    }

    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    Comparable temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void sort(Coin[] arr, Comparator<Coin> comparator) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    Coin temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static class CoinSizeComparator implements Comparator<Coin> {

        public int compare(Coin coin1, Coin coin2) {
            if (coin1.getSize() > coin2.getSize()) {
                return 1;
            } else if (coin1.getSize() < coin2.getSize()) {
                return -1;
            }
            return 0;
        }
    }
}
