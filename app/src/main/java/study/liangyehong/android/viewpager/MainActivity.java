package study.liangyehong.android.viewpager;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager_one;
    private ArrayList<View> aList;
    private MyPagerAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager_one = (ViewPager) findViewById(R.id.viewPager_one);
        aList = new ArrayList<View>();
        LayoutInflater li = getLayoutInflater();
        aList.add(li.inflate((R.layout.view_one),null,false));
        aList.add(li.inflate((R.layout.view_two),null,false));
        aList.add(li.inflate((R.layout.view_three),null,false));
        mAdapter = new MyPagerAdapter(aList);
        viewPager_one.setAdapter(mAdapter);
    }
}
