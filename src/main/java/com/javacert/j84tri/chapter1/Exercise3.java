package com.javacert.j84tri.chapter1;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    
    private interface ListFiles {
        public abstract List<String> list(String basePath, String extension) throws Exception;
    }
    
    
    public static void main(String... args){
        ListFiles lister = (basePath, extension) -> {
            File baseDirectory = new File(basePath);
            if (baseDirectory.isDirectory()){
                FileFilter filter = (fileName) -> {
                    return fileName.getAbsolutePath().startsWith(basePath) && fileName.getName().endsWith("."+extension);
                };
                List<String> matches = new ArrayList<String>();
                for(File f : baseDirectory.listFiles(filter))
                    matches.add(f.getAbsolutePath());
                return matches;
            } else {
                throw new Exception("base path is not a directory");
            }
        };
        
        
        try {
            List<String> files = lister.list("/home/mauriciorodriguez/", "tar.gz");
            for (String s : files){
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
