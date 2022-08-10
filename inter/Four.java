package inter;
class Four implements Two,Three{
    public void add() {
        int a = 10, b = 20;
        System.out.println(a + b);
    }

    @Override
    public void bus1() {
        System.out.println("SRM");

    }

    public void animals() {
        String name = "cats";
        System.out.println("name");
    }
    }





