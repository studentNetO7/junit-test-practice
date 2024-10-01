package testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void isBigPositive() {
//        given
        Author author = new Author("Лев", "Толстой", 5);
        Book book = new Book("Война и мир. Том 1 и 2", 1873, author, 625);
//        when
        boolean result = book.isBig();
//        then
        Assertions.assertTrue(result);
    }
    @Test
    void isBigNegative() {
//        given
        Author author = new Author("Лев", "Толстой", 5);
        Book book = new Book("Война и мир. Том 1 и 2", 1873, author, 10);
//        when
        boolean result = book.isBig();
//        then
        Assertions.assertFalse(result);
    }

    @Test
    void matches() {
//        given
        Author author = new Author("Лев", "Толстой", 5);
        Book book = new Book("Война и мир. Том 1 и 2", 1873, author, 10);
        String word = "мир";
//        when
        boolean result = book.matches(word);
//        then
        Assertions.assertTrue(result);
    }
    @Test
    void matchesNegative() {
//        given
        Author author = new Author("Лев", "Толстой", 5);
        Book book = new Book("Война и мир. Том 1 и 2", 1873, author, 10);
        String word = "peace";
//        when
        boolean result = book.matches(word);
//        then
        Assertions.assertFalse(result);
    }

    @Test
    void estimatePricePositive() {
//        given
        Author author = new Author("Лев", "Толстой", 5);
        Book book = new Book("Война и мир. Том 1 и 2", 1873, author, 625);
        final int expected = 4192;
//        when
        int result = book.estimatePrice();
//        then
        Assertions.assertEquals(expected,result);
    }
    @Test
    void estimatePriceZeroRate() {
//        given
        int rating = 0;
        Author author = new Author("Лев", "Толстой", rating);
        Book book = new Book("Война и мир. Том 1 и 2", 1873, author, 625);
        final int expected = 250;
//        when
        int result = book.estimatePrice();
//        then
        Assertions.assertEquals(expected,result);
    }
   }