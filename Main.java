//importing the scanner so that we can perform the input operations. By this, we the code will be able to take the input from the user and it is a cruicial functionaof any code
import java.util.Scanner;

//starting the main class
public class Main {
  //starting the main function, fromthis all the main code starts running, this is the starting point of any java code of any level.
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    FitnessClub club = new FitnessClub();
    
    System.out.println("Welcome to the Fitness Club!");
    System.out.println("---------------------------");

    // Display the timetable
    System.out.println("Here is the timetable for this weekend:");
    System.out.println(club.getTimetable().viewTimetable("Saturday"));
    System.out.println(club.getTimetable().viewTimetable("Sunday"));

    // Prompt the user to make a booking
    System.out.println("Would you like to make a booking? (y/n)");
    String response = scanner.nextLine().toLowerCase();
    while (response.equals("y")) {
      // Display the list of available lessons
      System.out.println("Here is a list of available lessons:");
      for (Lesson lesson : club.getLessons()) {
        System.out.println(lesson.getType() + " (" + lesson.getPrice() + " credits)");
      }

      // Prompt the user to select a lesson
      System.out.println("Which lesson would you like to book?");
      String lessonType = scanner.nextLine();

      // Prompt the user to select a day and time
      System.out.println("Which day would you like to book? (Saturday/Sunday)");
      String day = scanner.nextLine();
      System.out.println("Which time would you like to book? (Morning/Afternoon)");
      String time = scanner.nextLine();

      // Prompt the user to select the number of customers
      System.out.println("How many customers will be attending?");
      int numCustomers = Integer.parseInt(scanner.nextLine());

      // Make the booking
      Customer customer = new Customer("John Doe");
      Lesson lesson = club.findLesson(lessonType);
      if (club.makeBooking(customer, lesson, day, time, numCustomers)) {
        System.out.println("Booking successful!");
      } else {
        System.out.println("Sorry, that time is already booked.");
      }

      // Prompt the user to make another booking
      System.out.println("Would you like to make another booking? (y/n)");
      response = scanner.nextLine().toLowerCase();
    }

    // Prompt the user to cancel a booking
    System.out.println("Would you like to cancel a booking? (y/n)");
    response = scanner.nextLine().toLowerCase();
    while (response.equals("y")) {
      // Display the list of bookings for the customer
      System.out.println("Here are your current bookings:");
      for (Booking booking : customer.getBookings()) {
        System.out.println(booking.getLesson().getType() + " on " + booking.getDay() + " at " + booking.getTime() + " for " + booking.getNumCustomers() + " customers");
      }

      // Prompt the user to select a booking to cancel
      System.out.println("Which booking would you like to cancel?");
      int bookingIndex = Integer.parseInt(scanner.nextLine());
      Booking booking = customer.getBookings().get(bookingIndex - 1);
      
      // Cancel the booking
      club.cancelBooking(customer, booking);
      System.out.println("Booking canceled.");

      // Prompt the user to cancel another booking
      System.out.println("Would you like to cancel another booking? (y/n)");
      response = scanner.nextLine().toLowerCase();
    }

    // Prompt the user to change a booking
    System.out.println("Would you like to change a booking? (y/n)");
    response = scanner.nextLine().toLowerCase();
    while (response.equals("y")) {
      // Display the list of bookings and prompt the user to select one 
System.out.println("Here are your bookings:"); 
customer.displayBookings(); 
System.out.println("Please enter the number of the booking you would like to change:"); 
int bookingIndex = scanner.nextInt(); 
scanner.nextLine();
  // Retrieve the selected booking
  Booking bookingToChange = customer.getBooking(bookingIndex);

  // Prompt the user for the new details
  System.out.println("What is the new lesson you would like to book?");
  String newLessonType = scanner.nextLine();
  System.out.println("What day would you like to book the lesson? (Saturday/Sunday)");
  String newDay = scanner.nextLine();
  System.out.println("What time would you like to book the lesson? (Morning/Afternoon)");
  String newTime = scanner.nextLine();
  System.out.println("How many customers will attend the lesson?");
  int newNumCustomers = scanner.nextInt();
  scanner.nextLine();

  // Attempt to change the booking
  boolean success = timetable.changeBooking(bookingToChange, newLessonType, newDay, newTime, newNumCustomers);

  if (success) {
    System.out.println("Booking changed successfully!");
  } else {
    System.out.println("Sorry, that booking could not be changed.");
  }

  // Prompt the user if they want to change another booking
  System.out.println("Would you like to change another booking? (y/n)");
  response = scanner.nextLine().toLowerCase();
}

// Prompt the user to write a review
System.out.println("Would you like to write a review? (y/n)");
response = scanner.nextLine().toLowerCase();
while (response.equals("y")) {
  // Display the list of bookings and prompt the user to select one
  System.out.println("Here are your bookings:");
  customer.displayBookings();
  System.out.println("Please enter the number of the booking you would like to review:");
  int bookingIndex = scanner.nextInt();
  scanner.nextLine();

  // Retrieve the selected booking
  Booking bookingToReview = customer.getBooking(bookingIndex);

  // Prompt the user for the review details
  System.out.println("What rating would you like to give this lesson? (1-5)");
  int rating = scanner.nextInt();
  scanner.nextLine();
  System.out.println("Please enter your comment (optional):");
  String comment = scanner.nextLine();

  // Create the review and add it to the customer's list of reviews
  Review review = new Review(customer, bookingToReview, rating, comment);
  customer.addReview(review);
  System.out.println("Review added successfully!");

  // Prompt the user if they want to write another review
  System.out.println("Would you like to write another review? (y/n)");
  response = scanner.nextLine().toLowerCase();
}

// Display the customer's reviews
System.out.println("Here are your reviews:");
customer.displayReviews();
// Display the customer's reviews 
System.out.println("Here are your reviews:");
customer.displayReviews();
scanner.close();
  }
}