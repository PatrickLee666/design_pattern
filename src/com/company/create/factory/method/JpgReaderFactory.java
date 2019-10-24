package com.company.create.factory.method;

public class JpgReaderFactory implements ReaderFactory {
    @Override
    public Reader getReader() {
        return new JpgReader();
    }
}
