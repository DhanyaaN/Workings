interface Printer
{
    void print(String val);
}
class Lamdademoref
{
    public static void dosomething(String something)
    {
        System.out.println(something);
    }
    public static void main(String args[])
    {
        String something="hai";
        Printer printer=Lamdademoref::dosomething;
        printer.print(something);

    }
}