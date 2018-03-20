package cn.xiaoshuiping.rxjava2.operator;

import cn.xiaoshuiping.rxjava2.Base;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

import java.util.concurrent.TimeUnit;

/**
 * Created by xujifa on 17-2-19.
 */
public class WindowOperator extends Base {
    @Override
    public void go() {
        Observable.interval(1, TimeUnit.SECONDS)
                .take(6)
                .window(3, TimeUnit.SECONDS)
                .subscribe(new Consumer<Observable<Long>>() {
                    int n = 0 ;
                    @Override
                    public void accept(Observable<Long> longObservable) throws Exception {
                        longObservable.subscribe(getLongObserver(n++));
                    }
                });
    }
}
