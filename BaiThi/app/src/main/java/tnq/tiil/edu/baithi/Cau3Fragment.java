package tnq.tiil.edu.baithi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class Cau3Fragment extends Fragment {

    LandScapeAdapter adapter;
    ArrayList<LandScape> list;
    RecyclerView recyclerViewLandScape;

    public Cau3Fragment() {
        // Required empty public constructor
    }
    public static Cau3Fragment newInstance(String param1, String param2) {
        Cau3Fragment fragment = new Cau3Fragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Chuẩn bị dữ liệu cho danh sách
        list = new ArrayList<>();
        list.add(new LandScape("Cột cờ Hà Nội", "hanoi_flag_tower", "Cột cờ Hà Nội là một trong những biểu tượng của Thủ đô Hà Nội."));
        list.add(new LandScape("Tháp Eiffel", "eiffel_tower", "Tháp Eiffel là một công trình kiến trúc nổi tiếng của nước Pháp."));
        list.add(new LandScape("Cung điện Buckingham", "buckingham_palace", "Cung điện Buckingham là nơi ở chính thức của Hoàng gia Anh."));
        list.add(new LandScape("Tượng nữ thần tự do", "nu_than_tu_do", "Tượng nữ thần tự do là một biểu tượng của nước Mỹ."));
        list.add(new LandScape("Vạn Lý Trường Thành", "vanlytruongthanh", "Vạn lý trường thành là một công trình lâu đời ở Trung Quốc"));
        list.add(new LandScape("Chùa Wat Arun", "wat_arun_thailand", "Ngôi chùa nổi tiếng wat arun ở Thái Lan với vẻ đẹp huyền bí bên cạnh dòng sông"));
        list.add(new LandScape("Tượng đá megalith cổ", "tuongda_daonias_indonesia", "Những pho tượng cổ từ thời tiền sử trên đảo Nias ở Indonesia"));
        list.add(new LandScape("Lâu đài Himeji", "laudai_himeji_nhatban", "Lâu đài Himeji hay còn gọi là Hạc Trắng là một trong những lâu đài đẹp nhất của Nhật Bản"));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View viewCau3 = inflater.inflate(R.layout.fragment_cau3, container, false);
        // Tìm điều khiển Recyclerview
        recyclerViewLandScape = viewCau3.findViewById(R.id.rVLandScape);
        // Tạo layout manager để đặt bố cục cho Recycler
        RecyclerView.LayoutManager layoutLinear = new LinearLayoutManager(viewCau3.getContext());
        recyclerViewLandScape.setLayoutManager(layoutLinear);
        // Tạo adapter gắn vào nguồn dữ liệu
        adapter = new LandScapeAdapter(viewCau3.getContext(), list);
        // gắn adapter vào Recycler
        recyclerViewLandScape.setAdapter(adapter);
        return viewCau3;
    }
}