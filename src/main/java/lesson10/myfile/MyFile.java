package lesson10.myfile;

import java.lang.ref.Cleaner;

public class MyFile implements AutoCloseable {
    private static final Cleaner CLEANER = Cleaner.create();
    private final int fd;
    private final Cleaner.Cleanable cleanable;

    public MyFile(int fd) {
        this.fd = fd;
        cleanable = CLEANER.register(this, () -> free(fd));
    }

    public void read() {
        System.out.println("Reading from file descriptor: " + fd);
    }

    private static void free(int fd) {
        System.out.println("Freeing file descriptor: " + fd);
    }

    @Override
    public void close() {
        cleanable.clean();
    }

}
