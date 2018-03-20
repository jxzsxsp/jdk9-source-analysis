package cn.xiaoshuiping.flow;

import org.junit.Test;

import java.util.Arrays;
import java.util.concurrent.SubmissionPublisher;

public class FlowTest {

    @Test
    public void MySubscriberTest() throws InterruptedException{
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();

        MySubscriber<String> subscriber = new MySubscriber<>();
        publisher.subscribe(subscriber);

        System.out.println("Publishing Items");
        String[] items = {"1","2","3","4","5","6"};
        Arrays.asList(items).stream().forEach(i -> publisher.submit(i));
        publisher.close();
        Thread.sleep(2000);
    }

    @Test
    public void MyFilterProcessor() throws InterruptedException{
        SubmissionPublisher<String> publisher = new SubmissionPublisher<>();
        MyFilterProcessor<String, String> filterProcessor = new MyFilterProcessor<>(s -> s.equals("x"));

        MySubscriber<String> subscriber = new MySubscriber<>();

        publisher.subscribe(filterProcessor);
        filterProcessor.subscribe(subscriber);

        System.out.println("Publishing Items");
        String[] items = {"1","x","3","x","5","x"};
        Arrays.asList(items).stream().forEach(i -> publisher.submit(i));
        publisher.close();
        Thread.sleep(2000);
    }
}
