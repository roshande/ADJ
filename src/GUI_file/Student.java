/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI_file;

/**
 *
 * @author student
 */
public class Student {
    private int grno;
    private char div;
    private String name;
    private float marks;

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }
    
    public void setGrno(int grno) {
        this.grno = grno;
    }

    public void setDiv(char div) {
        this.div = div;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Student(int _grno,String _name,char _div,int _marks)
    {
        grno=_grno;
        name=_name;
        div=_div;
        marks=_marks;
    }
    
    public int getGrno(){return this.grno;}
    public char getDiv(){return this.div;}
    public String getName(){return this.name;}
    
    @Override
    public String toString(){
        return (name+","+grno+","+div+","+marks);
    }
}