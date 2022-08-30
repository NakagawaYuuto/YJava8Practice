import java.util.Random;

public class Cleric {
    String name;
    int hp = 50;
    final int MaxHp = 50;
    int mp = 10;
    final int MaxMp = 10;

    public void selfAid(){
        System.out.println(this.name + "は、セルフエイドを使った。MPを５使った");
        this.hp = this.MaxHp;
        this.mp -= 5;
        System.out.println("HPが全回復した。");
    }

    public int pray(int sec){
        System.out.println(this.name + "は、" +  sec +"秒祈った。");
        int recover = new Random().nextInt(3) + sec ;
        int recoverActual = Math.min(this.MaxMp - this.mp, recover);

        this.mp += recoverActual;
        System.out.println("MPが" + recoverActual + "回復した。");
        return recoverActual;
    }
}
