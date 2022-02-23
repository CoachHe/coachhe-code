package bean;

public class Hero{
    public String name;
    public float hp;
    public int id;
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public float getHp(){
        return hp;
    }
    public void setHp(float hp){
        this.hp = hp;
    }
}