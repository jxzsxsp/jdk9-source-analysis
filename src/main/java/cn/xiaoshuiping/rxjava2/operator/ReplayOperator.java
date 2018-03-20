package cn.xiaoshuiping.rxjava2.operator;

import cn.xiaoshuiping.rxjava2.Base;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

/**
 * Created by xujifa on 17-2-19.
 */
public class ReplayOperator extends Base {
    @Override
    public void go() {
        PublishSubject<Integer> publishSubject = PublishSubject.create();
        Observable<Integer> observable = publishSubject.replay().autoConnect();

        observable.subscribe(getObserver(0));
        publishSubject.onNext(0);
        observable.subscribe(getObserver(1));
        publishSubject.onNext(1);
        publishSubject.onComplete();
    }
}
