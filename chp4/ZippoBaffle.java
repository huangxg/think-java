public class ZippoBaffle {
    public static void main(String[] args) {
        zippo("rattle", 13); // 1
    }

    public static void zippo(String quince, int flag) {
        // rattle, 13
        // ping, -5
        if (flag < 0) { // 6
            System.out.println(quince + " zoop"); // 7
        } else {
            System.out.println("ik"); // 2
            baffle(quince); // 3
            System.out.println("boo-wa-ha-ha"); // 8
        }
    }

    public static void baffle(String blimp) {
        // rattle
        System.out.println(blimp); // 4
        zippo("ping", -5); // 5
    }
}
