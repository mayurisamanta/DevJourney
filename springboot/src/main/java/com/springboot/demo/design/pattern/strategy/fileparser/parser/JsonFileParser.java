package com.springboot.demo.design.pattern.strategy.fileparser.parser;

import com.springboot.demo.design.pattern.strategy.fileparser.constant.FileType;
import org.springframework.stereotype.Service;

import java.io.File;

@Service(FileType.JSON)
public class JsonFileParser implements FileParser {

    @Override
    public void parse(File file) {
        System.out.println("Parsing JSON file");
    }
}
