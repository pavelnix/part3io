package ru.pavelnix;

/**
 * Класс для определения четности числа
 */
public class EvenOdd {

    private int number;

    /**
     * Конструктор класса
     *
     * @param number - число которое нужно проверить на четность
     */
    public EvenOdd(int number) {
        this.number = number;
    }

    /**
     * Метод проверяет число на четность
     *
     * @return булевское значение true - если четное и
     * false если не четное
     */
    public boolean checkEvenOdd() {
        boolean result;
        if (number % 2 == 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
