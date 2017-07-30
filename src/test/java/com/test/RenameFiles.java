package com.test;

import java.io.File;

public class RenameFiles {
    public static void main(String[] args) {
        File f = new File("/Users/ik/git/memebox");
        File[] files = f.listFiles();

        for(File file : files){
            if(file.getName().contains("-master-")){
                System.out.println(file.getName().substring(0, file.getName().indexOf("-master-")));
//                file.renameTo(new File(file.getName().substring(0, file.getName().indexOf("-master-"))));
            }
        }
    }
}
