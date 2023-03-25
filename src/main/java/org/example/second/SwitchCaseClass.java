package org.example.second;

import java.util.Calendar;

public class SwitchCaseClass {
//    public enum daysOfTheWeek {
//        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
//    }


//    List<String> daysOfTheWeek = new ArrayList<>();
//    daysOfTheWeek.add("Monday");

    static String[] daysOfTheWeek = {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"};

//    static String[] dayOfWeek = new DateFormatSymbols().getWeekdays(); 

    public static void main(String[] args) {

        int randomNumb = (int) (Math.random() * (7) + 1);

        // if we have number 4 we need get thursday

        System.out.println(randomNumb);

        switch (randomNumb) {
            case 1:
                System.out.println("today is " + daysOfTheWeek[0]);
                break;
            case 2:
                System.out.println("today is " + daysOfTheWeek[1]);
                break;
            case 3:
                System.out.println("today is " + daysOfTheWeek[2]);
                break;
            case 4:
                System.out.println("today is " + daysOfTheWeek[3]);
                break;
            case 5:
                System.out.println("today is " + daysOfTheWeek[4]);
                break;
            case 6:
                System.out.println("today is " + daysOfTheWeek[5]);
                break;
            case 7:
                System.out.println("today is " + daysOfTheWeek[6]);
                break;

        }
        int yourDate = 21;

        Calendar c = Calendar.getInstance();
//        c.setTime(yourDate);
        int dayOfWeek = c.get(Calendar.DAY_OF_MONTH);
        int monthOfYears = c.get(Calendar.MONTH);
        int yearsOfWeek = c.get(Calendar.YEAR);
        System.out.println("today is: "+ dayOfWeek + "." + monthOfYears + "." + yearsOfWeek);
        int timeOfShit = c.get(Calendar.HOUR);
        int minuteOfShit = c.get(Calendar.MINUTE);
        System.out.println("time now is: " + timeOfShit + ":" + minuteOfShit);

        int i = 9;
        do {
            System.out.println(i + " sdds  ");
            i++;
        } while (i <= 10);

        int num1 = 0;
        int num2 = 1;
        int result = num1 + num2;

        System.out.print(num1 + " " + num2 + " ");
        while (result < 150) {
            System.out.print(result + " ");
            num1 = num2;
            num2 = result;
            result = num1 + num2;
        }
    }

}
