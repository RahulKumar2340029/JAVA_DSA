package innerclass;

public class innerclass {
    static class Student{
        String name;
        String dept;
        int age;
    }

    public static void main(String[] args) {
        Student s1=  new Student();
        Student s2 = new Student();
        s1.name = "Rahul kumar";
        s1.dept = "MACS";
        s1.age = 22;
        System.out.println(s1.name);

    }
}

