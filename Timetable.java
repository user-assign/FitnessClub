import java.util.ArrayList;

public class Timetable {
private Lesson[] saturdayLessons;
private Lesson[] sundayLessons;

public Timetable(Lesson[] saturdayLessons, Lesson[] sundayLessons) {
this.saturdayLessons = saturdayLessons;
this.sundayLessons = sundayLessons;
}

public Lesson[] viewTimetable(String day) {
if (day.equals(&quot;Saturday&quot;)) {
return saturdayLessons;
} else if (day.equals(&quot;Sunday&quot;)) {
return sundayLessons;
} else {
System.out.println(&quot;Invalid day&quot;);
return null;
}
}

public Lesson[] viewTimetable(String activity) {
ArrayList&lt;Lesson&gt; 
lessons = new ArrayList&lt;
Lesson&gt;();

for (Lesson lesson : saturdayLessons) {
if (lesson.getType().equals(activity)) {
lessons.add(lesson);
}
}

for (Lesson lesson : sundayLessons) {

if (lesson.getType().equals(activity)) {
lessons.add(lesson);
}
}

return lessons.toArray(new Lesson[lessons.size()]);
}
}