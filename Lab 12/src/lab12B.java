import java.util.*;
public class lab12B {
    public static void main(String[] args) {
        Stock goog =new Stock("Google","GOG");
        Stock msft= new Stock("Microsoft","MSF");
        goog.setClosingPrice(134.67f);
        goog.setCurrentVal(131.98f);
        msft.setClosingPrice(156.52f);
        msft.setCurrentVal(161.22f);
        goog.Print();
        msft.Print();










    }
    static class Stock{
        private String name,Symbol;
        private float prevClose=0, currentVal=0;
        public Stock(String n,String s){
            name=n;
            Symbol=s;
        }

        public String getName() {
            return name;
        }
        public void setClosingPrice(float c){
            prevClose=c;

        }
        public void setCurrentVal(float d){
            currentVal=d;

        }
        public int getChangePercent(){
            int a= Math.round((currentVal-prevClose)/currentVal*100);
            return a;

        }
        public void Print(){
            System.out.println(name+" stock");
            System.out.println("Symbol: "+ Symbol);
            System.out.println("Closing price: "+ prevClose);
            System.out.println("Current price: "+ currentVal);
            System.out.println("   Change Precent "+getChangePercent()+"%");







        }
    }

}
