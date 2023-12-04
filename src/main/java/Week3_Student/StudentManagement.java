package Week3_Student;

import java.util.ArrayList;

public class StudentManagement {
    private Student[] students = new Student[100];
    private int stdCount = 0;

    /**
     * javadoc.
     */
    public static boolean sameGroup(Student s1, Student s2) {
        return (s1.getGroup()).equals(s2.getGroup());
    }

    /**
     * javadoc.
     */
    public void addStudent(Student newStudent) {
        if (stdCount < 100) {
            students[stdCount] = newStudent;
            stdCount++;
        } else {
            System.out.println("Student list is full");
        }
    }

    /**
     * javadoc.
     */
    public String studentsByGroup() {
        StringBuilder listStudent = new StringBuilder();
        ArrayList<String> groupList = new ArrayList<>();
        ArrayList<String> idList = new ArrayList<>();
        for (int i = 0; i < stdCount; i++) {
            String groupName = students[i].getGroup();
            if (!groupList.contains(groupName)) {
                listStudent.append(groupName).append("\n");
            }
            for (int j = 0; j < stdCount; j++) {
                if (groupName.equals(students[j].getGroup())
                        && !idList.contains(students[j].getId())) {
                    listStudent.append(students[j].getInfo()).append("\n");
                    idList.add(students[j].getId());
                }
            }
            groupList.add(groupName);
        }
        return listStudent.toString();
    }

    /**
     * javadoc.
     */
    public void removeStudent(String id) {
        int index = -1;
        for (int i = 0; i < stdCount; i++) {
            if (id.equals(students[i].getId())) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("No student with that ID exists");
        } else if (index >= 0) {
            for (int i = index; i < (stdCount - 1); i++) {
                students[i] = students[i + 1];
            }
            students[stdCount - 1] = null;
            stdCount--;
        }
    }
}
