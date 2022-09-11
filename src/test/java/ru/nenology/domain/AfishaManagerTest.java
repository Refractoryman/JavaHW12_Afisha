package ru.nenology.domain;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AfishaManagerTest {
    AfishaManager manager = new AfishaManager();

    String movie1 = "movie1";
    String movie2 = "movie2";
    String movie3 = "movie3";
    String movie4 = "movie4";
    String movie5 = "movie5";
    String movie6 = "movie6";
    String movie7 = "movie7";
    String movie8 = "movie8";
    String movie9 = "movie9";
    String movie10 = "movie10";

    @Test
    public void shouldAddMovie() {
        manager.add(movie1);
        manager.add(movie2);

        String[] expected = {movie1, movie2};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldBeNoMovies() {

        String[] expected = {};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddAllMovies() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        String[] expected = {
                movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10,
        };
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllLimit6() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);

        String[] expected = {
                movie1, movie2, movie3, movie4, movie5, movie6,
        };
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFiveMovies() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);

        String[] expected = {
                movie5, movie4, movie3, movie2, movie1,
        };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastTenLimitFiveMovies() {
        AfishaManager manager = new AfishaManager(5);
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        String[] expected = {movie10, movie9, movie8, movie7, movie6};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastTenMovies() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);

        String[] expected = {
                movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1,
        };
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
}
