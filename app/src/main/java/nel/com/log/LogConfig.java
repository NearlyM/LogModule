package nel.com.log;

/**
 * Description :
 * CreateTime : 2018/4/28 17:54
 *
 * @author ningerlei@danale.com
 * @version <v1.0>
 */

public class LogConfig {
    public static final int NO_OUTPUT = 1;  //什么都不输出
    public static final int VERBOSE = 2;
    public static final int DEBUG = 3;
    public static final int INFO = 4;
    public static final int WARN = 5;
    public static final int ERROR = 6;

    /*  Log输出级别 */
    protected static int LogLevel = LogConfig.DEBUG;

    /* Log上传和保存级别 */
    protected static int UploadLevel = LogConfig.ERROR;
    protected static int SaveFileLevel = LogConfig.ERROR;
    /**
     * Log 上传和保存的总开关，如果关了，那么无论如何都不会执行上传或保存操作
     **/
    protected static boolean UploadSwitch = true;

    public static int getLogLevel() {
        return LogLevel;
    }

    public static void setLogLevel(int logLevel) {
        LogLevel = logLevel;
    }

    public static int getUploadLevel() {
        return UploadLevel;
    }

    public static void setUploadLevel(int uploadLevel) {
        UploadLevel = uploadLevel;
    }

    public static int getSaveFileLevel() {
        return SaveFileLevel;
    }

    public static void setSaveFileLevel(int saveFileLevel) {
        SaveFileLevel = saveFileLevel;
    }

    public static boolean isUploadSwitch() {
        return UploadSwitch;
    }

    public static void setUploadSwitch(boolean uploadSwitch) {
        UploadSwitch = uploadSwitch;
    }

    public static String getLogLevelName(int flag) {
        if (flag == -1)
            flag = LogLevel;
        switch (flag) {
            case NO_OUTPUT:
                return "NO_OUTPUT";
            case VERBOSE:
                return "VERBOSE";
            case DEBUG:
                return "DEBUG";
            case INFO:
                return "INFO";
            case WARN:
                return "WARN";
            case ERROR:
                return "ERROR";
            default:
                return "NO_OUTPUT";
        }
    }
}
