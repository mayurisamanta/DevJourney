package com.springboot.demo.design.pattern.strategy.fileparser.controller;

import com.springboot.demo.design.pattern.strategy.fileparser.service.FileParserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;

@RestController
@RequiredArgsConstructor
public class FileParserController {

    private final FileParserService fileParserService;

    @GetMapping("/parse")
    public String parse(@RequestParam String fileType) {
        File file = new File("file.txt");
        return fileParserService.parse(file, fileType);
    }
}
