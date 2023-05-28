#  New Features in Java 9's Stream API

Java 9 brought several enhancements and new features to the Stream API, which was first introduced in Java 8. 
These new methods provide more flexibility and control for data processing using functional operations. 
We will review the new methods added to the Stream API with Java 9.

## Stream.iterate with a predicate
The `Stream.iterate` method has been extended to include a predicate as a third argument, determining the end of iteration. 
This new overload allows developers to create finite streams based on specific conditions.

## Stream.takeWhile
The `takeWhile` method is a new addition to the Stream API. It takes a predicate as an argument and returns a Stream containing the successive elements that match the predicate. 
When an element that doesn't match the predicate is encountered, the method stops taking any more elements, and the resulting Stream is terminated.

## Stream.dropWhile
`dropWhile` is the counterpart of takeWhile. This method also takes a predicate as an argument, but it skips the successive elements of the Stream that match the predicate. 
Once an element that doesn't match the predicate is encountered, all the remaining elements in the Stream are returned, thus forming the resulting Stream.

## Stream.ofNullable
The `ofNullable` method has been added to facilitate creating a Stream from a single value that might be null. If the value passed to ofNullable is null, an empty Stream is returned. 
This prevents NullPointerException exceptions when creating streams from single values.

## Conclusion:
The new methods added to the Stream API in Java 9 offer developers greater flexibility when working with data using functional operations. 
These enhancements make it easier to create and manipulate streams, enabling more efficient and expressive data processing.