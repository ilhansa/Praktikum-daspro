package Praktikum05;

import java.util.Scanner;

public class PemilihanHari7 {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String dayName, dayType;
    System.out.print("Input Day Name: ");
    dayName = sc.nextLine();

    switch (dayName.toLowerCase()) {
        case "monday":
        case "tuesday":
        case "wednesday":
        case "thursday":
        case "friday":
        dayType = "weekday";
            
            break;
            case "saturday":
            case "sunday":
    dayType = "weekend";
    
        break;
    default:
    dayType = "Invalid Day Name";
   
}
System.out.println(dayName + " is a " + dayType);
    sc.close();
}

}
