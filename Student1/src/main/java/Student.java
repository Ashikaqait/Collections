import java.util.*;

public class Student {
	static ArrayList<Student> list;
	
	public int n,id;
	public String name;
	public double cgpa;
	
	Student(int id, String name, double cgpa)
	{
		this.id=id;
		this.name=name;
		this.cgpa=cgpa;
		
	}
	
	public static void main(String[] args)
	{
		
		
		new ArrayList<Student>();
	     int n,id;
		String name;
		double cgpa;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of students:");
		n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			id=sc.nextInt();
			name=sc.nextLine();
			cgpa=sc.nextDouble();
				
			list.add(new Student(id,name,cgpa));
			
		}
		
		Collections.sort(list,reverseorder(idComparator()));
		Collections.sort(list,(nameComparator()));
		Collections.sort(list,reverseorder(cgpaComparator()));
		
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		Student st=(Student)itr.next();  
		System.out.println(st.name); 
		
	}
	
}
}
