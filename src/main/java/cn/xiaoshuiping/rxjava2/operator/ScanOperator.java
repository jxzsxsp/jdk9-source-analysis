package cn.xiaoshuiping.rxjava2.operator;

import cn.xiaoshuiping.rxjava2.Base;
import io.reactivex.Observable;

/**
 * Created by xujifa on 17-2-19.
 */
public class ScanOperator extends Base {
    @Override
    public void go() {
        Observable.just(0, 1, 2, 3)
                .scan((i1, i2) -> i1 + i2)
                .subscribe(getObserver(0));
    }
}
