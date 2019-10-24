package com.company.create.factory.method;

public class GifReaderFactory implements ReaderFactory {
    @Override
    public Reader getReader() {
        return new GifReader();
    }
}
