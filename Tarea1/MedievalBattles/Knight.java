package MedievalBattles;

public class Knight extends Human{

    public Knight(int atk, int hp, String name){
        super(atk, hp, name);
    }

    public void attack(Attackable dude){
        if(this.isAlive()){
            dude.attackedByKnight(this);
        }
    }

    public void attackedByUndead(Undead undead){
        this.hurt(undead.getAtk());
    }

    public void attackedByIceGolem(IceGolem icegolem){
        this.hurt(icegolem.getAtk() * 3 / 2);
    }

    public void attackedByGoblin(Goblin goblin){
        this.hurt(goblin.getAtk() / 2);
    }

    public void attackedByKnight(Knight knight){
        this.hurt(knight.getAtk());
    }

    public void attackedByFireMage(FireMage firemage){
        this.hurt(firemage.getAtk() * 2);
    }

    public void attackedByPriest(Priest priest){
        this.hurt(0);
    }
}

