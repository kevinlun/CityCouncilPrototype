package com.google.firebase.quickstart.database.fragment;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.Query;

public class TopPostsFragment extends PostListFragment {

    public TopPostsFragment() {}

    @Override
    public Query getQuery(DatabaseReference databaseReference) {
        // [START my_top_posts_query]
        // My top posts by number of stars
//        String myUserId = getUid();
//        Query myTopPostsQuery = databaseReference.child("user-posts").child(myUserId)
//                .orderByChild("voteCount");
        Query topPostsQuery = databaseReference.child("posts").orderByChild("voteCount")
                .limitToFirst(100);
        // [END my_top_posts_query]

        return topPostsQuery;
    }
}
