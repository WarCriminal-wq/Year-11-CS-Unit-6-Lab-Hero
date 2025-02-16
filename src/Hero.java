public class Hero {
    private String name;
    private int HitPoints;

    public Hero (String diddy ){
        name = diddy;
        HitPoints = 100;
    }

    public String getName(){
        return this.name;
    }

    public int getHitPoints(){
        return this.HitPoints;
    }

    public String toString(){
        return("Hero" + "{" + "name=" + "'" + name + "'" + ", hitPoints=" + HitPoints + "}");
    }

    public void attack(Hero opponent){
        double random = Math.random();
        if(random < 0.50){
            opponent.HitPoints = opponent.HitPoints - 10 ;
        }else if(random > 0.50){
            this.HitPoints = this.HitPoints -10;
        }

    }

    public void senzuBean(){
        this.HitPoints = this.HitPoints + (100 - this.HitPoints);
    }

    private void fightUntilTheDeathHelper(Hero diddle){
        for( int i = 0 ; this.HitPoints > i;){
            this.attack(diddle);
        }
    }

    public String fightUntilTheDeath(Hero diddy){
        diddy.senzuBean();
        this.senzuBean();
        this.fightUntilTheDeathHelper(diddy);
        return(this.name +": " + this.HitPoints + "\n" + diddy.name + ": " + diddy.HitPoints);
    }

    private int[] nFightsToTheDeathHelper(Hero epstein, int n){
        int[] diddy = new int[2];
        diddy[0] = 0;
        diddy[1] = 0;
        for(int i = 1; n >= i;){
            this.fightUntilTheDeathHelper(epstein);
            if(this.getHitPoints() == 0 ){
                this.senzuBean();
                // epstein wins!
                diddy[0] = diddy[0] + 1;
            } if(epstein.getHitPoints() == 0){
                epstein.senzuBean();
                // this wins!
                diddy[1] = diddy[1] + 1;
            }
        }
        return diddy; //win counter
    }

    public String nFightsToTheDeath(Hero drake, int O){
        int[] ints = this.nFightsToTheDeathHelper(drake, O);
        return(this.name + ": " + ints[0] + "\n" + drake.name + ": " + ints[1]);

    }

    public void dramaticFightToTheDeath(Hero opponent){
        System.out.println("nice try CS teacher. Too lazy to implement a test case?");
    }
}
