class Turtle {

    String color;

    int speed;


    Turtle() {

        speed = 0;

        color = "green";

    }


    Turtle(int s, String c) {

        speed = s;

        color = c;

    }

}


public class Lab11B {

    public static void main(String [] args)

    {

        Turtle t1 = new Turtle();

        Turtle t2 = new Turtle(5,"purple");

        System.out.println(t1.speed);

        System.out.println(t2.color);

    }

}
