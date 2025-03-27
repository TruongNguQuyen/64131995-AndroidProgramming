package tnq.tiil.edu.listview_danhsachcacquocgia_upgrade;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CountryAdapter extends BaseAdapter {
    // Nguồn dữ liệu cho Adapter
    ArrayList<Country> listQG;
    // Context hoạt động
    Context context;
    // Layout
    LayoutInflater inflater;

    // Constructor

    public CountryAdapter(ArrayList<Country> listQG, Context context) {
        this.listQG = listQG;
        this.context = context;
        this.inflater = LayoutInflater.from(context);
    }
    // Implement
    @Override
    public int getCount() {
        return listQG.size();
    }

    @Override
    public Object getItem(int position) {
        return listQG.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CountryViewHolder viewItem;
        if (convertView == null) {
            convertView = inflater.inflate(R.layout.country_item, null);
            viewItem = new CountryViewHolder();
            viewItem.textViewNationName = convertView.findViewById(R.id.tvNationName);
            viewItem.textViewPopulation = convertView.findViewById(R.id.tvPopulation);
            viewItem.imageViewFlag = convertView.findViewById(R.id.imgNation);
            convertView.setTag(viewItem);
        } else {
            viewItem = (CountryViewHolder) convertView.getTag();
        }
        // Đặt dữ liệu lên view
        Country QuocGiaShow = listQG.get(position);
        String tenQG = QuocGiaShow.getTenQG();
        int soDan = QuocGiaShow.getDanSo();
        String laCoQG = QuocGiaShow.getTenFile();
        viewItem.textViewNationName.setText(tenQG);
        viewItem.textViewPopulation.setText("Dân số: " + soDan);

        // Tìm id file ảnh ở đây
        int idFlag = FindIDImage_NameFile(laCoQG);
        viewItem.imageViewFlag.setImageResource(idFlag);

        // Set onClickListener
        convertView.setOnClickListener(v -> {
            Intent intent = new Intent(context, CountryDetailActivity.class);
            intent.putExtra("tenQG", tenQG);
            intent.putExtra("danSo", soDan);
            intent.putExtra("tenFile", laCoQG);
            context.startActivity(intent);
        });

        return convertView;
    }

    int FindIDImage_NameFile(String file){
        String tenPackage = context.getPackageName();
        int id = context.getResources().getIdentifier(file, "mipmap", tenPackage);
        return id;
    }

    static class CountryViewHolder {
        ImageView imageViewFlag;
        TextView textViewNationName;
        TextView textViewPopulation;
    }
}