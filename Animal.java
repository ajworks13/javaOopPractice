abstract class Animal{
    
    private String type;
    String color;
    int age;
    
    public Animal(){
        this.type = type;
        this.color = color;
        this.age = age;
        
    }
    
    // getter
    public String getType(){
        return "Animal type is: " + type;
    }
    
    //setter
    public void setType(String theType){
        this.type = theType;
    }
    
    public abstract void speak(); // abstract method
    
    public void sleep(){
        System.out.println("Sleeping.. Zz..Zz..");
    }
    
    
}
