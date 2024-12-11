public class UML {
    public static void main(String[] args) {

        System.out.println("┌─────────────────────────────────────────────────────────┐");
        System.out.println("│                      ArrayList<E>                       │");
        System.out.println("├─────────────────────────────────────────────────────────┤");
        System.out.println("│ - elementData: Object[]                                 │");
        System.out.println("│ - size: int                                             │");
        System.out.println("├─────────────────────────────────────────────────────────┤");
        System.out.println("│ + ArrayList()                                           │");
        System.out.println("│ + ArrayList(capacity: int)                              │");
        System.out.println("│ + add(e: E): boolean                                    │");
        System.out.println("│ + add(index: int, element: E): void                     │");
        System.out.println("│ + addAll(c: Collection<? extends E>): boolean           │");
        System.out.println("│ + addAll(index: int, c: Collection<? extends E>):boolean│");
        System.out.println("│ + clear(): void                                         │");
        System.out.println("│ + clone(): Object                                       │");
        System.out.println("│ + contains(o: Object): boolean                          │");
        System.out.println("│ + ensureCapacity(minCapacity: int): void                │");
        System.out.println("│ + get(index: int): E                                    │");
        System.out.println("│ + indexOf(o: Object): int                               │");
        System.out.println("│ + isEmpty(): boolean                                    │");
        System.out.println("│ + iterator(): Iterator<E>                               │");
        System.out.println("│ + lastIndexOf(o: Object): int                           │");
        System.out.println("│ + listIterator(): ListIterator<E>                       │");
        System.out.println("│ + listIterator(index: int): ListIterator<E>             │");
        System.out.println("│ + remove(index: int): E                                 │");
        System.out.println("│ + remove(o: Object): boolean                            │");
        System.out.println("│ + removeAll(c: Collection<?>): boolean                  │");
        System.out.println("│ + retainAll(c: Collection<?>): boolean                  │");
        System.out.println("│ + set(index: int, element: E): E                        │");
        System.out.println("│ + size(): int                                           │");
        System.out.println("│ + subList(fromIndex: int, toIndex: int): List<E>        │");
        System.out.println("│ + toArray(): Object[]                                   │");
        System.out.println("│ + toArray(a: T[]): T[]                                  │");
        System.out.println("│ + trimToSize(): void                                    │");
        System.out.println("└─────────────────────────────────────────────────────────┘");

        System.out.println("                          ▲");
        System.out.println("                          │");
        System.out.println("                       extends");
        System.out.println("                          │");

        System.out.println("┌───────────────────────────────────────────┐");
        System.out.println("│               GenericStack<E>             │");
        System.out.println("├───────────────────────────────────────────┤");
        System.out.println("│                                           │");
        System.out.println("│                                           │");
        System.out.println("├───────────────────────────────────────────┤");

        System.out.println("│ + GenericStack()                          │");
        System.out.println("│ + push(o: E): void                        │");
        System.out.println("│ + pop(): E                                │");
        System.out.println("│ + peek(): E                               │");
        System.out.println("│ + getSize(): int                          │");
        System.out.println("│ + isEmpty(): boolean                      │");
        System.out.println("│ + toString(): String                      │");
        System.out.println("└───────────────────────────────────────────┘");
    }
}


