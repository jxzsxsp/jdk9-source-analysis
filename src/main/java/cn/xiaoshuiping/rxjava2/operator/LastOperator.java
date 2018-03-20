package cn.xiaoshuiping.rxjava2.operator;

import cn.xiaoshuiping.rxjava2.Base;
import io.reactivex.Emitter;
import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;

/**
 * Created by xujifa on 17-2-19.
 */
public class LastOperator extends Base {
    @Override
    public void go() {
        Observable.just(0, 1, 2).last(3).subscribe(getSingleObserver(0));
        Observable.create((ObservableOnSubscribe<Integer>) Emitter::onComplete).last(3)
                .subscribe(getSingleObserver(0));
        Observable.create((ObservableOnSubscribe<Integer>) Emitter::onComplete).lastOrError()
                .subscribe(getSingleObserver(0));
    }
}
