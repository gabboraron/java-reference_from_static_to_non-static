# java-reference_from_static_to_non-static


I had many trouble how to refer from static method to a non static one, beacuse the static one can't refer with <code>this</code>

The best resolution what I found was here: https://learn-java-by-example.com/java/fix-cannot-static-reference-non-static-method/

<code>
/**
*  Will not compile
*/
 
public class StaticReferenceToNonStatic
{
   public static void myMethod()
   {
      // Cannot make a static reference
      // to the non-static method
      myNonStaticMethod(); 
   }
 
   public void myNonStaticMethod()
   {
   }
}
 
/**
* you can make your method non-static
*/
 
public class MyClass
{
   public void myMethod()
   {
      myNonStaticMethod(); 
   }
 
   public void myNonStaticMethod()
   {
   }
}
 
/**
*  you can provide an instance of the 
*  class to your static method for it 
*  to access methods from
*/
 
public class MyClass
{
   public static void myStaticMethod(MyClass o)
   {
      o.myNonStaticMethod(); 
   }
 
   public void myNonStaticMethod()
   {
   }
}
 
/**
*  you can make the method static
*/
 
public class MyClass
{
   public static void myMethod()
   {
      f(); 
   }
 
   public static void f()
   {
   }
}
</code>
