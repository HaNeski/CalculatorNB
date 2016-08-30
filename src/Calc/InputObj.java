package Calc;


public class InputObj {
    
    public float lump (long a, long b, String c) {
        switch (c){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "/":
                float x = a;
                if (b==0){
                    return 0;
                }else{
                return x / b;
                }
            case "*":
                return a * b;
            default:
                break;
        }
        return 0;
    }
    
}
