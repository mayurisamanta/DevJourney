package com.springboot.demo.design.pattern.strategy.fileparser.parser;

import java.io.File;

public interface FileParser {
    String parse(File file);
}
