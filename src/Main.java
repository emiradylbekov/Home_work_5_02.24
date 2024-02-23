public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth();
        boss.setDamage();
        boss.setProtection();
        System.out.println("Boss:");
        System.out.println("Health: " + boss.getHealth() + " Damage: " + boss.getDamage()
                + " Protection: " + boss.getProtection());
        System.out.println("\nHeroes:");
        Hero[] heroes = createHeroes();
        for (int i = 0; i < heroes.length; i++) {
            System.out.println("Health: " + heroes[i].getHealth() + " Super Ability: " + heroes[i].getSuperAbility()
                    + " Damage: " + heroes[i].getDamage());

        }

    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(300, "Physical", 35);
        Hero hero2 = new Hero(250, 30);
        Hero hero3 = new Hero(270, "Magical", 25);

        Hero[] heroes = new Hero[3];
        for (int i = 0; i < heroes.length; i++) {
            heroes[0] = hero1;
            heroes[1] = hero2;
            heroes[2] = hero3;
        }
        return heroes;

    }

}