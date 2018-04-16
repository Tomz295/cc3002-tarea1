package MedievalBattles;
/*
* @author Tomás L
* Interfaz de toda clase que pueda ser atacada,
* la cual contiene los metodos de por quien fue atacada.
* Una subclase que implemente Attackable puede ademas implementar
* la interfaz Attacker la cual le permite tanto recibir ataques
* como atacar.
*
* Aunque los metodos de esta interfaz estan en todas las
* clases que implementan Attackable, estos son llamados por
* las clases que implementan además la interfaz Attacker.
* Esto es, las clases que implementan Attackable definen estos
* metodos, pero estos solo son llamados por aquellas clases que
* implementan Attacker. Por esto, para que una clase pueda atacar
* a otra se debe agregar el metodo correspondiente al atacante, la
* cual debe ser definida en la clase que es atacada.
*
* Los metodos de esta interfaz permiten recibir ataques de clases
* que implementen Attacker, en donde cada metodo define el resultado
* de ser atacado por cada clase distinta. Para cada metodo:
* @param objeto que ataca. el tipo del atacante debe concordar con
*       el nombre del metodo
* */
public interface Attackable {

    void attackedByUndead(Undead undead);
    void attackedByIceGolem(IceGolem icegolem);
    void attackedByGoblin(Goblin goblin);
    void attackedByKnight(Knight knight);
    void attackedByFireMage(FireMage knight);
    void attackedByPriest(Priest knight);
}
