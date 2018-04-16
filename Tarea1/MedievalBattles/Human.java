package MedievalBattles;

public abstract class Human extends AttackerEntity {
    public String name;

    public Human(int atk, int hp, String name){
        super(atk, hp);
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}
