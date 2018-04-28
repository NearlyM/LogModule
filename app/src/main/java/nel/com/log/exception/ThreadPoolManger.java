package nel.com.log.exception;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Description :
 * CreateTime : 2018/4/28 17:06
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 * @Editor : Administrator
 * @ModifyTime : 2018/4/28 17:06
 * @ModifyDescription :
 */

public class ThreadPoolManger {

    private ThreadPoolExecutor mThreadPoolExecutor;
    private ArrayBlockingQueue<Runnable> mWorkQueue;
    private static final int capacity = 10;
    private static final int corePoolSize = 2;
    private static final int maximumPoolSize = 3;
    private static final int keepAliveTime = 5;

    private static volatile ThreadPoolManger mThreadPoolManger;

    private ThreadPoolManger() {
        mWorkQueue = new ArrayBlockingQueue<>(capacity);
        mThreadPoolExecutor = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime, TimeUnit.SECONDS, mWorkQueue);
    }

    public static ThreadPoolManger getThreadPoolManger() {
        if (mThreadPoolManger == null) {
            synchronized (ThreadPoolManger.class) {
                if (mThreadPoolManger == null) {
                    mThreadPoolManger = new ThreadPoolManger();
                }
            }
        }
        return mThreadPoolManger;
    }

    public void put(Runnable runnable) {
        mThreadPoolExecutor.execute(runnable);
    }
}
