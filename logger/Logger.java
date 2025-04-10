package logger;

public class  Logger {
  private static Logger instance;
  private LogLevel logLevel;
  private Logger(LogLevel logLevel){
    this.logLevel = LogLevel.DEBUG;
  }

  public static Logger getInstance() {
    if(instance == null)
      instance = new Logger(LogLevel.DEBUG);
    return instance;
  }

  public void setLevel(LogLevel logLevel) {
    instance.logLevel = logLevel;
  }

  public void log(String logs, LogLevel logLevel){
    if(instance.logLevel.ordinal() <= logLevel.ordinal())
      System.out.println("[" + System.currentTimeMillis() + "]" + "[" + logLevel + "]" + " " + logs);
  }

  public void debug(String logs) {
    log(logs, LogLevel.DEBUG);
  }

  public void info(String logs) {
    log(logs, LogLevel.INFO);
  }

  public void warning(String logs) {
    log(logs, LogLevel.WARNING);
  }

  public void error(String logs) {
    log(logs, LogLevel.ERROR);
  }

  public void fatal(String logs) {
    log(logs, LogLevel.FATAL);
  }
}
