package com.herorickystudios.lovecutey.Chat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.herorickystudios.lovecutey.R;

public class ChatViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener {

    public ChatViewHolders(@NonNull View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
    }
}
