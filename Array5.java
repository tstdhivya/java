public class Array5 {
    public static void main(String[] args){
        int a[]={12,19,40,89,2,0,79,7};
        int min=a[0];
        int max=a[0];
        for (int i=0;i<a.length;++i)
        {
            if(a[i]<min){
                min=a[i];
            }
          // for(int i=0;i<a.length;i++)
            {
            if(a[i]>max){
                max=a[i];
            }
            System.out.println("MIN"+" "+min+" "+"MAX"+" "+max);
            System.out.println( );
        }

    }
}}