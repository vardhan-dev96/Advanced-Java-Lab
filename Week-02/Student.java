class Student{
    int rollno;
    String dept,name;
    public static void main(String[] args){
        Student s=new Student();
        s.rollno=28;
        s.name="vardhan";
        s.dept="cse";
        System.out.println(s.name+" "+s.dept+" "+s.rollno);
    }
}