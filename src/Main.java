public class Main {
    public static void main(String[] args) {

        Sedan sedan = new Sedan("Mersedes", 2012, ColorEnum.BLACK);
        System.out.println(sedan.getInfo());

        System.out.println();

        AutoShowRoom autoShowRoom = new AutoShowRoom("AMG", "Frunze 11");
        Bus bus = new Bus("Mersedes", 2011, ColorEnum.WHITE, autoShowRoom, 24);
        System.out.println(bus.getInformation());

        System.out.println();

        AutoShowRoom autoShowRoom1 = new AutoShowRoom("MAN", "Lenina 11");
        Bus bus1 = new Bus("MAN", 2011, ColorEnum.BLACK, autoShowRoom1, 24);
        System.out.println(bus1.getInformation());
    }
}