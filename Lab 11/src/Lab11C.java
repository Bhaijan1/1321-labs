class KoalaBear {

    float weight;


    KoalaBear(float initialW){

        weight = initialW;

    }

    void eat (int leaves){

        weight = weight + ((float)leaves/1000);

    }

    void showWeight(){

        System.out.println("This koala weighs " + weight + " kilos");


    }


}


public class Lab11C {

    public static void main (String[] args){

        KoalaBear koala = new KoalaBear(100);


        koala.eat(400);

        koala.showWeight();


        koala.eat(300);

        koala.showWeight();


        koala.eat(650);

        koala.showWeight();

    }

}