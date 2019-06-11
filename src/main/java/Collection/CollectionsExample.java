package Collection;

/**
 * ArraysExamples are a low level construct. They dont provide too many features.
 *
 * Adding a new element would require Array resizing.
 *
 * Dont have ability to force any conditions such as do  not allows duplicates or no null values
 * these extra checks need to be done manually.
 *
 * And that's when collections come in to solve all these problems.
 *
 *  java.util.Collection is a root level interface of JAVA collections framework.
 *
 *  List is a sub interface which extends Collection interface. ( ArrayList, LinkedList)
 *
 *  Set, SortedSet are sub interfaces which extend Collection interface. ( HashSet, TreeSet)
 *
 *  Queue, Deque are sub interfaces which extend collection interface. ( PriorityQueue, LinkedListArrayDeque )
 *
 * Map, SortedMap are interfaces to define collection of pairs.
 * It's a Collection although it doesnt extedn Collection interface. ( HashMap, TreeMap)
 *
 * Collection interface itself extends Iterable interface. Hence all collections are iterable except Map.
 * Although Map has a set of Keys and Values which are iterable.
 *
 *
 * Common behavour of Colletion:
 *
 * size() -> get the number of elements in collection
 * isEmplty() -> true if size if 0 otherwise false
 * add(Element ) -> adds an element into the collection
 * addAll(Collection) -> adds all the elements of the arguments into the collection
 * remove(Element ) -> remove the element
 * removeAll(Collection) -> remove all the lements of the arguments
 * retainAll(Collection) -> removes all the elements of the collection not in argument collection
 * contains(Element) -> returns true if collection contains the element.
 * containsAll(Collection) -> true if all the elements of the argument collectionis in this collection
 * clear() -> removes all the elemtns of the collection
 *
 *
 */
public class CollectionsExample {


}
