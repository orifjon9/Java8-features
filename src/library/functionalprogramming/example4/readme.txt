Implement a method with the following signature and return type:

public int countWords(List<String> words, char c, char d, int len)

which counts the number of words in the input list words that have length equal to len, that contain the character c, and that do not contain the character d. Create a Good and Better solution, as described in the slides (see lesson8.lecture.filter) – a Good solution creates a lambda expression each time values are passed into countWords, whereas a Better solution has parametrized lambda expressions pre-made, and so a call to countWords simply substitutes values into these expressions.
Try also creating a Best solution in which there is just one lambda expression.