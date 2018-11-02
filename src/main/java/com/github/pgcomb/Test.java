package com.github.pgcomb;

import com.github.pgcomb.file.FileTask;
import com.github.pgcomb.pool.TaskExecutor;

/**
 * Created by lizhen on 2018/8/24.
 */
public class Test {
    public static void main(String[] args) {
        TaskExecutor filetask = new TaskExecutor("filetask", 10, Integer.MAX_VALUE);
        FileTask.fileTask(filetask,"D:\\test1.txt","D:/testt.txt",a-> a+"---"+true,a->a);
        filetask.stop();
    }
}
