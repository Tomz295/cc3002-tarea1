package MedievalBattles;

public class IceGolem extends AttackerEntity {

    public IceGolem(int atk, int hp){
        super(atk, hp);
    }
    public void attack(Attackable dude){
        if(this.isAlive()){
            dude.attackedByIceGolem(this);
        }
    }

    public void attackedByUndead(Undead undead){
        this.hurt(0);
    }

    public void attackedByIceGolem(IceGolem icegolem){
        this.hurt(icegolem.getAtk());
    }

    public void attackedByGoblin(Goblin goblin){
        this.hurt(0);
    }

    public void attackedByKnight(Knight knight){
        this.hurt(knight.getAtk() / 2);
    }

    public void attackedByFireMage(FireMage firemage){
        this.hurt(firemage.getAtk() * 5);
    }

    public void attackedByPriest(Priest priest){
        this.hurt(0);
    }
}
