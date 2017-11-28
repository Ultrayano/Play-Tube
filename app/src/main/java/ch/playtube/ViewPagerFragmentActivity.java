package ch.playtube;

import java.util.List;
import java.util.Vector;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.support.v7.widget.Toolbar;
import android.widget.ImageButton;

import ch.playtube.fragments.tabs.Tab1Fragment;
import ch.playtube.fragments.tabs.Tab2Fragment;
import ch.playtube.fragments.tabs.Tab3Fragment;

public class ViewPagerFragmentActivity extends AppCompatActivity {
    /**
     * maintains the pager adapter
     */
    PagerAdapter mPagerAdapter;
    EditText editInput;
    ImageButton home_page;
    ImageButton second_page;
    ImageButton third_page;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.setContentView(R.layout.viewpager_layout);
        //initialize the pager
        this.initialisePaging();

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }


    /**
     * Initialise the fragments to be paged
     */
    private void initialisePaging() {

        List<Fragment> fragments = new Vector<Fragment>();
        fragments.add(Fragment.instantiate(this, Tab1Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, Tab2Fragment.class.getName()));
        fragments.add(Fragment.instantiate(this, Tab3Fragment.class.getName()));
        this.mPagerAdapter = new PagerAdapter(super.getSupportFragmentManager(), fragments);
        //
        ViewPager pager = (ViewPager) super.findViewById(R.id.viewpager);
        pager.setAdapter(this.mPagerAdapter);
    }

}