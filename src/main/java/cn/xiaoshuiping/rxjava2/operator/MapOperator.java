package cn.xiaoshuiping.rxjava2.operator;

import cn.xiaoshuiping.rxjava2.Base;
import io.reactivex.Observable;

/**
 * Created by xujifa on 17-2-19.
 */
public class MapOperator extends Base {
    @Override
    public void go() {
        Observable.just(0, 1, 2, 3)
                .map(i -> "string" + i)
                .subscribe(getStringObserver(0));
    }
}
