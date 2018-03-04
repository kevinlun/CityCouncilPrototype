package com.google.firebase.quickstart.database.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.quickstart.database.R;
import com.google.firebase.quickstart.database.models.Post;

public class PostViewHolder extends RecyclerView.ViewHolder {

    public TextView titleView;
    public TextView authorView;
    public ImageView upvoteView;
    public TextView numVotesView;
    public ImageView downvoteView;
    public TextView bodyView;

    public PostViewHolder(View itemView) {
        super(itemView);

        titleView = itemView.findViewById(R.id.post_title);
        authorView = itemView.findViewById(R.id.post_author);
        upvoteView = itemView.findViewById(R.id.upvote);
        numVotesView = itemView.findViewById(R.id.post_num_votes);
        downvoteView = itemView.findViewById(R.id.downvote);
        bodyView = itemView.findViewById(R.id.post_body);
    }

    public void bindToPostUpvote(Post post, View.OnClickListener starClickListener) {
        titleView.setText(post.title);
        authorView.setText(post.author);
        numVotesView.setText(String.valueOf(post.voteCount));
        bodyView.setText(post.body);

        upvoteView.setOnClickListener(starClickListener);
    }

    public void bindToPostDownvote(Post post, View.OnClickListener starClickListener) {
        titleView.setText(post.title);
        authorView.setText(post.author);
        numVotesView.setText(String.valueOf(post.voteCount));
        bodyView.setText(post.body);

        downvoteView.setOnClickListener(starClickListener);
    }
}
