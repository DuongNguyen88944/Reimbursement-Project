package com.techproject.exceptions;

public class InvalidMessage extends RuntimeException {
    public InvalidMessage (String message){
       
        super(message);
    }

   

    public static void main(String[] args) {

        
        try{
            throw new InvalidMessage("this could be a message for the end user, or just for a dev working on code");
        } catch(InvalidMessage e) {
            System.out.println(e.getMessage());
        }

        
        throw new InvalidMessage("this could be a message for the end user, or just for a dev working on code");
    }
    
}
