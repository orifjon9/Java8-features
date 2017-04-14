package library.functionalprogramming.example4;

import java.util.List;


/**
 * Created by orifjon9 on 3/15/2017.
 */
public class Best {

    Best(){}

    public static void main(String[] args){

        Best good = new Best();
        System.out.println("count of result: " + good.countWords(Storage.Words, 'a','0', 4));

    }


    public int countWords(List<String> words, char containChar, char doesNotContainChar, int len) {

        return (int) words.stream()
                .filter(name-> name.length() == len)
                .filter(name -> name.toLowerCase().indexOf(containChar) > -1)
                .filter(name -> name.indexOf(doesNotContainChar) == -1)
                .count();
    }
}
