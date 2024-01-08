package collection;

import generic.Student;

import java.util.Stack;

public class Stack_Demo {
    public static void main(String[] args) {
        Stack<Student> stackStudent = new Stack<>();
        Student student1 = new Student("SV001", "Nguyễn Văn A", 25);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 20);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 27);
        //1. E push(Object o): Thêm phần tử o
        stackStudent.push(student1);
        stackStudent.push(student2);
        stackStudent.push(student3);
        //2. boolean empty(): kiểm tra danh sách có phần tử chưa
        System.out.println("Kiểm tra danh sách có empty ko: "+stackStudent.isEmpty());
        //3. E peek(): Lấy phần tử trên đầu stack
        System.out.println("Phần tử trên đầu stack: "+stackStudent.peek());
        //4. E pop(): lấy phần tử trên đầu stack và xóa phần tử đó
        System.out.println("Phần tử trên đầu và xóa pop: "+stackStudent.pop());
        System.out.println("Thông tin stack:");
        stackStudent.forEach(student -> System.out.println(student));
    }
}
