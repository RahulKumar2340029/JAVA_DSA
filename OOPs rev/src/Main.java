import static Message.Main.message;//

public class Main {
    public static void main(String[] args) {
//     Student[] students = new Student[5];
//     Student kunal = new Student();
//        System.out.println(kunal.marks);
        message();
//        Main greet = new Main();
//        greet.greeting();
        fun();
    }
    static void fun(){//i cant help you greeting make obj then come into my house i will help then,but first i print and then you execute
        System.out.println("Hello, are you in fun??");
        Main main = new Main();
        main.greeting();
    }
    void fun2(){//greeting i am also non-static, i cant help you but we dont neet two obj i will go in main make obj and you can use my obj , greeting: thanks yaar, fun2 : no prblm we both are same
        greeting();
    }
    void greeting(){

        System.out.println("Hello world");//static method can be accessed via static methods or by creating object in main function
    }
}
    class Student {
        int rno;
        String name;
        float marks;

        public Student() {
            this.rno = 15;
            this.name ="Kunal kushwaha";
            this.marks = 84.3f;
        }
    }
