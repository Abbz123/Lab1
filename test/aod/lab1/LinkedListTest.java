package aod.lab1;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

/**
 * Testklass för LinkedList.
 *
 * Denna klass innehåller JUnit-tester som kontrollerar
 * att LinkedList fungerar korrekt.
 */
public class LinkedListTest {

    // ===== add(T data) =====

    @Test
    public void testAddOneElement() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);

        assertEquals(1, list.size());
        assertEquals(10, list.get(0));
    }

    @Test
    public void testAddSeveralElements() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

        assertEquals(3, list.size());
        assertEquals(30, list.get(2));
    }

    // ===== add(T data, int index) =====

    @Test
    public void testAddWithIndexInMiddle() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(30);
        list.add(20, 1);

        assertEquals(3, list.size());
        assertEquals(20, list.get(1));
    }

    @Test
    public void testAddWithIndexAtBeginning() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(20);
        list.add(10, 0);

        assertEquals(2, list.size());
        assertEquals(10, list.get(0));
    }

    @Test
    public void testAddInvalidIndexThrowsException() {
        LinkedList<Integer> list = new LinkedList<>();

        assertThrows(IndexOutOfBoundsException.class, () -> list.add(5, 1));
    }

    // ===== get(int index) =====

    @Test
    public void testGetFirstElement() {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");

        assertEquals("A", list.get(0));
    }

    @Test
    public void testGetLastElement() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(3, list.get(2));
    }

    @Test
    public void testGetInvalidIndexThrowsException() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);

        assertThrows(IndexOutOfBoundsException.class, () -> list.get(5));
    }

    // ===== set(T data, int index) =====

    @Test
    public void testSetFirstElement() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.set(99, 0);

        assertEquals(99, list.get(0));
    }

    @Test
    public void testSetMiddleElement() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.set(100, 1);

        assertEquals(100, list.get(1));
    }

    // ===== remove() =====

    @Test
    public void testRemoveLastElement() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);

        list.remove();

        assertEquals(1, list.size());
        assertEquals(1, list.get(0));
    }

    @Test
    public void testRemoveLastOnSingleElementList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);

        list.remove();

        assertEquals(0, list.size());
    }

    // ===== remove(int index) =====

    @Test
    public void testRemoveAtIndexInMiddle() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        list.remove(1);

        assertEquals(2, list.size());
        assertEquals(3, list.get(1));
    }

    @Test
    public void testRemoveAtIndexBeginning() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(6);

        list.remove(0);

        assertEquals(1, list.size());
        assertEquals(6, list.get(0));
    }

    @Test
    public void testRemoveInvalidIndexThrowsException() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);

        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(1));
    }

    // ===== size() =====

    @Test
    public void testSizeEmptyList() {
        LinkedList<Integer> list = new LinkedList<>();

        assertEquals(0, list.size());
    }

    @Test
    public void testSizeAfterAdditions() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        assertEquals(3, list.size());
    }

    // ===== clear() =====

    @Test
    public void testClearNonEmptyList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);

        list.clear();

        assertEquals(0, list.size());
    }

    @Test
    public void testClearEmptyList() {
        LinkedList<Integer> list = new LinkedList<>();

        list.clear();

        assertEquals(0, list.size());
    }
}