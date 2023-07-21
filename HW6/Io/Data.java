package HW6.Io;

public interface Data extends Reader, Printer {
    default double input(String text) {
        print(text);
        return read();
    }
}
