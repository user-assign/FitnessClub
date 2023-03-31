public class Lesson {
    private String type;
    private int maxCustomers;
    private double price;
    
    public Lesson(String type, int maxCustomers, double price) {
    this.type = type;
    this.maxCustomers = maxCustomers;
    this.price = price;
    }
    
    public String getType() {
    return type;
    }
    
    public int getMaxCustomers() {
    return maxCustomers;
    }
    
    public double getPrice() {
    return price;
    
    }
    }