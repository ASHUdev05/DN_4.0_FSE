public class Logger {
    private static Logger logger;

    private Logger() {
    }

    public static Logger getLogger() {
        return logger;
    }
}
