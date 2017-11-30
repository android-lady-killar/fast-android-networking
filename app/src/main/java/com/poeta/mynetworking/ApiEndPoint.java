package com.poeta.mynetworking;

/**
 * Created by Binh Nguyen on 11/30/2017.
 */

public class ApiEndPoint {


        public static final String BASE_URL = "https://fierce-cove-29863.herokuapp.com";
        public static final String GET_JSON_ARRAY = "/getAllUsers/{pageNumber}";
        public static final String GET_JSON_OBJECT = "/getAnUserDetail/{userId}";
        public static final String CHECK_FOR_HEADER = "/checkForHeader";
        public static final String POST_CREATE_AN_USER = "/createAnUser";
        public static final String UPLOAD_IMAGE = "/uploadImage";

}
