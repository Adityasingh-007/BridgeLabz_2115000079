class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    int fee;
    int discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, int fee, int discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayInfo() {
        System.out.println("Course: " + courseName + " Duration: " + duration + " Platform: " + platform +
                " Fee: " + fee + " Discount: " + discount);
    }
}

public class EducationalHeirarchy {
    public static void main(String[] args) {
        PaidOnlineCourse course = new PaidOnlineCourse("Java", 3, "Udemy", true, 100, 10);
        course.displayInfo();
    }
}