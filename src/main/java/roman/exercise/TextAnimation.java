
package roman.exercise;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/**
 *
 * @author djmukcep
 */
public class TextAnimation {

    private final static  ScheduledExecutorService scheduler
            = Executors.newScheduledThreadPool(1);

    public static void main(String[] args)  {
        String text = "Status confirmed";
        textAnimation(text);
    }
    
    private static void textAnimation(String text) {
        long totalDelay = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            final int index = i;
            long delay = 210; // базовая задержка

            if (Character.isWhitespace(ch)) {
                delay += 300;
            }
            totalDelay += delay;
            scheduler.schedule(() -> {
                System.out.print(ch);
                if (index == text.length() - 1){
                    scheduler.shutdown();
                }
            },totalDelay, TimeUnit.MILLISECONDS);
        }
    }  
}
