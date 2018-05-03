class Outer
{
    private int num=5;
    class Inner
    {
        void msg()
        {
            System.out.println(num);
        }
    }
    public static void main(String args[])
    {
        Outer obj=new Outer();
        Outer.Inner in=obj.new Inner();
        in.msg();
    }
}