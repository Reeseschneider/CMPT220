public class App {
    public static void main(String[] args) {
    //create a generic enemy and call its functions
        Enemy e1 = new Enemy(80,20);
        System.out.println(e1.health);
        System.out.println(e1.damage);

    //create a fire and an ice wizard and call all functions
        Wizard w1 = new Wizard(50, 50, "fire");
        System.out.println(w1.health);
        System.out.println(w1.damage);
        System.out.println(w1.type);

    //create a goblin and call its functions
        Goblin g1 = new Goblin(40,60);
        System.out.println(g1.health);
        System.out.println(g1.damage);

        e1.attack();
        g1.attack();
        w1.damageType();
    }
}
