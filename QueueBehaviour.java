public interface QueueBehaviour {
    void update();

    void takeInQueue(Actor actor);
    void takeOrders();

    void giveOrders();

    void releaseFromQueue();
}
