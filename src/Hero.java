public class Hero {
    private int health;
    private String superAbility;
    private int damage;

    public Hero (int health, String superAbility, int damage){
        this.health = health;
        this.superAbility = superAbility;
        this.damage = damage;

    }

    public Hero (int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public int getHealth(){
        return health;
    }
    public String getSuperAbility(){
        return superAbility;
    }
    public int getDamage(){
        return damage;
    }





}
