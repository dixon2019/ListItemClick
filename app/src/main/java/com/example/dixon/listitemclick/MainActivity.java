package com.example.dixon.listitemclick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView mLV;
    private String[] name={"JingDong","TianMao","Sina_Weibo","QQ","QQ_DiZhu","UC_Browser"};
    private int[] icon={R.drawable.jd,R.drawable.tmall,R.drawable.sina,R.drawable.qq,R.drawable.qq_dizhu,R.drawable.uc};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLV=(ListView)findViewById(R.id.lv);
        mLV.setAdapter(new myAdapter());
        mLV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Toast.makeText(MainActivity.this,"这是京东商城",Toast.LENGTH_LONG).show();
                        break;
                    case 1:
                        Toast.makeText(MainActivity.this,"这是天猫商城",Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        Toast.makeText(MainActivity.this,"这是新浪微博",Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        Toast.makeText(MainActivity.this,"这是QQ聊天",Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        Toast.makeText(MainActivity.this,"这是QQ斗地主",Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        Toast.makeText(MainActivity.this,"这是UC浏览器",Toast.LENGTH_LONG).show();
                        break;
                }
            }
        });
    }

    class myAdapter extends BaseAdapter{
        @Override
        public int getCount(){
            return name.length;
        }
        @Override
        public Object getItem(int position){
            return name[position];
        }
        @Override
        public long getItemId(int position){
            return position;
        }
        public View getView(int position, View convertView, ViewGroup parent){
            View mView=View.inflate(MainActivity.this,R.layout.item_layout,null);
            ImageView mIV=mView.findViewById(R.id.iv);
            TextView mTV=mView.findViewById(R.id.tv);
            mIV.setBackgroundResource(icon[position]);
            mTV.setText(name[position]);
            return mView;
        }
    }
}
