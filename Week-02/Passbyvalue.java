class Passbyvalue{
    void change(int v){
        v=v+100;
        System.out.println("inside change "+v);
    }
    public static void main(String[] args){
        int x=10;
        Passbyvalue m=new Passbyvalue();
        System.out.println("without call by value "+x);
        m.change(x);
    }
}