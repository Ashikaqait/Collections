import java.util.Comparator;

public class Compare implements Comparator<Student>{  
	
	int idComparator(Object o1,Object o2)
	{
		Student s1=(Student)o1;  
		Student s2=(Student)o2; 
		if(s1.id==s2.id)  
			return 0;  
			else if(s1.id>s2.id)  
			return 1;  
			else  
			return -1;  
			
			  
	}
	
	int nameComparator(Object o1,Object o2)
	{
		Student s1=(Student)o1;  
		Student s2=(Student)o2; 
		return s1.name.compareTo(s2.name);  
		
			
			  
	}
	
	int cgpaComparator(Object o1,Object o2)
	{
		Student s1=(Student)o1;  
		Student s2=(Student)o2; 
		if(s1.cgpa==s2.cgpa)  
			return 0;  
			else if(s1.cgpa>s2.cgpa)  
			return 1;  
			else  
			return -1;  
			
			  
	}

	
}
  
 

 
  
