package library.functionalprogramming.example4;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;


/**
 * Created by orifjon9 on 3/15/2017.
 */
public class Better {

    Function<Integer, Predicate<String>> filterLen = (len) -> {
        return (name) -> {
            return name.length() == len;
        };
    };

    Function<Character, Predicate<String>> filterContainChar = (containChar) -> {
        return (name) -> {
            return name.toLowerCase().indexOf(containChar) > -1;
        };
    };

    Function<Character, Predicate<String>> filterNotContainChar = doesNotContainChar -> {
        return name->{
            return name.indexOf(doesNotContainChar) == -1;
        };
    };

    Better(){}

    public static void main(String[] args){

        Better good = new Better();
        System.out.println("count of result: " + good.countWords(Storage.Words, 'a','n', 4));
        
    }


    public int countWords(List<String> words, char containChar, char doesNotContainChar, int len) {


        return (int) words.stream()
                .filter(this.filterLen.apply(len))
                .filter(this.filterContainChar.apply(containChar))
                .filter(this.filterNotContainChar.apply(doesNotContainChar))
                .count();
    }
}
