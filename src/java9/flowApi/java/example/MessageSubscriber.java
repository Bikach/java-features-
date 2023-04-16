package example;

import java.util.concurrent.Flow;

public class MessageSubscriber implements Flow.Subscriber<String> {
    private Flow.Subscription subscription;
    @Override
    public void onSubscribe(Flow.Subscription subscription) {
        this.subscription = subscription;
        // Request the first message
        subscription.request(1);
    }

    @Override
    public void onNext(String message) {
        System.out.println("Message received : " + message);
        // Request the next message
        subscription.request(1);
    }

    @Override
    public void onError(Throwable throwable) {
        System.err.println("Error : " + throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("All messages have been received.");
    }
}
