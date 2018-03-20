package cn.xiaoshuiping.rxjava2;

import cn.xiaoshuiping.rxjava2.object.*;
import cn.xiaoshuiping.rxjava2.operator.*;
import org.junit.Test;

public class RxJavaTest {

    @Test
    public void asyncSubjectDemoTest(){
        new AsyncSubjectDemo().go();
    }

    @Test
    public void behaviorSubjectDemoTest(){
        new BehaviorSubjectDemo().go();
    }

    @Test
    public void completableDemoTest(){
        new CompletableDemo().go();
    }

    @Test
    public void compositeDisposableDemoTest(){
        new CompositeDisposableDemo().go();
    }

    @Test
    public void flowableDemoTest(){
        new FlowableDemo().go();
    }

    @Test
    public void intervalOperatorTest(){
        new IntervalOperator().go();
    }

    @Test
    public void publishSubjectDemoTest(){
        new PublishSubjectDemo().go();
    }

    @Test
    public void replaySubjectDemoTest(){
        new ReplaySubjectDemo().go();
    }

    @Test
    public void singleDemoTest(){
        new SingleDemo().go();
    }

    @Test
    public void bufferOperatorTest(){
        new BufferOperator().go();
    }

    @Test
    public void concatOperatorTest(){
        new ConcatOperator().go();
    }

    @Test
    public void debounceOperatorTest(){
        new DebounceOperator().go();
    }

    @Test
    public void deferOperatorTest(){
        new DeferOperator().go();
    }

    @Test
    public void distinctOperatorTest(){
        new DistinctOperator().go();
    }

    @Test
    public void filterOperatorTest(){
        new FilterOperator().go();
    }

    @Test
    public void lastOperatorTest(){
        new LastOperator().go();
    }

    @Test
    public void mapOperatorTest(){
        new MapOperator().go();
    }

    @Test
    public void mergeOperatorTest(){
        new MergeOperator().go();
    }

    @Test
    public void reduceOperatorTest(){
        new ReduceOperator().go();
    }

    @Test
    public void replayOperatorTest(){
        new ReplayOperator().go();
    }

    @Test
    public void scanOperatorTest(){
        new ScanOperator().go();
    }

    @Test
    public void skipOperatorTest(){
        new SkipOperator().go();
    }

    @Test
    public void takeOperatorTest(){
        new TakeOperator().go();
    }

    @Test
    public void throttleFirstOperatorTest(){
        new ThrottleFirstOperator().go();
    }

    @Test
    public void throttleLastOperatorTest(){
        new ThrottleLastOperator().go();
    }

    @Test
    public void timerOperatorTest(){
        new TimerOperator().go();
    }

    @Test
    public void windowOperatorTest(){
        new WindowOperator().go();
    }

    @Test
    public void zipOperatorTest(){
        new ZipOperator().go();
    }
}
