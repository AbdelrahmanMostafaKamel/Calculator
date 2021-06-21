public class TestClass {
    public static void main(String[] args){
        String commandLine="70 / 5";
        Calculator cal=new Calculator(commandLine);
        System.out.println("The output of "+commandLine+" is"+cal.doOperation());
}
}