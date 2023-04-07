public class Sword<T extends Metal> {
    int endurance;
    Sword(int endurance) {
        this.endurance = endurance;
    }

    boolean checkEndurance() {
        if (endurance > 49) {
            return true;
        } else {
            return false;
        }
    }
}
