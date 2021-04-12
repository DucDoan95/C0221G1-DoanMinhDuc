package bai_tap.deploy_method_linkedlist;

public class MyLinkedListTest {
    public static void main(String[] args) {
        class Student {
            private String name;
            private int id;

            public Student() {
            }

            public Student(int id, String name) {
                this.name = name;
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "student1");
        Student student2 = new Student(2, "student2");
        Student student3 = new Student(3, "student3");
        myLinkedList.addFirst(student1);
        myLinkedList.addFirst(student2);
        myLinkedList.addFirst(student3);
        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();
        System.out.println(myLinkedList.contains(student2));
        System.out.println(myLinkedList.indexOf(student2));
        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }

        for (int i = 0; i < cloneLinkedList.size(); i++) {
            Student student = (Student) cloneLinkedList.get(i);
            System.out.println(student.getName());
        }
    }
}
