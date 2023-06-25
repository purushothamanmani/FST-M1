package activities;

import java.util.ArrayList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity20 {
    static ArrayList<String> list;

    @BeforeEach
    void setUp(){
        list = new ArrayList<String>();
        list.add("John");
        list.add("Peter");
    }

    @Test
    public void insertTest() {
        assertEquals(2, list.size(), "Wrong size");
        list.add(2, "Donald");
        assertEquals(3, list.size(), "Wrong size");

        assertEquals("John", list.get(0), "Wrong element");
        assertEquals("Peter", list.get(1), "Wrong element");
        assertEquals("Donald", list.get(2), "Wrong element");
    }

    @Test
    public void replaceTest() {
        list.set(1, "charlie");
        assertEquals(2, list.size(), "Wrong size");
        assertEquals("John", list.get(0), "Wrong element");
        assertEquals("charlie", list.get(1), "Wrong element");
    }
}