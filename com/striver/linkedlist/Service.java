package com.striver.linkedlist;

import java.util.*;

public class Service {

    public void traverse(Node head) {
        Node temp = head;

        while(temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.print(temp.data);
    }

//    L1. Introduction to LinkedList | Traversal | Length | Search an Element
    public Node convertArrToLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i = 1; i < arr.length; i++) {
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }


//    ********** L5. Add 2 numbers in LinkedList | Dummy Node Approach **********
    public Node addTwoNumbers(Node head1, Node head2) {
        Node temp1 = head1, temp2 = head2;
        int carry = 0;

        Node head3 = new Node(-1);
        Node tail = head3;

        while(temp1 != null || temp2 != null) {
            int num = carry;

            if(temp1 != null) num += temp1.data;
            if(temp2 != null) num += temp2.data;

            carry = num/10;
            num = num%10;

            tail.next = new Node(num);
            tail = tail.next;

            if(temp1 != null) temp1 = temp1.next;
            if(temp2 != null) temp2 = temp2.next;
        }

        if(carry != 0) {
            tail.next = new Node(carry);
        }

        return head3.next;
    }

//    ********** L6. Odd Even Linked List | Multiple Approaches **********
    public Node oddEven(Node head) {
        if(head == null || head.next == null) return head;

        Node odd = head, even = head.next, evenHead = head.next;

        while(even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;

        return head;
    }
    public Node oddEvenBruteForce(Node head) {
        if(head == null || head.next == null) return head;

        Node odd = head, even = head.next;
        List<Integer> result = new LinkedList<>();

        while(odd != null && odd.next != null) {
            result.add(odd.data);
            odd = odd.next.next;
        }
        if(odd != null) {
            result.add(odd.data);
        }

        while(even != null && even.next != null) {
            result.add(even.data);
            even = even.next.next;
        }
        if(even != null) {
            result.add(even.data);
        }

        Node temp = head;
        int index = 0;

        while(temp != null) {
            temp.data = result.get(index);
            temp = temp.next;
            index++;
        }

        return head;
    }

//    ********** L7. Sort a LinkedList of 0's, 1's and 2's | Multiple Approaches **********
    public Node sortSpecial(Node head) {
        if(head == null || head.next == null) return head;

        Node temp = head, zero = new Node(-1), one = new Node(-1), two = new Node(-1);
        Node zeroTail = zero, oneTail = one, twoTail = two;

        while(temp != null) {
            if(temp.data == 0) {
                zeroTail.next = temp;
                zeroTail = zeroTail.next;
            }
            else if(temp.data == 1) {
                oneTail.next = temp;
                oneTail = oneTail.next;
            }
            else if(temp.data == 2) {
                twoTail.next = temp;
                twoTail = twoTail.next;
            }

            temp = temp.next;
        }

        zeroTail.next = one.next != null ? one.next : two.next;
        oneTail.next = two.next;
        twoTail.next = null;

        return zero.next;
    }
    public Node sortSpecialBruteForce(Node head) {
        if(head == null || head.next == null) return head;

        int count0 = 0, count1 = 0, count2 = 0;
        Node temp = head;

        while(temp != null) {
            if(temp.data == 0) count0++;
            else if(temp.data == 1) count1++;
            else if(temp.data == 2) count2++;

            temp = temp.next;
        }

        temp = head;

        while(temp != null) {
            if(count0 > 0) {
                temp.data = 0;
                count0--;
            }
            else if(count1 > 0) {
                temp.data = 1;
                count1--;
            }
            else if(count2 > 0) {
                temp.data = 2;
                count2--;
            }
            temp = temp.next;
        }

        return head;
    }

//    L8. Remove Nth Node from the end of the LinkedList | Multiple Approaches
    public Node removeFromEnd(Node head, int N) {
        Node fast = head, slow = head;
        int i = N;

        while(fast != null && i != 0) {
            fast = fast.next;
            i--;
        }

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        if(fast == null) {
            head = head.next;
            return head;
        }

        slow.next = slow.next.next;

        return head;
    }
    public Node removeFromEndBruteForce(Node head, int N) {
        int totalLength = 0;
        Node temp = head;

        while(temp != null) {
            temp = temp.next;
            totalLength++;
        }

        temp = head;
        int prevIndex = 1;

        while(temp != null && prevIndex < totalLength-N) {
            temp = temp.next;
            prevIndex++;
        }

        if(temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

//    L10. Check if a LinkedList is Palindrome or Not | Multiple Approaches
    // optimized approach requires 2 auxiliary functions - findMiddle() and reverse()
    public boolean checkPalindrome(Node head) {
        Node temp = head;
        Node mid = findMiddle(head);
        Node reversedStart = reverse(mid);
        Node temp2 = reversedStart;

        while(temp != null && temp2 != null) {
            if(temp.data != temp2.data) return false;
            temp = temp.next;
            temp2 = temp2.next;
        }

        reverse(reversedStart);
        return true;
    }
    public Node findMiddle(Node head) {
        Node slow = head, fast = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public Node reverse(Node head) {
        Node prev = null, curr = head, temp = null;

        while(curr != null) {
            temp = curr.next;
            curr.next = prev;

            prev = curr;
            curr = temp;
        }

        head = prev;

        return head;
    }
    public boolean checkPalindromeBruteForce(Node head) {
        Stack<Integer> stack = new Stack<>();
        Node temp = head;

        while(temp != null) {
            stack.push(temp.data);
            temp = temp.next;
        }

        temp = head;

        while(temp != null) {
            int data = stack.pop();
            if(data != temp.data) return false;
            temp = temp.next;
        }

        return true;
    }
//    L12. Find the intersection point of Y LinkedList
    public Node findIntersectionPoint(Node head1, Node head2) {
        Node temp1 = head1, temp2 = head2;
        int length1 = 0, length2 = 0;

        while(temp1 != null) {
            length1++;
            temp1 = temp1.next;
        }
        while(temp2 != null) {
            length2++;
            temp2 = temp2.next;
        }

        temp1 = head1;
        temp2 = head2;

        int diff = Math.max(length1, length2) - Math.min(length1, length2);

        if(length1 < length2) {
            while(diff > 0) {
                diff--;
                temp2 = temp2.next;
            }
        }
        if(length1 > length2) {
            while(diff > 0) {
                diff--;
                temp1 = temp1.next;
            }
        }

        while(temp1 != null && temp2 != null) {
            if(temp1 == temp2) return temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        return null;
    }
}
