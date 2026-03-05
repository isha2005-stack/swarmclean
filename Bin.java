public class Bin {
    int id;
    int fillLevel;

    public Bin(int id, int fillLevel) {
        this.id = id;
        this.fillLevel = fillLevel;
    }

    public void display() {
        System.out.println("Bin ID: " + id + " | Fill Level: " + fillLevel + "%");
    }
}