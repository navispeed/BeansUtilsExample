import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        final ClassA classA = new ClassA(Calendar.getInstance());
        final ClassB classB = new ClassB();
        BeanUtils.copyProperties(classB, classA);
        System.out.println("Class A: " + classA);
        System.out.println("Class B: " + classB);

        final ClassB classBBis = new ClassB(new GregorianCalendar(2019, 0, 1));
        final ClassA classABis = new ClassA();

        BeanUtils.copyProperties(classABis, classBBis);

        System.out.println("Class A Bis: " + classABis);
        System.out.println("Class B Bis: " + classBBis);

    }
}
