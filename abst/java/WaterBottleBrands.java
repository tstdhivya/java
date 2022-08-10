package abst.java;

public class WaterBottleBrands implements WaterBottleColors {

    @Override
    public void colors() {
        System.out.println("red color");

    }

    @Override
    public void brand() {
        System.out.println("milton");

    }

    int count(){
        System.out.println(5);
       return 5;
    }
}
