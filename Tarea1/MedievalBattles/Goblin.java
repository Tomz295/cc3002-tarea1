package MedievalBattles;

public class Goblin extends AttackerEntity {

    public Goblin(int atk, int hp){
        super(atk, hp);
    }
    public void attack(Attackable dude){
        if(this.isAlive()){
            dude.attackedByGoblin(this);
        }
    }
    public void attackedByUndead(Undead undead){
        this.hurt(undead.getAtk());
    }

    public void attackedByIceGolem(IceGolem icegolem){
        this.hurt(icegolem.getAtk() * 2);
    }

    public void attackedByGoblin(Goblin goblin){
        this.hurt(0);
    }

    public void attackedByKnight(Knight knight){
        this.hurt(knight.getAtk() * 5 / 4);
    }

    public void attackedByFireMage(FireMage firemage){
        this.hurt(firemage.getAtk() * 2);
    }

    public void attackedByPriest(Priest priest){
        this.hurt(0);
    }
}
