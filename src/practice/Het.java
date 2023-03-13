package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import javax.sound.midi.ControllerEventListener;

public class Het {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList();
		al.add("Arun");
		//al.add(10);
		al.add("Vivek");
		al.add("Arun");
		al.add("Abhay");
		al.add("Vipin");
		//System.out.println(al);
		
		//al.isEmpty();
	//al.contains("Arun");
/*		System.out.println(al.contains("Arun"));
		System.out.println(al.isEmpty());
    Object list =  al.stream().sorted().collect(Collectors.toList());
        System.out.println(list);*/
     List l =     Collections.synchronizedList(al);
     
     System.out.println(l);
     
     System.out.println("******************************");
     
     al.forEach(e->System.out.println(e));
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
     
	}

}
