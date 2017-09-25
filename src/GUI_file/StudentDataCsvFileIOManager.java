/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author student
 */
public class StudentDataCsvFileIOManager implements StudentDataOperationInterface {
    
    private File fcsv;

    public StudentDataCsvFileIOManager(File _fcsv) {
        fcsv = _fcsv;
    }
    
    @Override
    public boolean insert(Student st) {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            BufferedWriter bw = new BufferedWriter(new FileWriter(fcsv,true));
            bw.write(st.toString());
            return true;
        } catch (IOException ex) {
            Logger.getLogger(StudentDataCsvFileIOManager.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    @Override
    public boolean remove(int gr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(int gr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(int gr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student display(int gr) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Student[] displayAll() throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(fcsv)))
        {
            
        }
        return null;
    }
    
}
