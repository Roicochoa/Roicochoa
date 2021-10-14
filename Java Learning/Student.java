public class Student {
    private int Id;
    private String name;
    private String college;
    private String address;

    public int studentid() {
        return Id;
    }
    public void setId(int Id) {
        this.Id = Id;
    }

    public String studentname(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String studentcollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }

    public String studentaddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
class TestStudent{
    public static void main(String[] args){
        Student s = new Student();
        s.setName("Coco");
        s.setId(1);
        s.setCollege("UCSC");
        s.setAddress("1234 Smith Street");
        System.out.println(s.studentid());
        System.out.println(s.studentname());
        System.out.println(s.studentcollege());
        System.out.println(s.studentaddress());
    }
}