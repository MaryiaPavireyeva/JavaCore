package comparatorAndComparable;

import java.util.Comparator;

public class StudentsDeptComparator implements Comparator<Students> {
    @Override
    public int compare(Students s1, Students s2) {
        return s1.getDeparture().compareTo(s2.getDeparture());
    }
}
