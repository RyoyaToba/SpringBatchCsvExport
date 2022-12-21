package com.example.demo.config;

import lombok.Getter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.io.File;

@Component
@PropertySource("classpath:property/sample.properties")
@Getter
@ToString
@Slf4j
public class SampleProperty {

    @Value("${file.name}")
    private String fileName;

    @Value("${file.output.directory}")
    private String fileOutputDirectory;

    public String outputPath(){
        String outputPath = fileOutputDirectory + File.separator + fileName;
        log.debug("outputPath={}", outputPath);
        return outputPath;
    }
}
