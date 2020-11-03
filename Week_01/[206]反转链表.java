//反转一个单链表。 
//
// 示例: 
//
// 输入: 1->2->3->4->5->NULL
//输出: 5->4->3->2->1->NULL 
//
// 进阶: 
//你可以迭代或递归地反转链表。你能否用两种方法解决这道题？ 
// Related Topics 链表 
// 👍 1315 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
//    iterative;
//    public ListNode reverseList(ListNode head) {
//        ListNode cur = null;
//        while (head != null) {
//            ListNode temp = head.next;
//            head.next = cur;
//            cur = head;
//            head = temp;
//        }
//        return cur;
//    }
//    recursion;
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = null;
        ListNode res = reverseList(next);
        next.next = head;
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
