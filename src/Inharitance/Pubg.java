package Inharitance;

public class Pubg {
    String playername;
    int id;
    int level;
    String Rp;

    Pubg(int id, String playername, int level, String Rp) {
        this.id = id;
        this.playername = playername;
        this.Rp = Rp;
        this.level = level;
    }

    public static void main(String[] args) {
        Pubg pubg = new Pubg(555555555, "iamHunter1234", 67, "Yes");
        System.out.println(pubg.id + " " + pubg.playername + " " + pubg.level + " " + pubg.Rp);
    }
}
class Bgmi extends Pubg{
    public static void main(String[] args) {
        Bgmi bgmi = new Bgmi(46537,"I wiil Kill You",67,"Yes");
        System.out.println(bgmi.id+" "+bgmi.level+" "+bgmi.Rp+" "+bgmi.playername);


    }


    Bgmi(int id, String playername, int level, String Rp) {
        super(id, playername, level, Rp);
    }
}
