interface Printer {
    void print(String val);
}

class LambdaDemoFunctional {
/*
    public void printSomething(String something, Printer printer) {
        //System.out.println(something);
        printer.print(something);
    }
    */

    public static void main(String[] args) {
        //LambdaDemoFunctional lambdaDemo = new LambdaDemoFunctional();
        Printer printer = new Printer() {
            @Override
            public void print(String val) {
                System.out.println(val);
            }
        };
        String something = "Learning Lambda";
        //lambdaDemo.printSomething(something, printer);
        printer.print(something);
    }
}