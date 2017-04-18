package library.unitestvsexceptionhandling.example1;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by orifjon9 on 3/18/2017.
 */
public class TDDPractice {
    //private static TDDPractice instance;

    public TDDPractice(){}

    /*public static TDDPractice getInstance() {
        return instance;
    }*/

    private  Function<List<String>, Stream<String>> changeLastCharToUpper = (list) ->
            list.stream()
                    .map(word->word.substring(0,(word.length() - 1)) + word.substring((word.length() - 1)).toUpperCase());
                    //.map(word->word.toUpperCase());

    public List<String> changeLastCharToUpper(List<String> list){
        return changeLastCharToUpper.apply(list).collect(Collectors.toList());
    }
}
