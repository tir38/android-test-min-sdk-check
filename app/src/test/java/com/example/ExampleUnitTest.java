package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        Path some_file_on_disk = Paths.get("some file on disk");
        assertEquals(4, 2 + 2);
    }
}