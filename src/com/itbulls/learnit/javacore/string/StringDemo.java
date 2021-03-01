package com.itbulls.learnit.javacore.string;

public class StringDemo {
    
    
    public static void main(String[] args) {
        System.out.println();
        System.out.println("======= String Method ========");
        System.out.println();

        String s = "He llo";
        System.out.println("s.length()= " + s.length());
        System.out.println("s.contain(\"He\")= " + s.contains("He"));
        System.out.println(("s.isEmpty()= " + s.isEmpty()));
        System.out.println("s.toUpperCase()= " + s.toUpperCase());
        System.out.println("s.startsWith(\"H\")= " + s.startsWith("H"));
        System.out.println("s.endsWith(\"o\")= " + s.endsWith("o"));
        System.out.println("s.replace(\"e\",\"x\")= " + s.replace("e", "x"));
        System.out.println("s.trim()= " + s.trim());
        System.out.println("s.strip()= " +  s.strip());
    }
}
