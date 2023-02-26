public class WolfTest {

    public static void main(String[] args) {
        Wolf leva = new Wolf();
        leva.age = 5;
        leva.name = "Leva";
        leva.color = "blue";
        leva.sex = "male";
        leva.weight = 16.3;
        System.out.println(leva.name);
        System.out.println(leva.age);
        System.out.println(leva.color);
        System.out.println(leva.sex);
        System.out.println(leva.weight);
        leva.go();
        leva.howl();
        leva.hunter();
        leva.run();
        leva.sit();
    }
}
