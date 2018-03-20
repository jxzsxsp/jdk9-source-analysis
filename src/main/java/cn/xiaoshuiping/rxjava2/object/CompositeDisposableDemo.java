package cn.xiaoshuiping.rxjava2.object;

import cn.xiaoshuiping.rxjava2.Base;
import io.reactivex.Observable;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by xujifa on 17-2-19.
 */
public class CompositeDisposableDemo extends Base {
    @Override
    public void go() {
        CompositeDisposable compositeDisposable = new CompositeDisposable();

        compositeDisposable.addAll(Observable.just(0, 1, 2, 3)
                        .subscribeOn(Schedulers.io())
                        .observeOn(Schedulers.computation())
                        .subscribeWith(getDisposableObserver(0)),

                Observable.just(6, 7, 8, 9)
                        .subscribeOn(Schedulers.io())
                        .observeOn(Schedulers.computation())
                        .subscribeWith(getDisposableObserver(1)));

        try {
            Thread.sleep(8000);
            compositeDisposable.dispose();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
