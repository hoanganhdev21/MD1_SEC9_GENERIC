package collection;

import generic.Student;

import java.util.HashMap;
import java.util.Map;

public class Map_Demo {
    public static void main(String[] args) {
        //Key: duy nhất
        Map<Integer, Student> mapStudent = new HashMap<>();
        Student student1 = new Student("SV001", "Nguyễn Văn A", 25);
        Student student2 = new Student("SV002", "Nguyễn Văn B", 20);
        Student student3 = new Student("SV003", "Nguyễn Văn C", 27);
        //1.put(k,value): thêm 1 phần tử
        mapStudent.put(1,student1);
        mapStudent.put(2,student2);
        mapStudent.put(3,student3);
        //2. (key,value) get(K key): Lấy đối tượng theo value
        System.out.println("Đối tượng sinh viên 2: "+mapStudent.get(1));
        //3. boolean contains(K key): Kiểm tra key có tồn tại trong map ko
        System.out.println("Kiểm tra key = 4 có trong map ko: "+mapStudent.containsKey(4));
        //4. E remove(K key): Xóa phần tử theo key
        mapStudent.remove(2);
        //5. In ra thông tin các sinh viên
        mapStudent.values().forEach(student -> System.out.println(student));
        //6. In ra các key
        mapStudent.keySet().forEach(key -> System.out.println(key));

        System.out.println("Thông tin map:");
        mapStudent.forEach((key, value) -> System.out.println("Key:"+key+" - "+value));

    }
}
