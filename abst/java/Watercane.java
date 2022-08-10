package abst.java;

public class Watercane extends WaterBottleBrands{
    void type(){
        System.out.println("flask");
    }
    public static void main(String[] args) {

        Watercane w=new Watercane();
        w.brand();
        w.colors();
        w.count();
        w.type();
    }
}
