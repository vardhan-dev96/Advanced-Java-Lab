class DefaultValues
{
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean bool;

    public static void main(String[] args)
    {
        DefaultValues obj = new DefaultValues();

        System.out.println("Byte Default Value      : " + obj.b);
        System.out.println("Short Default Value     : " + obj.s);
        System.out.println("Int Default Value       : " + obj.i);
        System.out.println("Long Default Value      : " + obj.l);
        System.out.println("Float Default Value     : " + obj.f);
        System.out.println("Double Default Value    : " + obj.d);
        System.out.println("Char Default Value      : [" + obj.c + "]");
        System.out.println("Boolean Default Value   : " + obj.bool);
    }
}