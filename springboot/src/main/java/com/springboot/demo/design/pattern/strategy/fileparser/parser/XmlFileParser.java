package com.springboot.demo.design.pattern.strategy.fileparser.parser;

import com.springboot.demo.design.pattern.strategy.fileparser.constant.FileType;
import lombok.ToString;
import org.springframework.stereotype.Service;

import java.io.File;

@Service(FileType.XML)
@ToString
public class XmlFileParser implements FileParser {

    @Override
    public String parse(File file) {
        return "Parsing XML file";
    }
}
