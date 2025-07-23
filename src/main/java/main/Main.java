package main;
import java.util.ArrayList;
import java.util.List;

import models.FullTimeEmployee;
import models.PartTimeEmployee;

public class Main {
    public static void main(String[] args) {
    List <FullTimeEmployee> l1=new ArrayList<>();
    List<PartTimeEmployee> l2=new ArrayList<>();
    FullTimeEmployee f1=new FullTimeEmployee("lokesh", 11000);
    l1.add(f1);
 FullTimeEmployee f2=new FullTimeEmployee("hari", 10000);
 l1.add(f2);
 FullTimeEmployee f3=new FullTimeEmployee("muthu", 13000);
 l1.add(f3);
 FullTimeEmployee f4=new FullTimeEmployee("kowshik", 15000);
 l1.add(f4);
 FullTimeEmployee f5=new FullTimeEmployee("Ram", 16000);
 l1.add(f5);
 PartTimeEmployee p1=new PartTimeEmployee("sounder",4,150);
 l2.add(p1);
 PartTimeEmployee p2=new PartTimeEmployee("adrin",5,100);
 l2.add(p2);
 PartTimeEmployee p3=new PartTimeEmployee("karthick",4,200);
 l2.add(p3);
 PartTimeEmployee p4=new PartTimeEmployee("akilesh",4,300);
 l2.add(p4);
 PartTimeEmployee p5=new PartTimeEmployee("arun",5,180);
 l2.add(p5);


   for(int i=0;i<l1.size();i++){
       System.out.println("Full Time Employee "+(i+1)+"-"+l1.get(i).getName()+" Tax: "+l1.get(i).calculateTax());
   }
   System.out.println("-----------------------------");
   for(int i=0;i<l2.size();i++){
       System.out.println("Part Time Employee "+(i+1)+"-"+l2.get(i).getName()+" Tax: "+l2.get(i).calculateTax());
   }
    

}
}
