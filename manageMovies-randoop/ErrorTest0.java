import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

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
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        src.primaryUseCases.manageMovies.manageMoviesBusinessLayer manageMoviesBusinessLayer0 = new src.primaryUseCases.manageMovies.manageMoviesBusinessLayer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        manageMoviesBusinessLayer0.addMovie();
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        src.primaryUseCases.manageMovies.manageMoviesBusinessLayer manageMoviesBusinessLayer0 = new src.primaryUseCases.manageMovies.manageMoviesBusinessLayer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        manageMoviesBusinessLayer0.updateMovie();
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        src.primaryUseCases.manageMovies.manageMoviesBusinessLayer manageMoviesBusinessLayer0 = new src.primaryUseCases.manageMovies.manageMoviesBusinessLayer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.List<src.dataStore.Movie> movieList1 = manageMoviesBusinessLayer0.getMovies();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        src.primaryUseCases.manageMovies.manageMoviesBusinessLayer manageMoviesBusinessLayer0 = new src.primaryUseCases.manageMovies.manageMoviesBusinessLayer();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        manageMoviesBusinessLayer0.deleteMovie();
    }
}

