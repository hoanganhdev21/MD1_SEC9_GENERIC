package collection;

import generic.Student;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class List_LinkedList {
    public static void main(String[] args) {
        LinkedList<Student> linkedListStudent = new LinkedList<>();
        Student student1 = new Student("SV001", "Nguyễn Văn A", 25);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 20);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 27);
        Student student4 = new Student("SV004", "Nguyễn Văn D", 22);
        Student student5 = new Student("SV005", "Nguyễn Văn E", 26);
        linkedListStudent.add(student1);
        linkedListStudent.add(student2);
        linkedListStudent.add(student3);
        //1. E addFirst(Object o): thêm đối tượng o vào đầu danh sách
        linkedListStudent.addFirst(student4);
        //2. E addLast(Object o): Thêm đối tượng o vào cuối danh sách
        linkedListStudent.addLast(student5);
        //3. E removeFirst(): xóa phần tử đầu của danh sách
        linkedListStudent.removeFirst();
        //4. E removeLast(): xóa phần tử đầu của danh sách
        linkedListStudent.removeLast();
        System.out.println("Thông tin danh sách liên kết: ");
        linkedListStudent.forEach(student -> System.out.println(student));
        //Sắp xếp danh sách theo tuổi tăng dần
        Collections.sort(linkedListStudent, new Comparator<Student>() {
            @Override
            public int compare(Student student, Student t1) {
                return student.getAge()-t1.getAge();
            }
        });
        System.out.println("Thông tin danh sách liên kết sau khi sắp xếp: ");
        linkedListStudent.forEach(student -> System.out.println(student));

    }
}
