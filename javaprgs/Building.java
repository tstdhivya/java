package javaprgs;

public class Building{
    public static void main(String[] args){
        Base b1 = new Base("kurinji",3);
        b1.setName("Google");
        System.out.println(b1.getName());

    }
}
    class Base {
        public String name;
        public int rooms;

        public Base(String name, int rooms) {
            this.name = name;
            this.rooms = rooms;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getRooms() {
            return rooms;
        }

        public void setRooms(int rooms) {
            this.rooms = rooms;
        }
    }

