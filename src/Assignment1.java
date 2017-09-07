abstract class Parent
{
 abstract void callme();
 public void normal()
 {
  System.out.println("this is concrete method");
 }  
}
class Assignment1 extends Parent
{
 void callme()
 {
  System.out.println("this is callme."); 
 }
 public static void main(String[] args)
 {
	 Assignment1 b = new Assignment1();
  b.callme();
  b.normal();
 }
}