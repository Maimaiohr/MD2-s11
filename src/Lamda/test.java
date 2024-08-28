package Lamda;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Mai"));
        students.add(new Student(3,"Hoa"));
        students.add(new Student(2,"Nga"));

        students.sort((o1, o2) -> o1.getId()-o2.getId());
    }
}
