public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 50, "FIREBALL"),
                new Medic(80, 10, "HEALING", 20),
                new Warrior(150, 70, "CRITICAL DAMAGE")
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}