package javaTest;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class NioTest {

    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("C:\\Users\\liji\\Desktop\\forson.txt", "rw");
        FileChannel fc = raf.getChannel();
        MappedByteBuffer mbb = fc.map(FileChannel.MapMode.READ_WRITE, 0, raf.length());

        while (mbb.hasRemaining()) {
            System.out.println((char) mbb.get());
        }

        mbb.put(0, (byte)98);
        raf.close();
    }

}
