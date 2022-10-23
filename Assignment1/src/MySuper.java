public class MySuper
{
  int x = 1;
   
  public MySuper()
  {
    System.out.print(getResult(3));
  }
  int getResult()
  {
    return x;
  }
  int getResult(int i)
  {
    return(i + x + getResult() + x);
  }
}
 

/*Select the correct answer.

 

a. This program writes “19” to the standard output.
b. This program writes “13” to the standard output.
c. This program writes “6” to the standard output.
d. This program writes “17” to the standard output.
e. This program writes “16” to the standard output.*/

