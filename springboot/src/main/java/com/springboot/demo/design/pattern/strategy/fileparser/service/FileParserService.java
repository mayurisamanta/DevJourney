package com.springboot.demo.design.pattern.strategy.fileparser.service;

import com.springboot.demo.design.pattern.strategy.fileparser.parser.FileParser;
import com.springboot.demo.design.pattern.strategy.fileparser.factory.FileParserFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
@RequiredArgsConstructor
public class FileParserService {

    private final FileParserFactory fileParserFactory;

    public String parse(File file, String fileType) {
        FileParser fileParser = fileParserFactory.get(fileType);
        return fileParser.parse(file);
    }
}
