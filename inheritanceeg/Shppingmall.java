package inheritanceeg;

public class Shppingmall  extends Funzone{
    void electronics(){
        System.out.println("amplifier");

    }

    public static void  main(String[] args) {


        Shppingmall s = new   Shppingmall ();
        s.shopname();
        s.brand();
        s.add(10, 30);
        s.zonename();
      s.electronics();

    }

}

