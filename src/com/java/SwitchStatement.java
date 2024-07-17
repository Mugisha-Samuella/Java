package com.java;

public class SwitchStatement {

        public static void main(String[] args) {
            String gender = "Female";

            switch(gender.toUpperCase()){
                case "MALE":
                    System.out.println("I am Male");
                    break;
                case "FEMALE":
                    System.out.println("I am Female");
                    break;
                default:
                    System.out.println("Unknown gender");
            }

        }
    }

