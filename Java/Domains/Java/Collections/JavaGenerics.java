import java.io.IOException;
import java.lang.reflect.Method;

class Printer
{
   public static <A> void printArray(A[] arr){
       for(A element : arr) {
           System.out.println(element);
       }
   }
}

/**
 * See <a href="https://www.hackerrank.com/challenges/java-generics">Java Generics</a>
 * @author Brian Yeicol Restrepo Tangarife
 */
public class JavaGenerics
{
    public static void main( String args[] )
    {
        Printer myPrinter=new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello","World"};
        myPrinter.printArray( intArray  );
        myPrinter.printArray( stringArray );
        int count=0;
      for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray"))
              count++;
        }
        
        if(count>1)System.out.println("Method overloading is not allowed!");
        assert count==1;

    } 
}
