package cn.xiaoshuiping.rxjava2.object;

import cn.xiaoshuiping.rxjava2.Base;
import io.reactivex.Single;

/**
 * Created by xujifa on 17-2-19.
 */
public class SingleDemo extends Base {
    @Override
    public void go() {
        Single.just(0)
                .subscribe(getSingleObserver(0));
    }
}
