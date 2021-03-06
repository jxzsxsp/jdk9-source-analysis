package cn.xiaoshuiping.flow;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
import java.util.function.Function;

public class MyFilterProcessor<T, K extends T> extends SubmissionPublisher<K> implements Flow.Processor<T, K> {

    private Function<? super T, Boolean> function;
    private Flow.Subscription subscription;

    public MyFilterProcessor(Function<? super T, Boolean> function){
        super();
        this.function = function;
    }

    @Override
    public void onSubscribe(Flow.Subscription subscription){
        this.subscription = subscription;
        subscription.request(1);
    }

    @Override
    public void onNext(T item){
        if(!(boolean) function.apply(item)){
            submit((K) item);
        }
        subscription.request(1);
    }

    @Override
    public void onError(Throwable t){
        t.printStackTrace();
    }

    @Override
    public void onComplete(){
        close();
    }
}
