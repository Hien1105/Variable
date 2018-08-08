package CodeGym;

import java.util.Scanner;

public class BaiTap3_TinhChuViDienTich {
    public static void main(String[] args) {
        float radius;
        final float PI = 3.14159f;
        float area;
        float perimeter;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius = ");
        radius = scanner.nextFloat();

        area = radius*radius*PI;
        System.out.println("Area = "+area);

        perimeter = radius*2*PI;
        System.out.println("Perimeter = "+perimeter);
    }
}
