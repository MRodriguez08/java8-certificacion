package com.javacert.j84tri.chapter1;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    
    private interface ListSubDirs {
        public abstract List<String> list(String basePath) throws Exception;
    }
    
    
    public static void main(String... args){
        ListSubDirs lister = (basePath) -> {
            File baseDirectory = new File(basePath);
            if (baseDirectory.isDirectory()){
                FileFilter filter = (fileName) -> {
                    return fileName.getAbsolutePath().startsWith(basePath);
                };
                List<String> matches = new ArrayList<String>();
                for(File f : baseDirectory.listFiles(filter)){
                    if (f.isDirectory())
                        matches.add(f.getAbsolutePath());
                }
                return matches;
            } else {
                throw new Exception("base path is not a directory");
            }
        };
        
        try {
            String directory = "/home/mauriciorodriguez/";
            List<String> subdirs = lister.list(directory);
            for (String s : subdirs){
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
