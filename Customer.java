import java.util.ArrayList;
import java.util.List;

public class Customer {
private String name;
private List&lt;Booking&gt; bookings;
private List&lt;Review&gt; reviews;

public Customer(String name) {
this.name = name;
this.bookings = new ArrayList&lt;Booking&gt;();
this.reviews = new ArrayList&lt;Review&gt;();
}

public String getName() {
return name;
}

public List&lt;Booking&gt; getBookings() {
return bookings;
}

public List&lt;Review&gt; getReviews() {
return reviews;
}

public void makeBooking(Lesson lesson, String day, String time, int numCustomers) {
Booking booking = new Booking(lesson, day, time, numCustomers);
if (checkAvailability(booking)) {

bookings.add(booking);
System.out.println(&quot;Booking successful for &quot; + numCustomers + &quot; customers on &quot; + day +
&quot; &quot; + time + &quot; for &quot; + lesson.getType() + &quot;.&quot;);
} else {
System.out.println(&quot;Booking failed: not enough availability for &quot; + numCustomers + &quot;
customers on &quot; + day + &quot; &quot; + time + &quot; for &quot; + lesson.getType() + &quot;.&quot;);
}
}

public void cancelBooking(Booking booking) {
if (bookings.contains(booking)) {
bookings.remove(booking);
System.out.println(&quot;Booking cancelled for &quot; + booking.getNumCustomers() + &quot; customers
on &quot; + booking.getDay() + &quot; &quot; + booking.getTime() + &quot; for &quot; + booking.getLesson().getType() +
&quot;.&quot;);
} else {
System.out.println(&quot;Cancellation failed: booking not found.&quot;);
}
}

public void changeBooking(Booking booking, Lesson newLesson, String newDay, String
newTime, int newNumCustomers) {
if (!bookings.contains(booking)) {

System.out.println(&quot;Change failed: booking not found.&quot;);
} else {
Booking newBooking = new Booking(newLesson, newDay, newTime,
newNumCustomers);
if (checkAvailability(newBooking)) {
bookings.remove(booking);
bookings.add(newBooking);
System.out.println(&quot;Booking changed to &quot; + newNumCustomers + &quot; customers on &quot; +
newDay + &quot; &quot; + newTime + &quot; for &quot; + newLesson.getType() + &quot;.&quot;);
} else {
System.out.println(&quot;Change failed: not enough availability for &quot; + newNumCustomers +
&quot; customers on &quot; + newDay + &quot; &quot; + newTime + &quot; for &quot; + newLesson.getType() + &quot;.&quot;);
}
}
}

public void writeReview(Booking booking, int rating, String comment) {
Review review = new Review(booking.getLesson(), rating, comment);
reviews.add(review);
System.out.println(&quot;Review submitted for &quot; + booking.getLesson().getType() + &quot;.&quot;);
}

private boolean checkAvailability(Booking newBooking) {
int maxCustomers = newBooking.getLesson().getMaxCustomers();
int numCustomers = newBooking.getNumCustomers();
String day = newBooking.getDay();
String time = newBooking.getTime();

// Check if lesson already fully booked
for (Booking booking : bookings) {
if (booking.getDay().equals(day) &amp;&amp; booking.getTime().equals(time) &amp;&amp;
(booking.getNumCustomers() + numCustomers) &gt; maxCustomers) {
return false;
}
}

// Check if same lesson already booked on same day and time
for (Booking booking : bookings) {
if (booking.getDay().equals(day) &amp;&amp; booking.getTime().equals(time) &amp;&amp;
booking.getLesson().equals(newBooking.getLesson())) {
return false;
}
}

return true;
}
}