package week04;

public class DiveByZeroException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int result = a / b;
        System.out.println(result);
    }
}
/*Hilal
try {
        System.out.println(9 / 0);//Arithmetic Exception//runtime//shortcut ctrlAltT
        System.out.println("Try block");
        } catch (ArithmeticException e) {
        //   e.printStackTrace();
        System.out.println("Catch block");
        }

 */