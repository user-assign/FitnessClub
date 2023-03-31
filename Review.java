public class Review {
    private Customer customer;
    private Booking booking;
    private int rating;
    private String comment;
    
    public Review(Customer customer, Booking booking, int rating, String comment) {
    this.customer = customer;
    this.booking = booking;
    this.rating = rating;
    this.comment = comment;
    }
    
    public Customer getCustomer() {
    return customer;
    }
    
    public Booking getBooking() {
    
    return booking;
    }
    
    public int getRating() {
    return rating;
    }
    
    public String getComment() {
    return comment;
    }
    }