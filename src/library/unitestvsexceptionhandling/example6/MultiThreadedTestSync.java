package library.unitestvsexceptionhandling.example6;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by orifjon9 on 3/19/2017.
 */
public class MultiThreadedTestSync {

    public static void main(String[] args){
        MultiThreadedTestSync mtt = new MultiThreadedTestSync();

        for(int i = 0; i< 10; i++){
            mtt.multiCalls();
        }

        System.out.print("The result is : ");
        //System.out.println(mtt.queue.getValueNodes());
        System.out.println(mtt.queue.getCountNodes());

        Optional<Integer> op = Stream.of(1,2,3,4,5,6).reduce((x, y)-> x+y);
            System.out.println(op.get());
    }

    public QueueSync queue = new QueueSync();

    public void multiCalls(){
        Runnable r = () ->{
            queue.add(1);
            queue.add(2);

            queue.remove();
        };

        for(int i =0; i< 100; i++){
            new Thread(r).start();
        }

    }
}
