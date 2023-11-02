import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class student
{
    private final String name;
    private LocalDate birthDate;

    public student(String name, LocalDate birthDate)
    {
        this.name = name;
        this.birthDate = birthDate;
    }

    public String getName()
    {
        return name;
    }

    public LocalDate getBirthDate()
    {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate)
    {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public String getFormattedBirthDate(String format)
    {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        return birthDate.format(formatter);
    }
}