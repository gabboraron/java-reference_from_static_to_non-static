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
