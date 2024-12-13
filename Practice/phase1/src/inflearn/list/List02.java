//package inflearn.list;
//
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Map;
//
//public class List02 {
//    private LinkedNode head;
//    private LinkedNode tail;
//    public static void main(String[] args) {
////        문제 2. 끝에서 n번째 노드 찾기
////        단일 연결 리스트의 끝에서 n번째 위치한 노드를 찾는 함수를 구현하라.
////        예) findFormLast(1 -> 4 -> 2 -> 3,2), 끝에서 2번째에 위치한 2를 리턴한다.
//        //HashTable = 동기화, HashMap은 비동기
//        //HashMap은 key, value 가있는데
//        //1번 노드에 1, 2번 노드에 2, 3번 노드에 3 이라는 이런걸 만들수있는거죠 그러면 전체 사이즈를 4라는걸 알겠죠
//        // 그럼 뒤에서 2번째꺼를 꺼내면됩니다.
//        // HashTable = 시간 O(n), 공간 O(n)
//        LinkedList list = new LinkedList();
//        list.add(new LinkedNode(1));
//        list.add(new LinkedNode(2));
//        list.add(new LinkedNode(3));
//
//        list.print();
//        LinkedNode node = list.findFromLast(2);
//        System.out.println(node.number);
//    }
//    /**
//     * 단일 연결 리스트의 끝에서 n번째에 위치한 노드를 찾는 함수를 구현하라.
//     */
//
//    private LinkedNode findFromLast(int n){
//        Map<Integer, LinkedNode> nodeMap = new HashMap<>();
//        int index = 0;
//        LinkedNode current = this.head;
//        while (current != null) {
//            nodeMap.put(index++, current);
//            current = current.next;
//        }
//
//        return nodeMap.get(nodeMap.size() - n);
//    }
//}
