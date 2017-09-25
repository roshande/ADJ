/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 *
 * @author student
 */
public class ArrayListExample {
    public static void main(String[] args) {
        //ArrayList a1 = new ArrayList();
        int sum=0;
        ArrayList<Integer> a1 = new ArrayList<>();
        for( int i=0;i<10;++i)
            a1.add(i);
        
        long start = System.currentTimeMillis();
        //for each loop
        for(Integer elem:a1)
        {
            //System.out.println(elem);
            sum += (int)elem;
        }
        System.out.println(System.currentTimeMillis() - start);
        
        sum = a1.stream().map((elem) -> (int)elem).reduce(sum, Integer::sum); //System.out.println(elem);
        
        start = System.currentTimeMillis();
        //using stream
        a1.stream().forEach((Integer elem) -> {
            //System.out.println(elem);
            //sum+=elem;
        });
        System.out.println(System.currentTimeMillis() - start);
        
        start = System.currentTimeMillis();
        //using iterator
        for (Iterator it = a1.iterator(); it.hasNext();) {
            int elem = (int) it.next();
            //System.out.println(elem);
            sum+=elem;
        }
        System.out.println(System.currentTimeMillis() - start);
        
        start = System.currentTimeMillis();
        //using indexing
        for(int j=0;j<a1.size();++j)
        {
            //System.out.println(a1.get(j));
            sum += a1.get(j);
        }
        System.out.println(System.currentTimeMillis() - start);

    }
}
