public class LogLevels {
    
    public static String message(String logLine) {
      String[] split = logLine.split(":");
      return split[1].trim();
    }

    public static String logLevel(String logLine) {
        int index = logLine.indexOf("]");
        String sub = logLine.substring(1, index).toLowerCase();
        return sub;
    }

    public static String reformat(String logLine) {
    
        int index = logLine.indexOf("]");
        String sub = logLine.substring(1, index).toLowerCase();
        
        String[] split = logLine.split(":");
        String message = split[1].trim();
        
        String fim = message + " (" +sub +")";
        
        return fim;
    }
}
