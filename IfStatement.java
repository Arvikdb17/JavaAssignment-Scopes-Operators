package ScopesOperators;

public class IfStatement {
    public  static void main(String[] args){
      //  Write a program with an if statement. Declare one variable inside the if block and another one outside. Print both variables inside and outside the if block to understand variable scope. (Comment the compiler error in your program while submitting)
        int a=10;
        if(true){
            int b=9;
            System.out.println(b);
            System.out.println(a);
        }
        System.out.println(b);
        System.out.println(a);
    }
}
//ERROR!
///tmp/c11fBJnBOp/IfStatement.java:12: error: cannot find symbol
//        System.out.println(b);
//                           ^
//  symbol:   variable b
//  location: class IfStatement
//1 error
//
//=== Code Exited With Errors ===
