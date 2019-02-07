package com.example.androideatitserver.Common;

import com.example.androideatitserver.Model.User;

public class Common {
    public static User currentUser;
    public static final int PICK_IMAGE_REQUEST = 71;

    public static final String UPDATE = "Update";
    public static final String DELETE = "Delete";

    public static String convertCodeToString(String code){
        if(code.equals("0"))
            return "Placed";
        else if(code.equals("1"))
            return "On My Way";
        else
            return "Shipped";
    }
}
