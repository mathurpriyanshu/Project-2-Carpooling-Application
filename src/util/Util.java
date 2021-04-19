package util;

import java.util.Scanner;

public class Util {
    public static String enterString(String title) {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;

    }

    public static int enterInteger(String title) {
        System.out.println(title);
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();
        return answer;
    }

    public static String fillUserInfo() {
        String nameSurname = enterString("Enter name and surname");
        String email = enterString("Enter your email");
        String phone = enterString("Enter your number");
        return "name: " + nameSurname + ", email " + email + ", phone:" + phone;
    }

    public static String fillTripInfo() {
        String location = enterString("Your current location");
        int passenger = enterInteger("How many passengers will travel?");
        String time=enterString("Enter time:");
        String requires = enterString("Enter Requires: For example:(SMOKING-NO," +
                "PET-Yes,Luggage-No)");
        return "Your destination from " + location + " with " + passenger + " passengers and with these requires:" +
                " " + requires+" in "+time;
    }

}
