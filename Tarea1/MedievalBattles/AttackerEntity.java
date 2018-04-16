package MedievalBattles;

public abstract class AttackerEntity implements Attacker, Attackable{
    public int HP;
    public int MaxHP;
    public int ATK;
    public AttackerEntity(int atk, int hp){
        this.MaxHP = hp;
        this.HP = hp;
        this.ATK = atk;
    }

    public int getAtk(){
        return this.ATK;
    }
    public int getHP() {
        return this.HP;
    }
    public int getMaxHP(){
        return this.MaxHP;
    }
    public void hurt(int damage){
        this.HP -= damage;
        if(this.HP < 0){
            this.HP = 0;
        }
    }
    public void heal(int healing){
        this.HP += healing;
        if(this.HP > this.MaxHP){
            this.HP = this.MaxHP;
        }
    }
    public boolean isAlive(){
        return this.HP > 0;
    }
}
