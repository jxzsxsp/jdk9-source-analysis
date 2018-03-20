package cn.xiaoshuiping.rxjava2.object;

import cn.xiaoshuiping.rxjava2.Base;
import io.reactivex.Flowable;

/**
 * Created by xujifa on 17-2-19.
 */
public class FlowableDemo extends Base {
    @Override
    public void go() {

        Flowable.just(1,2,3).subscribe(getSubscriber(0));
    }
}
