
package roman.exercise;

import static java.lang.Thread.sleep;

/**
 *
 * @author djmukcep
 */
public class TextAnimation {
    
    public static void main(String[] args)  {
        String text = "Status confirmed";
        System.out.println("тест TextAnimation");
        textAnimation(text);
    }
    
    private static void textAnimation(String text){
        for(int i = 0; i < text.length(); i++){
            System.out.print(text.charAt(i));
            try {
                if(Character.isWhitespace(text.charAt(i))) sleep(300);
                sleep(205);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }  
}
