package ru.pavelnix;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Класс для проверки класса EvenOdd
 */
public class EvenOddTest {

    /**
     * Тестируем то что 0 - четное
     *
     * @throws Exception
     */
    @Test
    public void checkThatZeroIsEven() throws Exception {
        //Assign
        int number = 0;

        //Act
        EvenOdd evenOdd = new EvenOdd(number);
        //Assert
        assertTrue(evenOdd.checkEvenOdd());
    }

    /**
     * Тестируем то что отрицательное четное число - четное
     *
     * @throws Exception
     */
    @Test
    public void checkThatNegativeEvenNumberIsEven() throws Exception {
        //Assign
        int number = -2;

        //Act
        EvenOdd evenOdd = new EvenOdd(number);
        //Assert
        assertTrue(evenOdd.checkEvenOdd());
    }

    /**
     * Тестируем то что отрицательное нечетное число - нечетное
     *
     * @throws Exception
     */
    @Test
    public void checkThatNegativeOddNumberIsOdd() throws Exception {
        //Assign
        int number = -3;

        //Act
        EvenOdd evenOdd = new EvenOdd(number);
        //Assert
        assertFalse(evenOdd.checkEvenOdd());
    }

    /**
     * Тестируем то что положительное четное число - четное
     *
     * @throws Exception
     */
    @Test
    public void checkThatPozitiveEvenNumberIsEven() throws Exception {
        //Assign
        int number = 2;

        //Act
        EvenOdd evenOdd = new EvenOdd(number);
        //Assert
        assertTrue(evenOdd.checkEvenOdd());
    }

    /**
     * Тестируем то что положительное нечетное число - нечетное
     *
     * @throws Exception
     */
    @Test
    public void checkThatPozitiveOddNumberIsOdd() throws Exception {
        //Assign
        int number = 3;

        //Act
        EvenOdd evenOdd = new EvenOdd(number);
        //Assert
        assertFalse(evenOdd.checkEvenOdd());
    }
}