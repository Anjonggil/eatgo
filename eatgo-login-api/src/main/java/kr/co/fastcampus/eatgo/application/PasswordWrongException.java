package kr.co.fastcampus.eatgo.application;

public class PasswordWrongException extends RuntimeException{
    PasswordWrongException(){
        super("Password id wrong");
    }
}
