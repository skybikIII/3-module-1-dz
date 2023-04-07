public class Test {
    public static void main(String[] args) {
        Steel steel = new Steel();
        Sword<Steel> sword = new Sword<>(steel.getEndurance());
        System.out.println(sword.checkEndurance());
    }
}
