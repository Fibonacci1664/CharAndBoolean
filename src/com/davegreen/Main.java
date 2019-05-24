package com.davegreen;

public class Main
{

    public static void main(String[] args)
    {
        //Standard char, any letter ,symbol or number from the keypad, always in single quotes.
        char myChar = 'A';
        System.out.println("My character output is: " + myChar);

        //Unicode char, using the specific code provided from sites such as unicode-table.com.
	    char myUnicodeChar = '\u00A9';
        System.out.println("My unicode output is: " + myUnicodeChar + " (Copyright Symbol)");

        //Challange.
        char challangeUnicodeChar = '\u00AE';
        System.out.println("My unicode output is: " + challangeUnicodeChar + " (Registered Symbol)");

        boolean myBoolean = false;
        boolean isMale = true;
    }
}
