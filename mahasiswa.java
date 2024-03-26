package com.example.datamahasiswa;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class mahasiswa extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView nameView,nimView;

    public mahasiswa (@NonNull View viewmahasiswa) {
        super(viewmahasiswa);
        imageView = itemView.findViewById(R.id.imageview);
        nameView = itemView.findViewById(R.id.name);
        nimView = itemView.findViewById(R.id.nim);
    }
}
