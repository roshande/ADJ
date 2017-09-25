/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_file;

import java.io.IOException;

/**
 *
 * @author student
 */
public interface StudentDataOperationInterface {
    boolean insert(Student st);
    boolean remove(int gr);
    boolean update(int gr);
    boolean delete(int gr);
    Student display(int gr);
    Student[] displayAll() throws IOException;
}
