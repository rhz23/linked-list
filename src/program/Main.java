package program;

import entities.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<String> myLinkedList = new LinkedList<>();

        myLinkedList.add("test-1");
        myLinkedList.add("test-2");
        myLinkedList.add("test-3");
        myLinkedList.add("test-4");

        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        System.out.println(myLinkedList.get(3));

        System.out.println(myLinkedList);

        System.out.println(myLinkedList.remove(3));

        System.out.println(myLinkedList);

        myLinkedList.add("test-5");

        System.out.println(myLinkedList);

        System.out.println(myLinkedList.remove(1));

        System.out.println(myLinkedList);

    }
}
