one of the examples of a method reference of type object::instanceMethod was
this::equals. Since every lambda expression must be converted to a functional interface,
find a functional interface in the java.util.function package that would be used for this
lambda expression.

Hint: The implicit reference `this’ refers to the currently active object. So, to answer this
question, create a class MyClass in which you have referenced this::equals with an appropriate
type; add a method myMethod(MyClass cl) which uses this method expression to return true if
cl is equal to ‘this’.