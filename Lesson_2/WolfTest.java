public class WolfTest {

    public static void main(String[] args) {
        Wolf leva = new Wolf();
        leva.setAge(9);
        leva.setName("Leva");
        leva.setColor("blue");
        leva.setSex("male");
        leva.setWeight(16.3);
        System.out.println(leva.getName());
        System.out.println(leva.getAge());
        System.out.println(leva.getColor());
        System.out.println(leva.getSex());
        System.out.println(leva.getWeight());
        leva.go();
        leva.howl();
        leva.hunt();
        leva.run();
        leva.sit();
    }
}
