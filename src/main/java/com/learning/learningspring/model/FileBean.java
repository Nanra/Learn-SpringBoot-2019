package com.learning.learningspring.model;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Scanner;

@Component
public class FileBean implements ResourceLoaderAware {

    private ResourceLoader lodaer;

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.lodaer = resourceLoader;
    }

    public void printInfo() throws IOException {
      Resource resource = lodaer.getResource("classpath:/resource/info.txt");
        Scanner scanner = new Scanner(resource.getInputStream());

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(line);
        }
        scanner.close();

    }

}
