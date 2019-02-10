import java.util.GregorianCalendar;

public class ClassB {

    private GregorianCalendar calendar;

    public ClassB() {
    }

    public ClassB(GregorianCalendar calendar) {
        this.calendar = calendar;
    }

    public GregorianCalendar getCalendar() {
        return calendar;
    }

    public void setCalendar(GregorianCalendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return "ClassB{" +
                "calendar=" + calendar +
                '}';
    }
}
