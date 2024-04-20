import java.util.Scanner;

public class ConsoleInputOutput implements InputOutput {
    private Scanner scanner;

    public ConsoleInputOutput() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int readInt() {
        return scanner.nextInt();
    }

    @Override
    public void print(String message) {
        System.out.print(message);
    }
}