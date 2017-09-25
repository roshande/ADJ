/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

/**
 *
 * @author student
 */
public class FileIO {
    public static void main(String[] args) throws IOException
    {
        File f = new File("a.txt");
        if(!f.exists())
        {
            f.createNewFile();
        }
        System.out.println("" +  f.exists());
        
        File f1 = new File("Folder");
        f1.mkdir();
        System.out.println(""+f1.exists());
        
        File f2 = new File(f1,"b.txt");
        f2.createNewFile();
        System.out.println(""+f2.exists());
        
        String s[] = f1.list();
        System.out.println("\n Files/Folders in dir "+f1.getName());
        for(String sobj:s)
        {
            System.out.println(""+sobj);
        }
        //char 16bits
        /*
            FIS 8 bit
            FOS 8 bit
            
        every write call of filewriter is sys call(char by char)
        
        but using bufferedReader/Writer buffers the input/output
        */
        FileWriter fw = new FileWriter(f,true);
        try (BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("N,");
            bw.newLine();
            bw.write("Bye");
        }
        
        FileReader fr = new FileReader(f);
        
        try (BufferedReader br = new BufferedReader(fr)) {
            String line;
            while((line = br.readLine()) != null )
            {
                System.out.println(line);
            }
        }
    }
}
