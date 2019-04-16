package com.megadahliana.beritaportal.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.megadahliana.beritaportal.R;
import com.megadahliana.beritaportal.responseAPI.BeritaItem;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AdapterBerita extends
        RecyclerView.Adapter<AdapterBerita.ViewHolder>{
    //Membuat Variable untuk Contrucktor
    Context context;
    List<BeritaItem> berita;


    public AdapterBerita(Context context, List<BeritaItem> berita) {
        this.context = context;
        this.berita = berita;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(context).inflate(R.layout.berita_item, viewGroup, false);
        return new RecyclerView.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, final int i) {

        @Override
        public int getItemCount() {
            return berita.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            @BindView(R.id.ivGambarBerita)
            ImageView ivGambarBerita;
            @BindView(R.id.tvJudulBerita)
            TextView tvJudulBerita;
            @BindView(R.id.tvTglTerbit)
            TextView tvTglTerbit;
            @BindView(R.id.tvPenulis)
            TextView tvPenulis;

            public ViewHolder(@NonNull View itemView) {
                super(itemView);
                ButterKnife.bind(this,itemView);
            }
        }

}
