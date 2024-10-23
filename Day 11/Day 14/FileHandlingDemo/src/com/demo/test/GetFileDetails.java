package com.demo.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class GetFileDetails {
	public static void main(String[] args) {
		Path p1 = Paths.get("E:\\IET oct 24\\FileHandlingDemo\\empcsv.txt");
		
        System.out.format("getFileName: %s\n", p1.getFileName());
        System.out.format("getParent: %s%n", p1.getParent());
        System.out.format("getNameCount: %d%n", p1.getNameCount());
        System.out.format("getRoot: %s%n", p1.getRoot());
        System.out.format("isAbsolute: %s%n", p1.isAbsolute());
        System.out.format("toAbsolutePath: %s%n", p1.toAbsolutePath());
       System.out.format("toURI: %s%n", p1.toUri());
      

	}

}
