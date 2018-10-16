package ba.unsa.etf.rpr;

import java.util.Scanner;

public class Main {

    public static int sumaCifara (int n) {
        int suma=0;
        do {
            suma+=n%10;
            n/=10;
        } while(n!=0);
        return suma;
    }
    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
        Scanner ulaz = new Scanner(System.in);
        int n = ulaz.nextInt();
        for (int i=1; i<=n; i++) {
            if(i%sumaCifara(i)==0) System.out.println(i);
        }
    }
}
