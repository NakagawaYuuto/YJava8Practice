import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Cleric c = new Cleric();
        c.name = "クリス";
        System.out.println(c.name);
        c.selfAid();
        c.pray(4);
    }
}
