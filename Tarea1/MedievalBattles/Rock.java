package MedievalBattles;

/*
* @author Tomás L
* Clase Rock. Esta clase implementa Attackable lo que le
* permite recibir ataques. Si es atacada por una subclase de la
* clase Human el daño es reflejado completamente
* */
public class Rock implements Attackable {

    /*
    * @author Tomás L
    * Constructor de la clase Rock*/
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
