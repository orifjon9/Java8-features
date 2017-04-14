Consider the following lambda expression. Can this expression be correctly typed as a BiFunction?

(x,y) -> {
    List<Double> list = new ArrayList<>();
    list.add(Math.pow(x,y));
    list.add(x * y);
    return list;
};

Demonstrate you are right by doing the following: In the main method of a Java class, assign this
lambda expression to an appropriate BiFunction and call the apply method with arguments (2.0, 3.0), and print the result to console.