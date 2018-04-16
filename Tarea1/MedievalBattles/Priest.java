package MedievalBattles;

public class Priest extends Human{

    public Priest(int atk, int hp, String name){
        super(atk, hp, name);
    }

    public void attack(Attackable dude){
        if(this.isAlive()){
            dude.attackedByPriest(this);
        }
    }
    public void attackedByUndead(Undead undead){
        this.hurt(undead.getAtk());
    }

    public void attackedByIceGolem(IceGolem icegolem){
        this.hurt(icegolem.getAtk() * 2);
    }

    public void attackedByGoblin(Goblin goblin){
        this.hurt(goblin.getAtk());
    }

    public void attackedByKnight(Knight knight){
        this.hurt(0);
    }

    public void attackedByFireMage(FireMage firemage){
        this.hurt(firemage.getAtk() * 2);
    }

    public void attackedByPriest(Priest priest){
        this.hurt(0);
    }
}
