package com.gildedrose;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }


    @Test
    void testTextTestFixtureOutput() throws IOException {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            TexttestFixture.main(new String[]{});

            System.setOut(originalOut);

            String actualOutput = outputStream.toString();

            String expectedOutput = Files.readString(
                Paths.get("src/test/resources/expected_output_before_feature.txt")
            );

            assertEquals(expectedOutput, actualOutput);

        } finally {
            System.setOut(originalOut);
        }
    }


}
