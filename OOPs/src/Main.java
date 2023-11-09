public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student(92,"Kunal Kushwaha",100);
//        Human Rahul  = new Human("Rahul",22,100000,false);
//        Human Kunal = new Human("Kunal ",34,10000,true);
//        Human Arpit = new Human("Arpit",25,15000,true);
//        System.out.println(Rahul.age);
//        System.out.println(Human.population);
//        //ACCESS
//        Access obj = new Access(39,"rahul",12);
        //private error (obj.age)


//        student1.rollno = 42;
//        student1.name = "Rahul Kumar";
//        student1.marks = 92.52f;
//        System.out.println(student1.name);
//        System.out.println(student1.rollno);
//        System.out.println(student1.marks);
//        student1.changename("Raghav");
////        final int rollcode=45;//you can't modify with final keyword
////        rollcode = 100;
//        student1.greeting();
        son obj = new son();
        obj.career("Software Engineer");
        obj.Partner("Arya Kumari",19);
    }
    static void name(){
        System.out.println("Rahul");
    }
    void greeting(){
        name();
    }
    static class Student{
        int rollno;
        String name;
        float marks;
        void changename(String newName){
            name = newName;
        }
        void greeting(){
            System.out.println("Hi! my name is "+this.name);
        }
       Student(int rno,String naam,float number){
           this.rollno = rno;
           this.name = naam;
           this.marks = number;

       }
    }
}