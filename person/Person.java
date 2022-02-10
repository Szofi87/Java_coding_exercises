package person;

public class Person {
	private String firstName;
    private String lastName;
    private int age;
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
        }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
   
    public void setAge(int age) {
       
        if(age >= 0 && age <= 100 ){
            this.age = age;
        } else {
            this.age = 0;
        }
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public int getAge() {
        return this.age;
    }
    public boolean isTeen(){
    		if(age > 12 && age <20) {
    			return true;
    		}else {
    			return false;
    		}
    }
    public String getFullName() {
    	if(getFirstName().isEmpty() ) {
    		return "" + getLastName();
    	}else if (getLastName().isEmpty()){
    		return getFirstName() + "";
    	}else {
    		return getFirstName() + " " + getLastName();
    	}
    }
}
