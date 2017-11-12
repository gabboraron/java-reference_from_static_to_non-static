# java-reference_from_static_to_non-static
2
​
3
​
4
I had many trouble how to refer from static method to a non static one, beacuse the static one can't refer with <code>this</code>
5
​
6
The best resolution what I found was here: https://learn-java-by-example.com/java/fix-cannot-static-reference-non-static-method/
7
​
8
<h2>
9
 Will not compile
11
</h2>

12
<code> 
13
public class StaticReferenceToNonStatic
14
{
15
   public static void myMethod()
16
   {
17
      // Cannot make a static reference
18
      // to the non-static method
19
      myNonStaticMethod(); 
20
   }
21
 
22
   public void myNonStaticMethod()
23
   {
24
   }
25
}
26
</code> 
27

<h1> you can make your method non-static</h1>
29

30
 <code>
31
public class MyClass
32
{
33
   public void myMethod()
34
   {
35
      myNonStaticMethod(); 
36
   }
37
 
38
   public void myNonStaticMethod()
39
   {
40
   }
41
}
42
 </code>
43
<h1>
44
  you can provide an instance of the 
45
  class to your static method for it 
46
 to access methods from
47
</h1>
48
 
<code>
49
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
 

</code>
<h1> you can make the method static </h1>
 

<code>
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
