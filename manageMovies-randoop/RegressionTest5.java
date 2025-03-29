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
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        src.primaryUseCases.manageMovies.manageMoviesDataLayer manageMoviesDataLayer0 = null;
        src.primaryUseCases.manageMovies.manageMoviesBusinessLayer manageMoviesBusinessLayer1 = new src.primaryUseCases.manageMovies.manageMoviesBusinessLayer(manageMoviesDataLayer0);
        // The following exception was thrown during execution in test generation
        try {
// flaky "1) test01(RegressionTest0)":             manageMoviesBusinessLayer1.addMovie();
// flaky "1) test01(RegressionTest0)":             org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.primaryUseCases.manageMovies.manageMoviesDataLayer.getMovie(String)\" because \"this.dataLayer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        java.util.Scanner scanner0 = null;
        src.primaryUseCases.manageMovies.manageMoviesBusinessLayer manageMoviesBusinessLayer1 = new src.primaryUseCases.manageMovies.manageMoviesBusinessLayer(scanner0);
        // The following exception was thrown during execution in test generation
        try {
            manageMoviesBusinessLayer1.addMovie();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.util.Scanner.nextLine()\" because \"this.scanner\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        java.util.Scanner scanner0 = null;
        src.primaryUseCases.manageMovies.manageMoviesBusinessLayer manageMoviesBusinessLayer1 = new src.primaryUseCases.manageMovies.manageMoviesBusinessLayer(scanner0);
        // The following exception was thrown during execution in test generation
        try {
            manageMoviesBusinessLayer1.updateMovie();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.primaryUseCases.manageMovies.manageMoviesDataLayer.displayMovies(int)\" because \"this.dataLayer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        java.util.Scanner scanner0 = null;
        src.primaryUseCases.manageMovies.manageMoviesBusinessLayer manageMoviesBusinessLayer1 = new src.primaryUseCases.manageMovies.manageMoviesBusinessLayer(scanner0);
        // The following exception was thrown during execution in test generation
        try {
            manageMoviesBusinessLayer1.deleteMovie();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.primaryUseCases.manageMovies.manageMoviesDataLayer.displayMovies(int)\" because \"this.dataLayer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        java.util.Scanner scanner0 = null;
        src.primaryUseCases.manageMovies.manageMoviesBusinessLayer manageMoviesBusinessLayer1 = new src.primaryUseCases.manageMovies.manageMoviesBusinessLayer(scanner0);
        java.lang.Class<?> wildcardClass2 = manageMoviesBusinessLayer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        src.primaryUseCases.manageMovies.manageMoviesDataLayer manageMoviesDataLayer0 = null;
        src.primaryUseCases.manageMovies.manageMoviesBusinessLayer manageMoviesBusinessLayer1 = new src.primaryUseCases.manageMovies.manageMoviesBusinessLayer(manageMoviesDataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            manageMoviesBusinessLayer1.updateMovie();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.primaryUseCases.manageMovies.manageMoviesDataLayer.displayMovies(int)\" because \"this.dataLayer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        src.primaryUseCases.manageMovies.manageMoviesBusinessLayer manageMoviesBusinessLayer0 = new src.primaryUseCases.manageMovies.manageMoviesBusinessLayer();
        java.lang.Class<?> wildcardClass1 = manageMoviesBusinessLayer0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        src.primaryUseCases.manageMovies.manageMoviesDataLayer manageMoviesDataLayer0 = null;
        src.primaryUseCases.manageMovies.manageMoviesBusinessLayer manageMoviesBusinessLayer1 = new src.primaryUseCases.manageMovies.manageMoviesBusinessLayer(manageMoviesDataLayer0);
        java.lang.Class<?> wildcardClass2 = manageMoviesBusinessLayer1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        src.primaryUseCases.manageMovies.manageMoviesDataLayer manageMoviesDataLayer0 = null;
        src.primaryUseCases.manageMovies.manageMoviesBusinessLayer manageMoviesBusinessLayer1 = new src.primaryUseCases.manageMovies.manageMoviesBusinessLayer(manageMoviesDataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            manageMoviesBusinessLayer1.deleteMovie();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.primaryUseCases.manageMovies.manageMoviesDataLayer.displayMovies(int)\" because \"this.dataLayer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        java.util.Scanner scanner0 = null;
        src.primaryUseCases.manageMovies.manageMoviesBusinessLayer manageMoviesBusinessLayer1 = new src.primaryUseCases.manageMovies.manageMoviesBusinessLayer(scanner0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<src.dataStore.Movie> movieList2 = manageMoviesBusinessLayer1.getMovies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.primaryUseCases.manageMovies.manageMoviesDataLayer.getMovies()\" because \"this.dataLayer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        src.primaryUseCases.manageMovies.manageMoviesDataLayer manageMoviesDataLayer0 = null;
        src.primaryUseCases.manageMovies.manageMoviesBusinessLayer manageMoviesBusinessLayer1 = new src.primaryUseCases.manageMovies.manageMoviesBusinessLayer(manageMoviesDataLayer0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<src.dataStore.Movie> movieList2 = manageMoviesBusinessLayer1.getMovies();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"src.primaryUseCases.manageMovies.manageMoviesDataLayer.getMovies()\" because \"this.dataLayer\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}
