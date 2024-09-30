package hw_warOrPeace6.Thread;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyThread implements Runnable {
    private final String text;
    private final String word;

    public MyThread(String text, String word) {
        this.text = text;
        this.word = word;
    }

    @Override
    public void run() {
        String result = "Мы ничего не нашли";
        Pattern p = Pattern.compile(word);
        Matcher matcher = p.matcher(text);
        while (matcher.find()) {
            result = text.substring(matcher.start(), matcher.end());
        }
    }
}