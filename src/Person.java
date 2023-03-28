import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
    String name;
    Date dateOfBirth;

    public Person(String name, String dateOfBirth) {
        Date date = parsedateOfBirth(dateOfBirth);
        this.dateOfBirth = date;
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public static Date parsedateOfBirth(String date) {
        Date dateOfBirth;
        try {
            dateOfBirth = new SimpleDateFormat("dd MM yyyy").parse(date);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return dateOfBirth;
    }

    @Override
    public String toString() {
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
        return  name +" "+ format.format(dateOfBirth);
    }
}



