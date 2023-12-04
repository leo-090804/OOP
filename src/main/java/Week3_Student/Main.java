package Week3_Student;

public class Main {
    public static void main(String[] args) {
        // Quản lý sinh viên
        StudentManagement management = new StudentManagement();
        // Tạo đối tượng Student
        Student student1 = new Student("Nguyen Van A", "17020001", "17020001@vnu.edu.vn");
        Student student2 = new Student("Nguyen Van B", "17020002", "17020002@vnu.edu.vn");
        Student student3 = new Student("Nguyen Van C", "17020003", "17020003@vnu.edu.vn");
        Student student4 = new Student("Nguyen Van D", "17020004", "17020004@vnu.edu.vn");
        Student student5 = new Student("Nguyen Van E", "17020005", "17020005@vnu.edu.vn");
        Student student6 = new Student("Nguyen Van F", "17020006", "17020006@vnu.edu.vn");

        // In thông tin sinh viên
        System.out.println(student1.getInfo());
        System.out.println(student2.getInfo());
        System.out.println(student3.getInfo());
        System.out.println(student4.getInfo());
        System.out.println(student5.getInfo());

        student1.setGroup("K67A");
        student2.setGroup("K67B");
        student3.setGroup("K67A");
        student4.setGroup("K67C");
        student5.setGroup("K67C");
        student6.setGroup("K67B");

        // Kiểm tra cùng lớp
        System.out.println(management.sameGroup(student1, student6)); // false

        System.out.println(management.sameGroup(student1, student3)); // true

        // Thêm sinh viên
        management.addStudent(student1);
        management.addStudent(student2);
        management.addStudent(student3);
        management.addStudent(student4);
        management.addStudent(student5);
        management.addStudent(student6);
        // In danh sách theo lớp
        System.out.println(management.studentsByGroup());

        // Xóa sinh viên
        management.removeStudent("17020001");

        // In danh sách sau khi xóa
        System.out.println(management.studentsByGroup());
    }
}
