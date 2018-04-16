package MedievalBattles;
/*
* @author Tomás L
* Interfaz de toda clase que puede realizar un ataque a
* alguna clase que implemente la interfaz Attackable.
* Para poder atacar algun objeto de clase que implemente
* Attackable debe existir el metodo apropiado para recibir
* dichos ataques en la interfaz Attackable y dicho metodo
* debe ser implementado en la clase que es atacada.
*
* El metodo attack(...) utiliza double dispatch
* para atacar al objetivo especificado, donde el
* daño producido sera equivalente al ataque (atk) del
* atacante multiplicado por un factor dependiente de cada
* clase.
* @param El objeto siendo atacado
* */

public interface Attacker {
    void attack(Attackable dude);
}
