class LambdaDemoOops {

    public void printSomething(String something) {
        System.out.println(something);
    }

    public static void main(String[] args) {
        LambdaDemoOops lambdaDemo = new LambdaDemoOops();
        String something = "Learning Lambda";
        lambdaDemo.printSomething(something);
    }
}