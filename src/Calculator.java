public class Calculator {
    private String cmlLine;
    public Calculator(String cmlLine){
        this.cmlLine=cmlLine;
    }
    public Calculator(){
        cmlLine=null;
    }
    public String getCmdLine(){
        return cmlLine;
    }
    public void setCmdLine(String cmlLine){
        this.cmlLine=cmlLine;
    }
    public String doOperation(){
        String[] parts=cmlLine.split(" ");
        String out=" ";
        if(parts.length!=3){
            System.out.println("Error in input.");
        }
        else{
            Float op1=Float.parseFloat(parts[0]);
            Float op2=Float.parseFloat(parts[2]);
            switch(parts[1]){
                case "+":
                    out=out+(op1+op2);
                    break;
                case "-":
                    out=out+(op1-op2);
                    break;
                case "*":
                    out=out+(op1*op2);
                    break;
                case "/":
                    out=out+(op1/op2);
                    break;
                default:
                    return "Unknown Operation";
            }
        }
        return out;
    }
}
