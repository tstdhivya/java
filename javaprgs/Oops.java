package javaprgs;

public class Oops {
    public static void main(String[] args) {
        School c =new School("anu","ssvm",9);
        System.out.println( c.getName());
        c.setName("dhivya");
       String a= c.getName();
        System.out.println( a);

    }
}
class School
{
   private String  name;
   private String schoolName;
   private int standard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public School(String name, String schoolName, int standard) {
        this.name = name;
        this.schoolName = schoolName;
        this.standard = standard;
    }
}