package com.app.java8;



public class Program4 {
	   public static String insertString(
	            String originalString,
	            String stringToBeInserted,
	            int index)
	        {
	            String newString = originalString.substring(0, index + 1)
	                            + stringToBeInserted
	                            + originalString.substring(index + 1);
	            return newString;
	        }
	        public static void main(String[] args)
	        {



	           String originalString = "GeeksGeeks";
	            String stringToBeInserted = "ForASD";
	            int index = 4;



	           System.out.println("Original String: "
	                            + originalString);
	            System.out.println("String to be inserted: "
	                            + stringToBeInserted);
	            System.out.println("String to be inserted at index: "
	                            + index);
	            System.out.println("Modified String: "
	                            + insertString(originalString,
	                                            stringToBeInserted,
	                                            index));
	        }
}
