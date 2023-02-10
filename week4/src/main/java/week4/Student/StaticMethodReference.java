package week4.Student;

public class StaticMethodReference {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> printMessage());
        thread1.start();
        Thread thread2 = new Thread(StaticMethodReference::printMessage);
        thread2.start();
    }

    private static void printMessage() {
        System.out.println("Hello!");
    }
}

