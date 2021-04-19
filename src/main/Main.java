package main;

import serviceUtil.Service;
import util.Util;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Bla-BlaCar Application\n\tYour Ride and Your Choice");
        String nationality = Util.enterString("Please tell us,are you a foreign or native?");
        Scanner scanner = new Scanner(System.in);
        String services = "1:Find Ride\n" +
                "2:Offer Ride\n" +
                "3:About Us\n" +
                "0:Quit";
        while (true) {
            String information = "";
            if (nationality.equalsIgnoreCase("foreign")) {
                information = Util.enterString("Enter your passport id:");
                System.out.println("Checking passport id for :" + information);
                Thread.sleep(5000);
                System.out.println("Process Completed successfully");
            } else if (nationality.equalsIgnoreCase("native")) {
            } else {
                System.out.println("Invalid operation");
                break;
            }
            System.out.println(services);
            int menu = scanner.nextInt();
            if (menu == 1) {
                Service.menu1();
                break;
            } else if (menu == 2) {
                Service.menu2();
                break;
            } else if (menu == 3) {
                Service.menu3();
                break;
            } else if (menu == 0) {
                System.out.println("Quiting from system/application");
                break;
            } else {
                System.out.println("Invalid operation");
                break;
            }
        }
    }
}
