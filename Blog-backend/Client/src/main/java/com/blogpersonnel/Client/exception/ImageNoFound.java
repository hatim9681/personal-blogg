package com.blogpersonnel.Client.exception;

import lombok.Data;

@Data
public class ImageNoFound extends RuntimeException{
    private String errorCode;
    public ImageNoFound(String message,String errorCode ){
        super(message);
        this.errorCode= errorCode;

    }
}
