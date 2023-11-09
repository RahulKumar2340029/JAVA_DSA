package Collections;

public class enumexample {
    enum week{
        monday ,tuesday,wednesday,thursday,friday,saturday,sunday;
    }

    public static void main(String[] args) {
        week w;
        for (week day:week.values()) {
            System.out.println(day);
        }
    }
    
}
