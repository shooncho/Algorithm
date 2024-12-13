//package inflearn.array;
//
//import java.util.LinkedList;
//
//public class List01 {
//
//    private LinkedNode head;
//    private LinkedNode tail;
//
//    public static void main(String[] args) {
//        //단일 연결 리스트를 뒤집는 함수를 구현하라
//        //1 -> 2 -> 3 => 3 -> 2 -> 1
//        //연결 리스트 데이터 구조를 이해하고 있는가?
//        //재귀(recursion) 와 순회(iteration)을 모두 활용할 수 있는가?
//        LinkedList list = new LinkedList();
//        list.add(new LinkedNode(1));
//        list.add(new LinkedNode(2));
//        list.add(new LinkedNode(3));
//
//        list.print();
//        list.reverse();
//
//        list.print();
//    }
//
//    private void print() {
//        LinkedNode nodeToPring = this.head;
//        while(nodeToPring != null){
//            System.out.println(nodeToPring.number);
//            nodeToPring = nodeToPring.next;
//        }
//    }
//
//    private void add(LinkedNode node) {
//        if(head == null) {
//            head = node;
//            tail = node;
//        } else if (tail != null) {
//            tail.next = node;
//            tail = tail.next;
//        }
//    }
//
//    private void reverse() {
////        LinkedNode current = this.head;
////        LinkedNode prev = null;
////        LinkedNode next = null;
////
////        whild (current != null){
////            next = current.next;
////            current.next = prev;
////            prev = current;
////            current = next;
////        }
////
////        // Optional
////        this.tail = this.head;
////        this.head = prev;
//
//        LinkedNode head = this.head;
//        this.head = reverseRecursive(head);
//        this.tail = head;
//    }
//
//    private LinkedNode reverseRecursive(LinkedNode node) {
//        //반복 종료되는거
//        if(node == null || node.next == null){
//            return node;
//        }
//
//        LinkedNode newHead = reverseRecursive(node.next);
//        node.next.next = node;
//        node.next = null;
//        return null;
//    }
//
//    //재귀적인 문제해결 발ㅇ법
//}
