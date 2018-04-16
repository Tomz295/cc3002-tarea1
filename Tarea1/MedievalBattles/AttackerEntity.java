package MedievalBattles;

/*
* @author Tomás L
* Clase abstracta que define las variables y metodos principales
* de toda entidad/clase que pueda tanto atacar como ser atacada.
* Implementa Attacker y Attackable.
*
* las variables definidas son HP: Los puntos de vida actuales del objeto/entidad,
* MaxHP: El limite superior del valor que puede tomar HP (vida maxima) y
* ATK: el valor de ataque del objeto/entidad
* */

public abstract class AttackerEntity implements Attacker, Attackable{
    public int HP;
    public int MaxHP;
    public int ATK;

    /*
    * @author Tomás L
    * Constructor de la clase AttackerEntity, la cual es utilizada por todas
    * las subclases de esta clase
    * @param atk el poder de ataque del objeto
    * @param hp el valor de la vida (HP) y vida maxima (MaxHP) del objeto
    * */
    public AttackerEntity(int atk, int hp){
        this.MaxHP = hp;
        this.HP = hp;
        this.ATK = atk;
    }
    /*
    * @author Tomás L
    * Metodo que permite obtener el valor de la variable ATK
    * @return el valor de ATK
    * */
    public int getAtk(){
        return this.ATK;
    }
    /*
     * @author Tomás L
     * Metodo que permite obtener el valor de la variable HP
     * @return el valor de HP
     * */
    public int getHP() {
        return this.HP;
    }
    /*
     * @author Tomás L
     * Metodo que permite obtener el valor de la variable MaxHP
     * @return el valor de MaxHP
     * */
    public int getMaxHP(){
        return this.MaxHP;
    }
    /*
    * @author Tomás L
    * Metodo que "daña" al objeto, reduciendo su vida (HP).
    * No puede terminar con vida menor a cero
    * @param damage daño inflingido hacia el objeto
    * */
    public void hurt(int damage){
        this.HP -= damage;
        if(this.HP < 0){
            this.HP = 0;
        }
    }
    /*
    * @author Tomás L
    * Metodo que "cura" al objeto, aumentando su vida (HP)
    * No puede terminar con mas vida que su vida maxima (MaxHP)
    * @param healing cantidad de vida recuperada, sumada directamente a HP
    * */
    public void heal(int healing){
        this.HP += healing;
        if(this.HP > this.MaxHP){
            this.HP = this.MaxHP;
        }
    }
    /*
    * @author Tomás L
    * Metodo que entrega un booleano mostrando si el objeto esta vivo o no.
    * @return false si HP es (menor o) igual a cero. De lo contrario retorna true*/
    public boolean isAlive(){
        return this.HP > 0;
    }
}
