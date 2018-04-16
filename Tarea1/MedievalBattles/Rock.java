package MedievalBattles;

public class Rock implements Attackable {

    public Rock(){
    }

    public void attackedByUndead(Undead undead){
    }

    public void attackedByIceGolem(IceGolem icegolem){
    }

    public void attackedByGoblin(Goblin goblin){
    }

    public void attackedByKnight(Knight knight){
        int damage = knight.getAtk();
        knight.hurt(damage);
    }

    public void attackedByFireMage(FireMage firemage){
        int damage = firemage.getAtk();
        firemage.hurt(damage);
    }

    public void attackedByPriest(Priest priest){
        int damage = priest.getAtk();
        priest.hurt(damage);
    }
}
