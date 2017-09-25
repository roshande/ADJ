package CollectionDemo.PersonDemo;


import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
public class Person {
    private int gr;
    private String name;
    
    public Person(String _name,int _gr)
    {
        this.gr = _gr;
        this.name = _name;
    }
    
    @Override
    public String toString()
    {
        return ("\nName: "+this.name +"\nGR: "+this.gr);
    }
    
    public static void main(String[] args) {
        ArrayList<Person> pal = new ArrayList();
        int i;
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Menu\n1.Create\n2.Remove\n3.Update\n4.Delete\n5.Display\n6.DisplayAll\nEnter choice: ");
             i = scanner.nextInt();
            switch(i)
            {
                case 1:
                    System.out.println("Enter name:");
                    String name = scanner.next();
                    System.out.println("Enter gr:");
                    int gr = scanner.nextInt();
                    
                    pal.add(new Person(name,gr));
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    for(Person p :pal)
                        System.out.println(p.toString());
            }
        }while(i < 7);
    }
}
