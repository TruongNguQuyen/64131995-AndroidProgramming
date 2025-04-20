package tnq.tiil.edu.usingrecyclerview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.LandScapeViewHolder>{

    Context context;
    ArrayList<LandScape> datas;

    public LandScapeAdapter(Context context, ArrayList<LandScape> datas) {
        this.context = context;
        this.datas = datas;
    }

    @NonNull
    @Override
    public  LandScapeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View viewItem = layoutInflater.inflate(R.layout.landscape_item, parent, false);
        return new LandScapeViewHolder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull LandScapeViewHolder holder, int position) {
        LandScape landScape = datas.get(position);
        holder.landscapeCaption.setText(landScape.getLandscapeName());
        String packageName = holder.itemView.getContext().getPackageName();
        String nameFile = landScape.getLandscapeImage();
        int imageID = holder.itemView.getResources().getIdentifier(nameFile, "mipmap", packageName);
        holder.landscapeImage.setImageResource(imageID);
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }

    class LandScapeViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        TextView landscapeCaption;
        ImageView landscapeImage;

        public LandScapeViewHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            landscapeImage = itemView.findViewById(R.id.ivLandScape);
            landscapeCaption = itemView.findViewById(R.id.tvCaption);
        }

        @Override
        public void onClick(View v){
            int clickedPosition = getAdapterPosition();
            LandScape landScape = datas.get(clickedPosition);
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("name", landScape.getLandscapeName());
            intent.putExtra("image", landScape.getLandscapeImage());
            intent.putExtra("description", landScape.getLandscapeDescription());
            context.startActivity(intent);
        }
    }
}