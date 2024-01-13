package utilities;

import java.util.logging.Logger;

public class LoggingUtils {

    public void logMessage(String message){
        Logger.getAnonymousLogger().info(message);
    }
}
