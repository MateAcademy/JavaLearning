import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

import java.beans.Transient;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 * @author Sergey Klunniy
 */
public class Exercises {

    // Exercise 1: Print out all the words in wordList, which is
// a static List<String> defined at the bottom of this file.
    @Test
    @Disabled
    public void printAllWords() {
        wordList.forEach(System.out::println);
    }

    // Exercise 2: Convert all worlds in worldList to upper case,
// and gather the result into an output list
    @Test
    @Disabled
    public void upperCaseWords() {
        List<String> output = wordList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        assertEquals(
                Arrays.asList("EVERY", "PROBLEM", "IN", "COMPUTER",
                        "SCIENCE", "CAN", "BE", "SOLVED", "BY", "ADDING",
                        "ANOTHER", "LEVEL", "OF", "INDIRECTION" ),
                output);
    }

    // Exercise 3: Fined all the words in wordList that have even length
// and put them into an output list.
    @Test
    @Disabled
    public void findEvenLengthWords() {
        List<String> output = wordList.stream()
                .filter(t -> t.length() % 2 == 0).collect(Collectors.toList());

        assertEquals(
                Arrays.asList("in", "computer", "be", "solved", "by", "adding", "of" ),
                output);
    }

    // Exercise 4: Count the number of lines in a file. The field *reader*
// is a BufferedReader which will be opened for you on the text file.
// See the JUnit @Before and @After methods at the bottom of this file.
// The text file is "SonnetI.txt" (Shakespeare's first sonnet) which is
// located at the root of this project.
    @Test
    @Disabled
    public void countLinesInFile() throws IOException {
        long count = reader.lines().count();
        assertEquals(14, count);
    }

    // Exercise 5: Join lines 3-4 from the text file into a single string.
    @Test
    @Disabled
    public void joinLineRange() throws IOException {
        String output = reader.lines().skip(2).limit(2).collect(Collectors.joining());

        assertEquals(
                "But as the riper should by time decease,"
                        + "His tender heir might bear his memory;",
                output);
    }

// Exercise 6: Fined the length of the longest line in the file

    @Test
    @Disabled
    public void lengthOfLongestLine() throws IOException {
        int longest = reader.lines().map(String::length).max(Comparator.comparingInt(o -> o)).get();
//        int longest = reader.lines().mapToInt(String::length).max().getAsInt();
        assertEquals(longest, 53);
    }


// 7. Collect all the words from the text file into a list
// Hint: use String.split(REGEXP) to split a string into words.
// Splitting this way results in "words" that are the empty string,
// which should be discarded. REGEX is defined at the bottom of this file
// собрать все слова текста в список
    @Test @Disabled
    public void listOfAllWords() throws IOException {
        List<String> output = reader.lines().flatMap(t -> Arrays.stream(t.split(REGEXP))).collect(Collectors.toList());

        assertEquals(
                Arrays.asList(
                        "From", "fairest", "creatures", " we", "desire", "increase",
                        "That", "thereby", "beauty", "s", "rose", "might", "never", "die",
                        "But", "as", "the", "riper", "should", "by", "time", "decease",
                        "His", "tender", "heir", "might", "bear", "his", "memory",
                        "But", "thou", "contracted", "to", "thine", "own", "bright", "eyes",
                        "Feed’st", "thy", "light’s", "flame", "with", "self-substantial", "fuel",
                        "Making", "a", "famine", "where", "abundance", "lies",
                        "Thyself", "thy", "foe", "to", "thy", "sweet", "self", "too", "cruel",
                        "Thou", "that", "art", "now", "the", "world’s", "fresh", "ornament",
                        "And", "only", "herald", "to", "the", "gaudy", "spring",
                        "Within", "thine", "own", "bud", "buriest", "thy", "content",
                        "And", "tender", "churl", "mak’st", "waste", "in", "niggarding",
                        "Pity", "the", "world", "or", "else", "this", "glutton", "be",
                        "To", "eat", "the", "world’s", "due", "by", "the", "grave", "and", "thee"
                ), output);
    }

// Exercise 8: Create a list containing the words, lowercased, n alphabetical order

    public void sortedLowerCase() throws IOException {
        List<String> output = null;

        assertEquals(Arrays.asList(
                "a", "abendance", "and", "and"
        ), output);
    }


// Exercise 9: Sort unique, lower-cased words by length, then alphabetically
// within length, and place the result into an output list

    public void sortedLowerCaseDistinctByLengthThenAlphabetically() throws IOException {
        List<String> output = null;

        assertEquals(Arrays.asList(
                "a", "s", "as", "be", "by", "in", "or", "st"
        ), output);
    }

    //10
    @Test
    @Disabled
    public void mapLengthToWordList() throws IOException {
        Map<Integer, List<String>> map = null;

        assertEquals(6, map.get(7).size());
        assertEquals(Arrays.asList("increase", "ornament" ), map.get(8));
        assertEquals(Arrays.asList("creatures", "abundance" ), map.get(9));
        assertEquals(Arrays.asList("contracted", "niggarding" ), map.get(10));
        assertEquals(Arrays.asList("substantial" ), map.get(11));
        assertFalse(map.containsKey(12));
    }

// Exc

    static List<String> wordList = Arrays.asList(
            "every", "problem", "in", "computer", "science",
            "can", "be", "solved", "by", "adding", "another",
            "level", "of", "indirection" );

    static final String REGEXP = "\\W+";

    private BufferedReader reader;

    @Before
    public void setUpBufferedReader() throws IOException {
        reader = Files.newBufferedReader(
                Paths.get("E:\\java-programms\\JavaLerning\\JavaLerning\\SonnetI.txt" ), StandardCharsets.UTF_8);
    }


}
