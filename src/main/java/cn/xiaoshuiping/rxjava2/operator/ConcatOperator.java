package cn.xiaoshuiping.rxjava2.operator;

import cn.xiaoshuiping.rxjava2.Base;
import io.reactivex.Observable;

/**
 * Created by xujifa on 2017/2/19.
 */
public class ConcatOperator extends Base {
    @Override
    public void go() {

        Observable.concat(Observable.just(1, 2, 3), Observable.just(5, 6, 7))
                .subscribe(getObserver(0));
    }
}
