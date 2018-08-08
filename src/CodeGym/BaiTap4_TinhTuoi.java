package CodeGym;

import java.util.Calendar;
import java.util.Scanner;

public class BaiTap4_TinhTuoi {
    public static void main(String[] args) {
        int age;
        int birthyear;

        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter BirthYear: ");
        birthyear = scanner.nextInt();

        age = year - birthyear;
        System.out.println("Age = " + age);
    }
}


