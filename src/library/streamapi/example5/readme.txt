Implement a method
public Set<String> union(List<Set<String>> sets)

by creating a stream pipeline that transforms a list of sets (of type String) into the union of those sets. Make use of the reduce method for streams.

Example: The union method should transform the list [{“A”, “B”}, {“D”}, {“1”, “3”, “5”}] to the set
{“A”, “B”, “D”, “1”, “3”, “5”}