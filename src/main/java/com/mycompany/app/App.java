package com.mycompany.app;

/**
 * Hello world!
 *
 */
import java.util.*;
import java.util.ArrayList;

public class App 
{
 public static boolean search(ArrayList<String> liste, int index, String s){
		if(liste == null)
			return false;
		if(index >= liste.size())
			return false;
		if(liste.get(index).equals(s))
			return true;
	return false;	
	}
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
