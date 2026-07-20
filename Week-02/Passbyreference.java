class student{
    int marks;
}
public class Passbyreference{
    void pbr(student s){
        s.marks=100;
    }
    public static void main(String[] args){
    student s1=new student();
    s1.marks=20;
    System.out.println("before"+s1.marks);
    Passbyreference p=new Passbyreference();
    p.pbr(s1);
    System.out.println("after"+s1.marks);
    }

}