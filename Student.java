public class Student{
    //fields
    long id;
    int age;
    String name;
    String doj="04-04-2024";
    /*Student(){
        System.out.println("Inside the Student constructor");
    }*/
     Student(long id,int age,String name){
        System.out.println("Inside the Student parameterized constructor");
        this.id=id;
        this.age=age;
        this.name=name;
    }
    //block
    {
        System.out.println("Inside the Student instance block");
    }
    //method
    void displayStudentDetail(){
             System.out.println("Inside the displayStudentDetail method");
    }
    public static void main(String[] ar){
        Student obj1=new Student(1L, 10, "Rahim");
        obj1.name="Rahim";
        System.out.println("Name of obj1:"+obj1.name);
       // Student obj2=new Student(1L,10,"Ram");
        //System.out.println("Name of obj2:"+obj2.name);
        // obj.displayStudentDetail();
    }
}