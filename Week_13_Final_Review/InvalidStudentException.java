package Week_13_Final_Review;

import java.io.IOException;

//extends IOException to make it a checked exception
public class InvalidStudentException extends IOException {
    public InvalidStudentException(String message) {
        super(message);
    }

    public InvalidStudentException() {}
}
