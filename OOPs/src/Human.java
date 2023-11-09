public class Human {
    String name;
    int age;
    int salary;
    boolean married;
    static long population ;
    Human(String name,int age,int salary,boolean marryornot){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.married = marryornot;
        Human.population +=1;
    }
}
