import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class ArrayListCompartor {
	
	public static void main(String args[]){
		
		List<Employee> arrayList = new ArrayList<Employee>();
		arrayList.add(new Employee("Preethi",850000));
		arrayList.add(new Employee("Thiyagu",1050000));
		arrayList.add(new Employee("Tanvi",60000));
		arrayList.add(new Employee("Divya",70000));
		Collections.sort(arrayList, new Comparator<Employee>(){	
			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				//return o1.getName().compareTo(o2.getName());
				if( o1.getSalary() > o2.getSalary())
					return 1;
				else
					return -1;
						
							
				
			}
			
			
		});
Iterator iterator =arrayList.iterator();
		
		while(iterator.hasNext()){
			System.out.println("arrayListElements"+iterator.next().toString());
		}
	}

}
