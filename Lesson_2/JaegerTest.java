public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Gipsy Danger");
        jaeger1.setMark("Mark-3");
        jaeger1.setHeight(260.0);
        jaeger1.setWeight(1.98);
        jaeger1.setWeight(-5);
        jaeger1.setSpeed(7);
        jaeger1.setArmor(6);
        jaeger1.setStrength(8);
        jaeger1.setPilotsNumber(3);

        Jaeger jaeger2 = new Jaeger("Coyote Tango", "Mark-1", 280.0, 2.312, 5, 4, 7, 2);
        jaeger1.move();
        System.out.println("Модель " + jaeger2.getModelName() + " = " + jaeger2.getMark());
        System.out.println("Скорость " + jaeger1.getModelName() + " = " + jaeger1.getSpeed());
    }
}
