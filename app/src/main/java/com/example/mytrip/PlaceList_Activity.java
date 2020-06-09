package com.example.mytrip;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class PlaceList_Activity extends Activity {
    private ListView listView;
    private ListViewAdapter adapter;
    private TextView tripplace;
    private int[] img = {R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.one,R.drawable.two,R.drawable.three,R.drawable.one,R.drawable.two,R.drawable.three};
    private String[] Title = {"정준일 바램", "윤종신 좋니","러블리즈 아츄","정준일 바램", "윤종신 좋니","러블리즈 아츄","정준일 바램", "윤종신 좋니","러블리즈 아츄"};
    private String[] Context = {"ㅋㅋㅋㅋㅋㅋㅋ","아ㅏㅏㅏㅏㅏ","호ㅗㅗㅗ","ㅋㅋㅋㅋㅋㅋㅋ","아ㅏㅏㅏㅏㅏ","호ㅗㅗㅗ","ㅋㅋㅋㅋㅋㅋㅋ","아ㅏㅏㅏㅏㅏ","호ㅗㅗㅗ"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        //변수초기화
        adapter=new ListViewAdapter();
        listView=(ListView)findViewById(R.id.List_view);

        //어뎁터 할당
        listView.setAdapter(adapter);

        //adapter를 통한 값 전달
        for (int i=0;i<img.length;i++) {
            adapter.addVO(ContextCompat.getDrawable(this,img[i]),Title[i],Context[i]);
        }

//        listView.setOnItemClickListener(new ListView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> arg0, View)
//        };


        //리스트뷰의 아이템을 클릭시 해당 아이템의 문자열을 가져오기 위한 처리
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView,
                                    View view, int position, long l) {

//                Intent intent = new Intent(PlaceList_Activity.this, AddNewTripActivity.class);
//
//                intent.putExtra("ID", "list");
//
//
//                setResult(i,intent);
//                finish();
//                startActivity(intent);


//                int check_position = listView.getCheckedItemPosition();
//                Object title = (Object)adapterView.getAdapter().getItem(i);
//
//                tripplace.setText((Integer) title);
//
//                //클릭한 아이템의 문자열을 가져옴
//                String title = (String)adapterView.getItemAtPosition(position);
//
//                //텍스트뷰에 출력
//                tripplace.setText(title);
            }
        });


    }



}
