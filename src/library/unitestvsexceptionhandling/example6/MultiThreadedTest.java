package library.unitestvsexceptionhandling.example6;

/**
 * Created by orifjon9 on 3/19/2017.
 */
public class MultiThreadedTest {

    public static void main(String[] args){
        MultiThreadedTest mtt = new MultiThreadedTest();

        for(int i = 0; i< 10; i++){
            mtt.multiCalls();
        }

        System.out.print("The result is : ");
        //System.out.println(mtt.queue.getValueNodes());
        System.out.println(mtt.queue.getCountNodes());

    }

    public Queue queue = new Queue();

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
