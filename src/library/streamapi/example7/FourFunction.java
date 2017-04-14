package library.streamapi.example7;

/**
 * Created by orifjon9 on 3/18/2017.
 */
@FunctionalInterface
public interface FourFunction <S,T,U,K,R> {
        R apply(S s, T t, U u, K k);

}
