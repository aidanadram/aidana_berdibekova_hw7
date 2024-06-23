public class Medic extends Hero implements HavingSuperAbility {
    private int healPoints;

    public Medic(int health, int damage, String superAbilityType, int i) {
        super(health, damage, superAbilityType);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void setHealPoints(int healPoints) {
        this.healPoints = healPoints;
    }

    public void increaseExperience() {
        this.healPoints += this.healPoints * 0.1;
        System.out.println("Medic увеличил опыт лечения, теперь healPoints: " + this.healPoints);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + getSuperAbilityType());
    }
}


