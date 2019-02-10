import java.util.Calendar;

public class ClassA {

    private Calendar calendar;

    public ClassA() {
    }

    public ClassA(Calendar calendar) {
        this.calendar = calendar;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public String toString() {
        return "ClassA{" +
                "calendar=" + calendar +
                '}';
    }
}
