import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class tsk4
{
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter day: ");
        int day = scanner.nextInt();
        System.out.print("Enter hour: ");
        int hour = scanner.nextInt();
        System.out.print("Enter minute: ");
        int minute = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day, hour, minute);
        Date date = calendar.getTime();

        System.out.println("Date: " + date);
        System.out.println("Calendar: " + calendar.getTime());
    }
}