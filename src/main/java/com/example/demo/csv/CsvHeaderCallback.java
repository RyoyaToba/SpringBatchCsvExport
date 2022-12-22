package com.example.demo.csv;

import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.file.FlatFileHeaderCallback;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.Writer;

@Component
@StepScope
public class CsvHeaderCallback implements FlatFileHeaderCallback {
    @Override
    public void writeHeader(Writer writer) throws IOException {
        writer.write("ID,名前,年齢,性別");
    }
}
