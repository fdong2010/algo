import org.junit.Test;
import static org.junit.Assert.*;

public class AddTwoNumbersSolutionTest {

    // Helper method to create a linked list from an array
    private ListNode buildList(int... vals) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int v : vals) {
            curr.next = new ListNode(v);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper method to convert a linked list to an array
    private int[] toArray(ListNode node) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) arr[i] = list.get(i);
        return arr;
    }

    @Test
    public void testAddTwoNumbers_SimpleCase() {
        AddTwoNumbersSolution sol = new AddTwoNumbersSolution();
        ListNode l1 = buildList(2, 4, 3); // 342
        ListNode l2 = buildList(5, 6, 4); // 465
        ListNode result = sol.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{7, 0, 8}, toArray(result)); // 807
    }

    @Test
    public void testAddTwoNumbers_DifferentLengths() {
        AddTwoNumbersSolution sol = new AddTwoNumbersSolution();
        ListNode l1 = buildList(9, 9); // 99
        ListNode l2 = buildList(1);    // 1
        ListNode result = sol.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{0, 0, 1}, toArray(result)); // 100
    }

    @Test
    public void testAddTwoNumbers_WithCarryAtEnd() {
        AddTwoNumbersSolution sol = new AddTwoNumbersSolution();
        ListNode l1 = buildList(9, 9, 9); // 999
        ListNode l2 = buildList(1);       // 1
        ListNode result = sol.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{0, 0, 0, 1}, toArray(result)); // 1000
    }

    @Test
    public void testAddTwoNumbers_Zeroes() {
        AddTwoNumbersSolution sol = new AddTwoNumbersSolution();
        ListNode l1 = buildList(0);
        ListNode l2 = buildList(0);
        ListNode result = sol.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{0}, toArray(result));
    }

    @Test
    public void testAddTwoNumbers_EmptyList() {
        AddTwoNumbersSolution sol = new AddTwoNumbersSolution();
        ListNode l1 = null;
        ListNode l2 = buildList(1, 2, 3);
        ListNode result = sol.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{1, 2, 3}, toArray(result));
    }
}

// ListNode definition for testing
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}