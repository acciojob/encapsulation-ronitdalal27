package com.driver;

public class Main {
  public static void main(String args[]){
    RWOnly obj = new RWOnly();
    //obj.name = "ronit";
    //System.out.println(obj.name);
    //you cannot access private data members of any class and can't print it 
    obj.setName("Ronit");
    System.out.println(obj.getName());
  }
}