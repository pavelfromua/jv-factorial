/**
 * <p>Реализуйте метод getFactorial(int number) который вовзращает факториал числа.
 * Реализовать с помощью рекурсии.</p>
 */
public class Factorial {
    public int getFactorial(int number) {
        if (number > 1) {
            return number * getFactorial(number - 1);
        } else {
            return 1;
        }
    }
}
