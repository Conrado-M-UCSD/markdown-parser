import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1+1);
    }
    // @Test
    // public void testgetLinks() throws IOException {
    //     Path path2filename = Path.of("./test-file.md");
    //     String contents = Files.readString(path2filename);
    //     ArrayList<String> expected = new ArrayList(List.of("https://something.com", "some-thing.html"));
    //     assertEquals(expected,MarkdownParse.getLinks(contents));
    // }
    // @Test
    // public void testgetLinks2() throws IOException {
    //     String filename = "./test-file1.md";
    //     Path path2filename = Paths.get(filename);
    //     String contents = Files.readString(path2filename);
    //     ArrayList<String> expected = new ArrayList(List.of("https://something.com", "some-thing.html"));
    //     assertEquals(expected,MarkdownParse.getLinks(contents));
    // }
    // @Test
    // public void testgetLinks3() throws IOException {
    //     String filename = "test-file2.md";
    //     Path path2filename = Paths.get(filename);
    //     String contents = Files.readString(path2filename);
    //     ArrayList<String> expected = new ArrayList(List.of("some-thing.html"));
    //     assertEquals(expected,MarkdownParse.getLinks(contents));
    // }
    // @Test
    // public void testgetLinks4() throws IOException {
    //     String filename = "test-file3.md";
    //     Path path2filename = Paths.get(filename);
    //     String contents = Files.readString(path2filename);
    //     ArrayList<String> expected = new ArrayList(List.of("https://something.com", "some-thing.html"));
    //     assertEquals(expected,MarkdownParse.getLinks(contents));
    // }
    // @Test
    // public void testgetLinks5() throws IOException {
    //     String filename = "test-file4.md";
    //     Path path2filename = Paths.get(filename);
    //     String contents = Files.readString(path2filename);
    //     ArrayList<String> expected = new ArrayList(List.of("https://something.com", "some-thing.html"));
    //     assertEquals(expected,MarkdownParse.getLinks(contents));
    // }

    @Test
    public void testLR4Snippet1() throws IOException{
        String filename = "./lr4-testfile1.md";
        Path pathToFile = Paths.get(filename); 
        String contents = Files.readString(pathToFile); 
        ArrayList<String> expected = new ArrayList<String>(List.of("google.com", "google.com", "ucsd.edu")); 
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testLR4Snippet2() throws IOException{
        String filename = "./lr4-testfile2.md";
        Path pathToFile = Paths.get(filename); 
        String contents = Files.readString(pathToFile); 
        ArrayList<String> expected = new ArrayList<String>(List.of("a.com", "a.com()", "example.edu")); 
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }

    @Test
    public void testLR4Snippet3() throws IOException{
        
        String filename = "./lr4-testfile3.md";
        Path pathToFile = Paths.get(filename); 
        String contents = Files.readString(pathToFile); 
        ArrayList<String> expected = new ArrayList<String>(List.of("https://www.twitter.com",
         "https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule", "https://cse.ucsd.edu/")); 
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }
}
