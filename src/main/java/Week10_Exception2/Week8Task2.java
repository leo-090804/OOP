package Week10_Exception2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {
    public void nullPointerEx() throws NullPointerException {
        throw new NullPointerException();
    }

    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        throw new ArrayIndexOutOfBoundsException();
    }

    public void arithmeticEx() throws ArithmeticException {
        throw new ArithmeticException();
    }

    public void fileNotFoundEx() throws FileNotFoundException {
        throw new FileNotFoundException();
    }

    public void ioEx() throws IOException {
        throw new IOException();
    }

    /**
     * javadoc.
     */
    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (Exception e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    /**
     * javadoc.
     */
    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (Exception e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    /**
     * javadoc.
     */
    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (Exception e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    /**
     * javadoc.
     */
    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    /**
     * javadoc.
     */
    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}