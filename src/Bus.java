public final class Bus extends Sedan{
    private int numberOfSeats;

    public Bus(String model, int year, ColorEnum color, AutoShowRoom autoShowRoom, int numberOfSeats) {
        super(model, year, color, autoShowRoom);
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    @Override
    public String getInformation() {
        return super.getInformation() +
                "\n Number of seates: " + numberOfSeats;
    }
}
