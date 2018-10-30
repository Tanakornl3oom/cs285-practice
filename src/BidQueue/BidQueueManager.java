package BidQueue;

public class BidQueueManager {

    public BidQueueManager() {
    }

    private static BidQueueManager instance;

    public static BidQueueManager getInstance() {
        if(instance == null){
            instance = new BidQueueManager();
        }
        return instance;
    }


}
