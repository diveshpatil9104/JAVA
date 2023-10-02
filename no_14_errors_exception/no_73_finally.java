package no_14_errors_exception;

public class no_73_finally {


    public static int div(){
        try{
        int a = 10;
        int b = 5;
        int ans = a/b;
        return ans; 
    }catch(Exception e){
        System.out.println("0 NOT ALOWED AS DIVISIBLE ");
    }
    finally{            //  ---->> HERE IS ALWAYS EXECUTED EVEN AFTER RETURN STATEMENT OR ALSO BREAK ...☻
        System.out.println("Cleanning up resources!!! this is end of function");
    }
    return -1;
    }
    public static void main(String[] args) {

        System.out.println(div());
    }
}


/* 
    finally BLOCK CONTAINS THE CODE WHICH IS ALWAYS EXECUTED WHETER THE EXCEPTION IS HANDALED OR NOT
    IT IS USED TO EXECUTE CODE CONTAING INSTRUCTION TO RELEASE THE SYSTEM RESOURCES , CLOSE A CONNECTION ETC..

*/









