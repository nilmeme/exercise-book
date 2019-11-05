package me.nilme.exercise.io;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.Selector;

/**
 * @author weizhuang
 * Created on 2019/9/29.
 */
public class SelectorTest {

    public static void main(String[] args) throws IOException {
        Selector selector = Selector.open();
        RandomAccessFile aFile = new RandomAccessFile("/Users/weizhuang/workspace/github/exercise-book/exercise-io/src/test/java/me/nilme/exercise/io/ExerciseIoApplicationTests.java",
                "rw");


    }

}
