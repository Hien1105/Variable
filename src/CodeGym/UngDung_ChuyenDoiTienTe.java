package CodeGym;

import java.util.Scanner;

public class UngDung_ChuyenDoiTienTe {
    public static void main(String[] args) {
        long rate = 23000;
        double usd;
        double vnd;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao so USD can doi: ");
        usd = scanner.nextDouble();

        System.out.println("Ti gia hien tai 1 USD = "+rate+ " VND");

        vnd = rate*usd;
        System.out.println("So tien doi ra VND la: "+vnd);
    }
}

