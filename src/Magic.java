public class Magic extends Hero implements HavingSuperAbility {
    public Magic(int health, int damage, String superAbilityType) {
        super(health, damage, superAbilityType);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность " + getSuperAbilityType());
    }

    }



