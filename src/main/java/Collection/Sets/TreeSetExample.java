package Collection.Sets;

import java.util.*;

/**
 *
 * Implements SOrtedSet, & navigableSet.
 *
 * Sortedset has below methods:
 *
 * first();
 * lstP();
 *
 * headSet(toElement);
 * tailSet(fromElement)
 * subset(fromElement, toElement); from inclusive, to exclusive.
 *
 *
 * Navigable Ser:
 *
 * extends sortedSet.
 * It provides a way to move through the order.
 *
 * lower(e)
 * higher(e)
 * floor(e)
 * ceiling(e)
 * pollFirst()
 * pollLast()
 */
public class TreeSetExample {

    public static void main(String[] args) {
        NavigableSet<String> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(new String[]{"hello","hi","abc are you?","joey", "rachel"}));

        System.out.println(treeSet);

        System.out.println(treeSet.headSet("hi"));
        System.out.println(treeSet.tailSet("hello"));
        System.out.println(treeSet.subSet("hi","joey"));

        // the element which has lower value than the element passed
        System.out.println(treeSet.lower("hi"));
        // the elemnet which has higher value than the element passed.
        System.out.println(treeSet.higher("hi"));

        // find the greatest element, less than on equal to given element
        System.out.println(treeSet.floor("hie"));

        // find the least element, greater than or equal to given element.
        System.out.println(treeSet.ceiling("hie"));

        System.out.println(treeSet);
        // retrieves and removes the first element
        System.out.println(treeSet.pollFirst());
        System.out.println(treeSet);

        // retreives and removes teh last element
        System.out.println(treeSet.pollLast());
        System.out.println(treeSet);
    }


}
