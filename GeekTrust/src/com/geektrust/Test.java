package com.geektrust;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
public class Test {
   public static void main(String[] args) throws IOException {
      Path relative = Paths.get("abc.txt");
      System.out.println("Relative path: " + relative);
      Path absolute = relative.toAbsolutePath();
      System.out.println("Absolute path: " + absolute);
   }
}