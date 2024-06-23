public class Warrior extends Hero implements HavingSuperAbility {
    public Warrior (int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Warrior применил суперспособность " + getSuperAbilityType());
    }
    }

