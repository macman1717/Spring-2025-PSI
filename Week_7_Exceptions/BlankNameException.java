package Week_7_Exceptions;

import java.util.InputMismatchException;

public class BlankNameException extends InputMismatchException {
    public BlankNameException() {
    }

    public BlankNameException(String s) {
        super(s);
    }
}
