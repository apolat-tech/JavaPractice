package com.syntax.class21;

public class UserInfo extends UserClass {
    String userAddress = "Ali's address";

    UserInfo(String name, String phoneNumber) {
        //super.name = name;
        //super.phoneNumber = phoneNumber;
        super(name, phoneNumber);
        this.userAddress = userAddress;
    }

    void userDetails() {
        System.out.println("Name:" + name);
        System.out.println("Phone:" + phoneNumber);
        System.out.println("Address:" + userAddress);
    }

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("Ali", "770 889889");
        userInfo.userDetails();
    }
}
