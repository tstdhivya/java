package javaprgs;

public class EX283 {
    public static void main(String[] args) {
        Sample s1 = new Sample("Divi", 89, 465, 3);
        System.out.println(s1.getMarks());
        System.out.println(s1.getName());
        System.out.println(s1.getName());
        System.out.println(s1.getPercentage());
       // System.out.println(s1.getpercentage);
    }

}
 class Sample {



    private String name;
    private float percentage;
    public int marks;
    public int rank;

    public Sample(String name, float percentage, int marks, int rank) {
        this.name = name;
        this.percentage = percentage;
        this.marks = marks;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPercentage() {
        return percentage;
    }

    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRank() {
        return rank;
    }
    public void setRank(int rank) {
        this.rank = rank;
    }

}
