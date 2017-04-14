package library.streamapi.example2;

import java.util.function.Function;

/**
 * Created by orifjon9 on 3/17/2017.
 */
public class Pair {
    public Function first;
    public Function second;

    public Pair(Function first, Function second) {
        this.first = first;
        this.second = second;
    }
}
