package serviceUtil;

import main.Cities;
import util.Util;

import java.util.LinkedList;

public class Service {

    public static void menu1() throws Exception {
        String info = Util.fillUserInfo();
        System.out.println(info);
        System.out.println("Welcome....");
        String city = Util.enterString("Where do you want to go?");
        String toUpperCity = city.toUpperCase();
        System.out.println("Checking destinations for " + toUpperCity);
        Thread.sleep(5000);
        Cities cities = new Cities();
        LinkedList<String> list = cities.getList();//NEW YORK
        if (list.contains(toUpperCity)) {
            System.out.println("There are available trips for " + toUpperCity + " ...");
            String tripInfo = Util.fillTripInfo();
            System.out.println(tripInfo);

        } else {
            System.out.println("There are no available trips\tHere are the active trips");
            Cities cities2 = new Cities();
            LinkedList<String> list1 = cities2.getList();
            for (String s : list1) {
                System.out.println(s);
            }
        }
    }

    public static void menu2() {
        String info = Util.fillUserInfo();
        System.out.println(info);
        String carType = Util.enterString("Please enter your car type");
        String placeTo = Util.enterString("Where do you ride?");
        String placeFrom = Util.enterString("Your current location?");
        int capacity = Util.enterInteger("How many passengers you can carry");
        String requires = Util.enterString("Enter Requires: For example:(SMOKING-NO," +
                "PET-Yes,Luggage-No)");
        System.out.println("Car type:" + carType + " from " + placeFrom + " to " + placeTo + " with " + capacity +
                " passengers and with these requires: " + requires);
    }

    public static void menu3() {
        System.out.println("BlaBlaCar is a French online marketplace for carpooling.\n" +
                " Its website and mobile apps connect drivers and passengers willing to travel together " +
                "between cities and share the cost of the journey.\n" +
                "The platform had 70 million users in 2019 and is available in 22 countries." +
                " \nAlmost all of which are in Europe and Latin America – countries include:\n " +
                "Belgium, Brazil, Croatia," +
                " Czech Republic, France, Germany, Hungary, India, Italy, Luxembourg, Mexico, \nThe Netherlands, " +
                "Poland, Portugal, Romania, Russia, Serbia, Slovakia, Spain, Turkey, Ukraine, " +
                "and the United Kingdom.");
    }
}
