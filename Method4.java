public class Method4 {
       public static void main(String[] args){

        //  float val= myMethod1(1000f, 10f, 10f);
          // System.out.println(""+val);
         float val1=  myMethod1(2f, 2f, 3f);
           System.out.println("addition"+val1);
int val2=myMethod2(100,20,20);
System.out.println("Subtraction"+val2);
int val3=myMethod3(10,20,30);
System.out.println("Multiplication"+val3);
float val4=myMethod4(1000,10,10);
System.out.println("Division"+val4);
String val5=myMethod5("Dhivya","Tamil");
           System.out.println("My Name is"+val5);
       }
    public static float myMethod1(float x, float y, float z) {
return x+y+z;
       }
       public  static int myMethod2 (int x,int y,int z){
           return x-y-z;
       }
       public static int myMethod3(int x,int y,int z){
           return x*y*z;
       }
    public  static  float myMethod4 (float x, float y, float z) {
        return x/y/z; }
    public static String myMethod5(String name1,String name2){
        return name1+name2;
    }
}

