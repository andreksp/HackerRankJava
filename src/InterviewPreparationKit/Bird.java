package InterviewPreparationKit;

import java.time.Period;

public abstract class Bird {
    public Bird() {
        System.out.println("Bird");
    }
    public Bird(int i)
    {
        System.out.println("Bird" + i);
    }
    public static void main(String[] args) {
        Bird bird = new Pelican(2);

        Period p = Period.of(1,2,3);

        
    }
}

