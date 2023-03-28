import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getDateOfBirth().before(o2.dateOfBirth)) {
            return 1;
        }
        if (o2.dateOfBirth.before(o1.getDateOfBirth())) {
            return -1;
        }
        return 0;
    }
}
