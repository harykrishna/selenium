package utilities;

import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {

    public int getRandomNumber(int range){
        return ThreadLocalRandom.current().nextInt(range);
    }
}
