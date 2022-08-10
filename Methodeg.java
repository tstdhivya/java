public class Methodeg {
int x=10,y=20;
    void shop(){
        System.out.println(x*y);

    }
    int company(){
        System.out.println("ebrain");
    return 0;}
    static   Double add(Double a,Double b){


        return (a+b);
    }
    static   Double add1(Double a,Double b,Double g){


        return (a+b+g);
    }
   static void sub(int c,int d){
        System.out.println(c-d);
   }
    public static void main(String[] args) {
        Methodeg m =new Methodeg();
        m.shop();
   m.company();
       System.out.println(add(12.0,10.0));
        sub(20,1);
        add1(12.0,23.0,12.0);
    }
}
