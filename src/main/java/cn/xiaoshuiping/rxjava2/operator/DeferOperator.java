package cn.xiaoshuiping.rxjava2.operator;

import cn.xiaoshuiping.rxjava2.Base;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;

import java.util.concurrent.Callable;


/**
 * Created by xujifa on 17-2-19.
 */
public class DeferOperator extends Base {
    @Override
    public void go() {

        Observable<Integer> observable = Observable.defer(new Callable<ObservableSource<Integer>>() {
            @Override
            public ObservableSource<Integer> call() throws Exception {
                return Observable.just(0, 1, 2, 3);
            }
        });


        observable.subscribe(getObserver(0));
        observable.subscribe(getObserver(1));
    }
}
