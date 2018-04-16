package MedievalBattles;

public class FruitTree implements Attackable {

    public FruitTree(){
    }

    public void attackedByUndead(Undead undead){
    }

    public void attackedByIceGolem(IceGolem icegolem){
    }

    public void attackedByGoblin(Goblin goblin){
        int heals = goblin.getMaxHP() * 15 / 100;
        goblin.heal(heals);
    }

    public void attackedByKnight(Knight knight){
        int heals = knight.getMaxHP() * 30 / 100;
        knight.heal(heals);
    }

    public void attackedByFireMage(FireMage firemage){
        int heals = firemage.getMaxHP() * 30 / 100;
        firemage.heal(heals);
    }

    public void attackedByPriest(Priest priest){
        int heals = priest.getMaxHP() * 30 / 100;
        priest.heal(heals);
    }
}
