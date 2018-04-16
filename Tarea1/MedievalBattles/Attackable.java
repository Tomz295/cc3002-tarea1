package MedievalBattles;

public interface Attackable {
    void attackedByUndead(Undead undead);
    void attackedByIceGolem(IceGolem icegolem);
    void attackedByGoblin(Goblin goblin);
    void attackedByKnight(Knight knight);
    void attackedByFireMage(FireMage knight);
    void attackedByPriest(Priest knight);
}
