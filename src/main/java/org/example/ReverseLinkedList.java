package org.example;

import java.util.Iterator;
import java.util.LinkedList;

public class ReverseLinkedList {

public static void reverseLinkedList(LinkedList<String> list)
{
    Iterator<String> iterator = list.descendingIterator();
    while(iterator.hasNext())
    {
        System.out.println(iterator.next());

    }
}

public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
    list.add("Hello");
    list.add("World");
    list.add("!");

    System.out.println("\nReversed LinkedList:");
    reverseLinkedList(list);
}
}
