package tnq.tiil.edu.listview_danhsachcacquocgia_upgrade;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Country> dsQG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        dsQG = new ArrayList<>();
        dsQG.add(new Country("Việt Nam", 96000000, "vietnam_100", "Việt Nam là một quốc gia nằm ở Đông Nam Á, có lịch sử hào hùng, văn hóa phong phú và nền kinh tế đang phát triển mạnh mẽ. Đất nước này nổi tiếng với phong cảnh thiên nhiên tuyệt đẹp, từ vịnh Hạ Long hùng vĩ, phố cổ Hội An thơ mộng đến ruộng bậc thang Tây Bắc. Việt Nam có nền ẩm thực đặc sắc với phở, bánh mì, bún chả,... đồng thời là một trong những điểm đến du lịch hấp dẫn. Với tinh thần kiên cường, Việt Nam đã trải qua nhiều cuộc chiến đấu giành độc lập và hiện nay đang hội nhập quốc tế mạnh mẽ, đặc biệt trong các lĩnh vực xuất khẩu, công nghệ và du lịch."));
        dsQG.add(new Country("Russia", 143000000, "russia_100", "Nga là quốc gia rộng nhất thế giới, trải dài từ châu Âu sang châu Á, nổi bật với lịch sử phong phú, văn hóa đa dạng và tiềm lực quân sự mạnh mẽ. Đất nước này nổi tiếng với mùa đông khắc nghiệt, kiến trúc hoành tráng như Điện Kremlin, Nhà thờ Thánh Basil và di sản văn học vĩ đại với những tác phẩm của Dostoevsky, Tolstoy. Nga cũng có nền khoa học - công nghệ tiên tiến, từng dẫn đầu trong cuộc đua vũ trụ với sự kiện phóng vệ tinh Sputnik và đưa con người đầu tiên lên vũ trụ."));
        dsQG.add(new Country("United States", 341000000, "usa_100", "Hoa Kỳ là một cường quốc hàng đầu thế giới, nổi bật với nền kinh tế lớn nhất, quân đội mạnh mẽ và ảnh hưởng sâu rộng về chính trị, văn hóa, khoa học - công nghệ. Được mệnh danh là \"vùng đất của cơ hội\", Mỹ có sự đa dạng về sắc tộc, văn hóa và địa lý, từ những thành phố sôi động như New York, Los Angeles đến những kỳ quan thiên nhiên như Grand Canyon. Quốc gia này cũng là trung tâm của ngành công nghiệp giải trí với Hollywood, đồng thời dẫn đầu trong nhiều lĩnh vực như công nghệ (Apple, Google, Microsoft) và vũ trụ (NASA, SpaceX)."));
        dsQG.add(new Country("Japan", 125000000, "japan_100","Nhật Bản là một quốc đảo ở Đông Á, nổi tiếng với sự kết hợp hài hòa giữa truyền thống và hiện đại. Đất nước này có nền kinh tế lớn thứ ba thế giới, dẫn đầu trong các lĩnh vực công nghệ, ô tô và điện tử với những tập đoàn như Toyota, Sony và Nintendo.\n" +
                "\n" +
                "Nhật Bản sở hữu nền văn hóa phong phú với những di sản như trà đạo, kimono, sumo, và các lễ hội truyền thống. Ẩm thực Nhật Bản được yêu thích trên toàn cầu với sushi, ramen, tempura. Về cảnh quan, Nhật Bản có núi Phú Sĩ hùng vĩ, hoa anh đào rực rỡ vào mùa xuân và những thành phố hiện đại như Tokyo, Kyoto, Osaka."));
        dsQG.add(new Country("China", 1400000000, "china_100", "Trung Quốc là quốc gia đông dân nhất thế giới và có diện tích lớn thứ tư, nằm ở Đông Á. Đây là một trong những nền văn minh lâu đời nhất, với lịch sử kéo dài hơn 5.000 năm, gắn liền với những triều đại phong kiến, phát minh vĩ đại (giấy, thuốc súng, la bàn, nghề in) và một nền văn hóa đặc sắc."));
        ListView listView = findViewById(R.id.lvCacQuocGia);
        CountryAdapter adapter = new CountryAdapter(dsQG, this);
        listView.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}