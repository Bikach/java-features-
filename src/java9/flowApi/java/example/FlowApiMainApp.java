package example;

public class FlowApiMainApp {
    public static void main(String[] args) throws InterruptedException {
        // Create a publisher and a subscriber
        var publisher = new MessagePublisher();
        var subscriber = new MessageSubscriber();

        // The subscriber subscribes to the publisher
        publisher.subscribe(subscriber);

        // Publish messages
        publisher.submit("Hello !");
        publisher.submit("How are you ?");
        publisher.submit("Good bye !");

        // Wait before closing the publisher
        Thread.sleep(1000);
        publisher.close();

    }
}
