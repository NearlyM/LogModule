package nel.com.log;

import android.util.Log;

/**
 * Description :
 * CreateTime : 2018/4/28 16:47
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

public class LogUtil {

    private static boolean isDebug = true;

    public static void setDebug(boolean debug) {
        isDebug = debug;
    }

    public static void d(String tag, String msg) {
        if (isDebug) Log.d(tag, msg);
    }

    public static void e(String tag, String msg) {
        if (isDebug) Log.e(tag, msg);
    }

    public static void e(String tag, String msg, Throwable throwable) {
        if (isDebug) Log.e(tag, msg, throwable);
    }

    public static void i(String tag, String msg) {
        if (isDebug) Log.i(tag, msg);
    }

    public static void v(String tag, String msg) {
        if (isDebug) Log.v(tag, msg);
    }

    public static void w(String tag, String msg) {
        if (isDebug) Log.w(tag, msg);
    }

    public static void w(String tag, String msg, Throwable throwable) {
        if (isDebug) Log.w(tag, msg, throwable);
    }


    public static void wtf(String tag, String msg) {
        if (isDebug) Log.wtf(tag, msg);
    }
}
