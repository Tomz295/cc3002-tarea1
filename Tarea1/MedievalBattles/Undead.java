package MedievalBattles;

public class Undead extends AttackerEntity {

    public Undead(int atk, int hp){
        super(atk, hp);
    }
    public void attack(Attackable dude){
        if(this.isAlive()){
            dude.attackedByUndead(this);
        }
    }

    public void attackedByUndead(Undead undead){
        this.hurt(0);
    }

    public void attackedByIceGolem(IceGolem icegolem){
        this.hurt(icegolem.getAtk() * 2);
    }

    public void attackedByGoblin(Goblin goblin){
        this.hurt(0);
    }

    public void attackedByKnight(Knight knight){
        this.hurt(knight.getAtk());
    }

    public void attackedByFireMage(FireMage firemage){
        this.hurt(firemage.getAtk() / 2);
    }

    public void attackedByPriest(Priest priest){
        this.hurt(priest.getAtk() * 5);
    }
}