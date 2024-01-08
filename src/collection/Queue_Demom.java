package collection;

import generic.Student;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Demom {
    public static void main(String[] args) {
        Queue<Student> queueStudent = new LinkedList<>();
        Student student1 = new Student("SV001", "Nguyễn Văn A", 25);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 20);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 27);
        //1. E offer(Object o): Thêm phần tử o
        queueStudent.offer(student1);
        queueStudent.offer(student2);
        queueStudent.offer(student3);
        //2. E poll(): lấy phần tử đầu, không xóa, ko có trả về null
        System.out.println(queueStudent.poll());
        //3. E peek(): lấy phần tử đầu, xóa phần tử đó luôn, ko có trả về null
        System.out.println(queueStudent.peek());


        System.out.println("Thông tin Queue:");
        queueStudent.forEach(student -> System.out.println(student));
    }
}
