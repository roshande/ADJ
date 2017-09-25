/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author student
 */
public class SetDemo {
     public static void main(String[] args) {
        Set s1 = new HashSet();
        Set s2 = new LinkedHashSet();
        Set s3 = new TreeSet();
        
        s1.add(1);
        s1.add(23);
        s1.add(2);
        s1.add(52);
        s1.add(3);
        
        s2.add(1);
        s2.add(23);
        s2.add(2);
        s2.add(52);
        s2.add(3);
        
        s3.add(1);
        s3.add(23);
        s3.add(2);
        s3.add(52);
        s3.add(3);
        
        System.out.println("S1:"+s1.toString());
        System.out.println("S2:"+s2.toString());
        System.out.println("S3:"+s3.toString());
        
        s1.add(99);
        s2.add(100);
        s3.add(45);
        //Intersection
        s1.retainAll(s3);
        
        s1.add(34);
        s2.add(65);
        s3.add(53);
        //Difference
        s1.removeAll(s2);
        System.out.println(s1);
        
        s1.add(32);
        s2.add(96);
        s3.add(69);
        //Union
        s1.addAll(s3);
        System.out.println(s1);
    }
}
