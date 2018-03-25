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
    public TextView reportView;
    public ImageView upvoteView;
    public TextView numVotesView;
    public ImageView downvoteView;
    public TextView bodyView;

    public PostViewHolder(View itemView) {
        super(itemView);

        titleView = itemView.findViewById(R.id.post_title);
        authorView = itemView.findViewById(R.id.post_author);
        reportView = itemView.findViewById(R.id.post_report);
        upvoteView = itemView.findViewById(R.id.upvote);
        numVotesView = itemView.findViewById(R.id.post_num_votes);
        downvoteView = itemView.findViewById(R.id.downvote);
        bodyView = itemView.findViewById(R.id.post_body);
    }

    public void bindToPostReport(Post post, View.OnClickListener reportClickListener) {
        titleView.setText(post.title);
//        authorView.setText(post.author);
        numVotesView.setText(String.valueOf(post.voteCount));
        bodyView.setText(post.body);

        reportView.setOnClickListener(reportClickListener);
    }

    public void bindToPostUpvote(Post post, View.OnClickListener upvoteClickListener) {
        titleView.setText(post.title);
//        authorView.setText(post.author);
        numVotesView.setText(String.valueOf(post.voteCount));
        bodyView.setText(post.body);

        upvoteView.setOnClickListener(upvoteClickListener);
    }

    public void bindToPostDownvote(Post post, View.OnClickListener downvoteClickListener) {
        titleView.setText(post.title);
//        authorView.setText(post.author);
        numVotesView.setText(String.valueOf(post.voteCount));
        bodyView.setText(post.body);

        downvoteView.setOnClickListener(downvoteClickListener);
    }
}
