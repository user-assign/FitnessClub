public class Booking {
    private Lesson lesson;
    private String day;
    private String time;
    private int numCustomers;
    
    public Booking(Lesson lesson, String day, String time, int numCustomers) {
    this.lesson = lesson;
    this.day = day;
    this.time = time;
    this.numCustomers = numCustomers;
    }
    
    public Lesson getLesson() {
    return lesson;
    }
    
    public String getDay() {
    return day;
    
    }
    
    public String getTime() {
    return time;
    }
    
    public int getNumCustomers() {
    return numCustomers;
    }
    
    public double getTotalCost() {
    return lesson.getPrice() * numCustomers;
    }
    }