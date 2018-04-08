package com.google.firebase.quickstart.database.models;

import com.google.firebase.database.IgnoreExtraProperties;

// [START blog_user_class]
@IgnoreExtraProperties
public class User {

    public String username;
    public String email;
    public String isGovt;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String email, String isGovt) {
        this.username = username;
        this.email = email;
        this.isGovt = isGovt;
    }

}
// [END blog_user_class]
