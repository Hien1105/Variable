package CodeGym;

import java.util.Scanner;

public class BaiTap2_DoiNhietDo {
    public static void main(String[] args) {
        float c;
        float f;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Celsius = ");
        c = scanner.nextFloat();

        f = 9*c/5 + 32;
        System.out.println("Fahrenheit = "+f);
    }
}
