package com.herorickystudios.lovecutey.Chat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.herorickystudios.lovecutey.R;

import java.util.List;

public class ChatAdapter extends RecyclerView.Adapter<ChatViewHolders> {
    private List<ChatObject> chatList;
    private Context context;


    public ChatAdapter(List<ChatObject> matchesList, Context context){
        this.chatList = matchesList;
        this.context = context;
    }

    @NonNull
    @Override
    public ChatViewHolders onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_matches, null, false);

        RecyclerView.LayoutParams Ip = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        layoutView.setLayoutParams(Ip);
        ChatViewHolders rov = new ChatViewHolders((layoutView));

        return rov;
    }

    @Override
    public void onBindViewHolder(@NonNull ChatViewHolders holder, int position) {
    }

    @Override
    public int getItemCount() {

        Integer itemCount = chatList.size();
        return itemCount;
    }
}
