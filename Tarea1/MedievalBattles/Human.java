package MedievalBattles;

/*
* @author Tomás L
* Clase abstracta que implementa AttackerEntity. A diferencia de las demas
* AttackerEntity cualquier objeto instanciado a partir de una subclase de Human
* posee una variable extra el cual representa el "nombre" de este objeto. Esto
* le permite a los objetos tipo Human ser distinguibles incluso cuando comparten
* los mismos valores de ATK, HP y MaxHP
* */
public abstract class Human extends AttackerEntity {
    public String name;

    /*
    * @author Tomás L
    * Contructor de la clase human
    * @param atk el poder de ataque del objeto
    * @param hp el valor de la vida (HP) y vida maxima (MaxHP) del objeto
    * @param name el nombre del objeto
    * */
    public Human(int atk, int hp, String name){
        super(atk, hp);
        this.name = name;
    }
    /*
    * @author Tomás L
    * Metodo que permite obtener el nombre de un objeto Human
    * @return valor de la variable name*/
    public String getName(){
        return this.name;
    }
}
