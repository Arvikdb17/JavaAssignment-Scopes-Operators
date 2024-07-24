package ScopesOperators;

public class IfStatement {
    public  static void main(String[] args){
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