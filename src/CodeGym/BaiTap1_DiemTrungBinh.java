package CodeGym;

import java.util.Scanner;

public class BaiTap1_DiemTrungBinh {
    public static void main(String[] args) {
        float physics;
        float chemistry;
        float biology;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter physics: ");
        physics = scanner.nextFloat();

        System.out.println("Enter chemistry: ");
        chemistry = scanner.nextFloat();

        System.out.println("Enter biology: ");
        biology = scanner.nextFloat();

        float sum = physics + chemistry + biology;
        float average = sum/3;

        System.out.println("Average: " +average);
        System.out.println("Sum: " +sum);
    }
}

