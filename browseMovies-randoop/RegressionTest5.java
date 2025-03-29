import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest5 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError(
                        "Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test1");
        src.primaryUseCases.browseMovies.browseMoviesDataLayer browseMoviesDataLayer0 = null;
        src.primaryUseCases.browseMovies.browseMoviesBusinessLayer browseMoviesBusinessLayer1 = new src.primaryUseCases.browseMovies.browseMoviesBusinessLayer(
                browseMoviesDataLayer0);
        java.util.Scanner scanner2 = null;
        // The following exception was thrown during execution in test generation
        try {
            browseMoviesBusinessLayer1.searchMoviesByLanguage(scanner2);
            org.junit.Assert.fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Scanner.nextLine()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test2");
        src.primaryUseCases.browseMovies.browseMoviesDataLayer browseMoviesDataLayer0 = null;
        src.primaryUseCases.browseMovies.browseMoviesBusinessLayer browseMoviesBusinessLayer1 = new src.primaryUseCases.browseMovies.browseMoviesBusinessLayer(
                browseMoviesDataLayer0);
        java.util.Scanner scanner2 = null;
        // The following exception was thrown during execution in test generation
        try {
            browseMoviesBusinessLayer1.searchMoviesByTitle(scanner2);
            org.junit.Assert.fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Scanner.nextLine()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test3");
        src.primaryUseCases.browseMovies.browseMoviesDataLayer browseMoviesDataLayer0 = null;
        src.primaryUseCases.browseMovies.browseMoviesBusinessLayer browseMoviesBusinessLayer1 = new src.primaryUseCases.browseMovies.browseMoviesBusinessLayer(
                browseMoviesDataLayer0);
        java.util.Scanner scanner2 = null;
        // The following exception was thrown during execution in test generation
        try {
            browseMoviesBusinessLayer1.searchMoviesByRating(scanner2);
            org.junit.Assert.fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Scanner.nextDouble()\" because \"<parameter1>\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test4");
        src.primaryUseCases.browseMovies.browseMoviesDataLayer browseMoviesDataLayer0 = null;
        src.primaryUseCases.browseMovies.browseMoviesBusinessLayer browseMoviesBusinessLayer1 = new src.primaryUseCases.browseMovies.browseMoviesBusinessLayer(
                browseMoviesDataLayer0);
        java.lang.Class<?> wildcardClass2 = browseMoviesBusinessLayer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test5");
        src.primaryUseCases.browseMovies.browseMoviesDataLayer browseMoviesDataLayer0 = null;
        src.primaryUseCases.browseMovies.browseMoviesBusinessLayer browseMoviesBusinessLayer1 = new src.primaryUseCases.browseMovies.browseMoviesBusinessLayer(
                browseMoviesDataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            int int2 = browseMoviesBusinessLayer1.displayMovies();
            org.junit.Assert.fail(
                    "Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.primaryUseCases.browseMovies.browseMoviesDataLayer.browseMovies()\" because \"this.dataLayer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test6");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }
}
