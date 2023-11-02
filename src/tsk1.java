import java.util.Date;
public class tsk1
{
    public static void task1()
    {
        System.out.println("Фамилия разработчика: Trukhachev");
        Date currentDate = new Date();
        System.out.println("Дата получения задания: " + currentDate);
        Date dueDate = new Date(System.currentTimeMillis());
        System.out.println("Дата окончания: " + dueDate);
    }
}
