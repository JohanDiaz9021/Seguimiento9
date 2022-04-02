package ui;
import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
public class Main
{
  public static void main(String[] args) throws IOException
  {  
  Scanner must = new Scanner(System.in);
    int a = must.nextInt();
    for (int i = 1; i<=a; i++)
    {
      int n = must.nextInt ();
      int v = must.nextInt();
      int [] arr = new int[n];
      for (int j = 0; j<n; j++)
      {
        arr[j] = must.nextInt();
      }
      Arrays.sort(arr);
      int x = arr[n-1];
      int y = arr[n-2];
      int sum = x+y;
      int ans = v / sum;
             
      if (v % sum == 0)
      {
        System.out.println(ans*2);
}
      else if(v % sum <= x)
      {
        System.out.println(ans*2 + 1);
}
      else
      {
        System.out.println(ans*2 + 2);
 }
}
}
}