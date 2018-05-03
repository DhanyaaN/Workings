interface Printer
{
    void print(String val);
}
class Lamdademo1
{
    public void dosomething(String something,Printer printer)
    {
        printer.print(something);
    }
    public static void main(String args[])
    {
        Lamdademo1 demo=new Lamdademo1();
        /*
        Printer printer=new Printer(){
        public void print(String val)
        {
          System.out.println(val);
        }
        };*/
        Printer printer=(String toprint)->
        {
            System.out.println(toprint); 
        };
        String something="welcome";
      demo.dosomething(something,printer);

    }
}