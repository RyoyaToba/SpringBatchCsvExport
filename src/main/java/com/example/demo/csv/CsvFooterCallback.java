package com.example.demo.csv;

import org.springframework.batch.core.StepExecution;
import org.springframework.batch.item.file.FlatFileFooterCallback;
import org.springframework.batch.item.file.FlatFileHeaderCallback;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;
import java.io.Writer;

public class CsvFooterCallback implements FlatFileFooterCallback {

    @Value("#{StepExecution}")
    private StepExecution stepExecution;

    @Override
    public void writeFooter(Writer writer) throws IOException {
        writer.write("合計=" + stepExecution.getWriteCount() + "件");
    }
}
