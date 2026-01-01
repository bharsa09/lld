package lld.lsp;

public class WriteableFiles extends ReadableFiles implements Writeable{
    @Override
    public void write() {
        System.out.println("Writing data to file");
    }
}
