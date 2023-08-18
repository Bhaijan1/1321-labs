import java.util.*;

public class Lab12A {
    public static void main(String[] args) {
        Lightbulb bulb0= new Lightbulb();
        Lightbulb bulb1= new Lightbulb(1,100);
        bulb0.printbulb();
        bulb1.printbulb();
        bulb1.OnOff(true);
        bulb0.incrementTime(5);
        bulb1.incrementTime(5);
        bulb0.printbulb();
        bulb1.printbulb();



    }
    public static class Lightbulb{
        private int wattage;
        private int ID;
        private int wattageTotal;
        private boolean isOn;



        Lightbulb(){
            wattage=40;
            ID=0;
            isOn= false;
            wattageTotal=0;
        }
        Lightbulb(int i, int w){
            ID=i;
            wattage=w;


        }
        void printbulb() {
            if (isOn == false) {
                System.out.println("Bulb " + ID + " is off and has used " + wattageTotal + " watt-hours");
            }
            else {
                System.out.println("Bulb " + ID + " is on and has used " + wattageTotal + " watt-hours");
            }
        }
        public void OnOff(boolean f){
            isOn= f;


        }
        void incrementTime(int Hours){
            if(isOn== true){
                wattageTotal=(wattage*Hours);
            }
        }



        }
    }

