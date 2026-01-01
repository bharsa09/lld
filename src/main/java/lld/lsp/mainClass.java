package lld.lsp;

public class mainClass {

    public static void readAllFiles(Readable readable) {
        readable.read();
    }

    public static void main(String[] args) {
        ReadableFiles readableFile = new ReadableFiles();
        WriteableFiles writeableFile = new WriteableFiles();

        readAllFiles(readableFile);
        readAllFiles(writeableFile);
        writeableFile.write();
    }
}
