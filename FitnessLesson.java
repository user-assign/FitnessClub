public class FitnessLesson {
    private String name;
    private String day;
    private int maxCapacity;
    private int numBookings;
    private double price;

    public FitnessLesson(String name, String day, int maxCapacity, double price) {
        this.name = name;
        this.day = day;
        this.maxCapacity = maxCapacity;
        this.numBookings = 0;
        this.price = price;
    }
    

    public String getName() {
        return name;
    }

    public String getDay() {
        return day;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public int getNumBookings() {
        return numBookings;
    }

    public double getPrice() {
        return price;
    }

    public void incrementNumBookings() {
        numBookings++;
    }

    public boolean isFull() {
        return numBookings == maxCapacity;
    }
}
