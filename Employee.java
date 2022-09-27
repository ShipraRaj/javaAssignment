package package1;

public class Employee {

    String  firstname;
     String lastname;
     int  age;
     String designation;
     //setter method:
     class Main{
     private int age;
     public void setAge(int age) {
		this.age = age;
	}
     } 
     //default constructor:
	Employee()
	{
		//firstname=firstname;
		//lastname=lastname;
        //age=age;
       //designation=designation;
      //display1();
	}
	//parameterised constructor:
	Employee(String fname,String lname,int age1,String desgntn)
	{
    	this.firstname=fname;
     	this.lastname=lname;
     	this.age=age1;
     	this.designation=desgntn;
	}
    	void display() {
    		System.out.println(firstname + " "+ lastname + " " + age+ " "+designation);
    	}
    	
    	@Override
    	public String toString() {
    		return this.firstname+" "+this.lastname+" "+this.age+" "+this.designation;
    	}

	public static void main(String[] args)
	{
              Employee emp = new Employee();
              emp.firstname="Shipra";
              emp.lastname="Raj";
              emp.age=2;
              emp.designation="QE";
              emp.display();

              Employee emp2 = new Employee();
              emp2.firstname="Rashi";
              emp2.lastname="modi";
              emp2.age=22;
              emp2.designation="QE";
              Employee emp1 = new Employee("Alka ","Singh",23,"QE");
              emp1.display();
              
              System.out.print(emp2.toString());
    }
	}


