package com.srm.helloapp;
public class Helloapps {
	    public static void main(String[] args) {
	        if (args.length == 0) {
	            System.out.println("Hello, World!");
	            return;
	        }
	        StringBuilder message = new StringBuilder("Hello, ");

	        for (int i = 0; i < args.length; i++) {
	            message.append(args[i]);
	            if (i < args.length - 1) {
	                message.append(", ");
	            }
	        }
	        message.append("!");
	        System.out.println(message.toString());
	    }
}
