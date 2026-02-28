package org.kovan.intern.Advanced_Data_and_Exceptions.file_io_and_serialization.code_serializable;
interface Permission {
}
class Student  implements Permission{

    int id;
    public Student(int id){
        this.id=id;
    }
    void display(){
        System.out.println("See the id is "+id);
    }

}
public class MarkerInterfaceDemo {
    public static void main(String[] args) {
        Student s = new Student(11);
        if (s instanceof Permission){
            s.display();
        }
        else{
            System.out.println("No one give access....");
        }
    }


}
