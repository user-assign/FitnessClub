import java.util.ArrayList;
import java.util.Scanner;

public class FitnessClub {
    private ArrayList<FitnessLesson> lessons;

    public FitnessClub() {
        lessons = new ArrayList<>();
        // add some example lessons
        lessons.add(new FitnessLesson("Spin", "Saturday", 5, 10.0));
        lessons.add(new FitnessLesson("Yoga", "Sunday", 5, 10.0));
        lessons.add(new FitnessLesson("Bodysculpt", "Saturday", 5, 10.0));
        lessons.add(new FitnessLesson("Zumba", "Sunday", 5, 10.0));
        lessons.add(new FitnessLesson("Aquacise", "Saturday", 5, 10.0));
        lessons.add(new FitnessLesson("Box Fit", "Sunday", 5, 10.0));
    }

    public void displayTimetable() {
        System.out.println("Fitness lessons timetable:");
        for (FitnessLesson lesson : lessons) {
            System.out.println(lesson.getName() + " on " + lesson.getDay() + " at " + lesson.getPrice() + " dollars");
        }
    }

    public boolean makeBooking(String name, String day) {
        for (FitnessLesson lesson : lessons) {
            if (lesson.getName().equals(name) && lesson.getDay().equals(day)) {
                if (!lesson.isFull()) {
                    lesson.incrementNumBookings();
                    return true;
                } else {
                    System.out.println("Sorry, " + name + " on " + day + " is fully booked.");
                    return false;
                }
            }
        }
        System.out.println("Invalid lesson name or day.");
        return false;
    }

    public void displayBookings() {
        System.out.println("Your bookings:");
        for (FitnessLesson lesson : lessons) {
            if (lesson.getNumBookings() > 0) {
                System.out.println(lesson.getName() + " on " + lesson.getDay());
            }
        }
    }

    public void askForReview() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please rate the classes you took on a scale of 1-5:");
        for (FitnessLesson lesson : lessons) {
            if (lesson.getNumBookings() > 0) {
                System.out.print(lesson.getName() + " on " + lesson.getDay() + ": ");
                int rating = scanner.nextInt();
                // do something with the rating, e.g. store it in the lesson object
            }
        }
    }
}
