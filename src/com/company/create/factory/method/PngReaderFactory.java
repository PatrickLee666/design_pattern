package com.company.create.factory.method;

public class PngReaderFactory implements ReaderFactory {
    @Override
    public Reader getReader() {
        return new PngReader();
    }
}
