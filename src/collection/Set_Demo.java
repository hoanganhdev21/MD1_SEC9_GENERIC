package collection;

import generic.Student;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_Demo {
    public static void main(String[] args) {
        List<Student> listStudent = new ArrayList<>();
        Student student = new Student("SV001","Nguyễn Văn A",20);
        listStudent.add(student);
        listStudent.add(student);
        listStudent.add(null);
        System.out.println("Thông tin list:");
        listStudent.forEach(student1 -> System.out.println(student1));
        Set<Student> setStudent = new HashSet<>();
        setStudent.add(student);
        setStudent.add(student);
        setStudent.add(null);
        System.out.println("Thông tin set:");
        setStudent.forEach(student1 -> System.out.println(student1));
    }
}
