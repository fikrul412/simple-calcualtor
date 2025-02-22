import java.math.BigDecimal;
import java.math.RoundingMode;

public class Num {
    /*Fields*/
    static String num1;
    static String num2;
    static boolean changeNum = false ;
    static String operator;

    public static void setOperator(String ops){
        operator = ops;
    }
    public static boolean isOperator(){
        boolean state;
        state = operator != null;
        return state;
    }
    public static void setNum1(String num){
        num1 = num;
    }
    public static void setNum2(String num){
        if (operator != null && num1 != null){
            num2 = num;
        }
    }
    public static String getNum1(){
        return num1;
    }
    public static String getNum2(){
        return num2;
    }
    public static String getOperator(){
        return operator;
    }
    public static void setChangeNum(boolean bool){
        changeNum = bool;
    }
    public static boolean getChangeNum(){
        return changeNum;
    }
    public static String calculateResult(){
        String result = "";
        if (operator.equals("+")){
            result =  new BigDecimal(num1).add(new BigDecimal(num2)).toString();
        }
        if (operator.equals("-")){
            result =  new BigDecimal(num1).subtract(new BigDecimal(num2)).toString();
        }
        if (operator.equals("/")){
            if (new BigDecimal(num2).compareTo(BigDecimal.ZERO) == 0){
                result = "Error";
            }
            else{
                result =  new BigDecimal(num1).divide(new BigDecimal(num2), 10, RoundingMode.HALF_UP).stripTrailingZeros().toPlainString();
            }
        }
        if (operator.equals("*")){
            result =  new BigDecimal(num1).multiply(new BigDecimal(num2)).toString();
        }
        return result;
    }





    }
