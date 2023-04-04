import java.util.*;
public class Main {
    public static void main(String[] args) {
    FitnessClub club = new FitnessClub();
    Scanner scanner = new Scanner(System.in);
    boolean done = false;
    while (!done) {
    System.out.println("\nWelcome to the fitness club application!\n");
    System.out.println("Please choose an option:");
    System.out.println("1. Display timetable");
    System.out.println("2. Make booking");
    System.out.println("3. Display bookings");
    System.out.println("4. Rate classes");
    System.out.println("5. Exit");
    int choice = scanner.nextInt();
    switch (choice) {
    case 1:
    club.displayTimetable();
    break;
    case 2:
    System.out.println("Please enter the name of the lesson:");
    String name = scanner.next();
    System.out.println("Please enter the day of the lesson:");
    String day = scanner.next();
    boolean success = club.makeBooking(name, day);
    if (success) {
    System.out.println("Booking successful.");
    }
    break;
    case 3:
    club.displayBookings();
    break;
    case 4:
    club.askForReview();
    break;
    case 5:
    done = true;
    System.out.println("Goodbye!");
    break;
    default:
    System.out.println("Invalid choice.");
    }
    }
    }
    }