public class Sedan extends Transport{
    private AutoShowRoom autoShowRoom;

    public Sedan(String model, int year, ColorEnum color, AutoShowRoom autoShowRoom) {
        super(model, year, color);
        this.autoShowRoom = autoShowRoom;

    }
    public Sedan(String model, int year, ColorEnum color) {
        super(model, year, color);
        this.autoShowRoom = autoShowRoom;
    }

    public AutoShowRoom getAutoShowRoom() {
        return autoShowRoom;
    }

    public final String getInfo () {
        return "Model: " + getModel() +
                "\n Year: " + getYear() +
                "\n Color: " + getColor();
    }

    public String getInformation () {
        return "Model: " + getModel() +
                "\n Year: " + getYear() +
                "\n Color: " + getColor() +
                "\n Auto show room name: " + autoShowRoom.getName() +
                "\n Auto show room address: " + autoShowRoom.getAddress();
    }

}
