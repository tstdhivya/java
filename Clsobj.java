public class Clsobj {
    public static void main(String[] args) {
   Classeg c=new Classeg();
        Classeg1 c1=new Classeg1();
        c1.divya1(23,12);
        c.divya();
       // c.divya(40,20);
    }
}
class  Classeg{
int a=10, b=20;
    void divya(){
        System.out.println(a+b);
    }
}
class  Classeg1{

   int  divya1(int a,int b){
        System.out.println(a-b);
   return 0; }
}