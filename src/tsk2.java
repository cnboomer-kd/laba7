import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class tsk2
{
    public static void task2()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате yyyy-MM-dd: ");
        String inputDate = scanner.nextLine();
        LocalDate userDate = LocalDate.parse(inputDate, DateTimeFormatter.ISO_LOCAL_DATE);
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDate currentDate = currentDateTime.toLocalDate();
        if (userDate.isEqual(currentDate))
        {
            System.out.println("Пользовательская дата равна текущей");
        }
        else if (userDate.isBefore(currentDate))
        {
            System.out.println("Пользовательская дата перед текущей");
        }
        else
        {
            System.out.println("Пользовательская дата позже текущей");
        }
    }

}
