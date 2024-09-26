package hw_warOrPeace6.Thread;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorSearcher {
    private final ExecutorService executor;

    public ExecutorSearcher() {
        this.executor = Executors.newCachedThreadPool();
    }

    public void executeSearch(File[] files, String word) {
        for (int i = 0; i < files.length; i++) {
            MyThread task = new MyThread(files[i].toString(), word);
            executor.execute(task);
        }
        executor.shutdown();
    }


}
