package ch.playtube.fragments.tabs;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import java.util.List;

import ch.playtube.Model.VideoEntry;
import ch.playtube.R;
import ch.playtube.Controller.HomeController;


public class Tab1Fragment extends Fragment {

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (container == null) {

            return null;
        }
        HomeController homeController = new HomeController();
        List<VideoEntry> youtubeVideos =  homeController.getList();




        return (LinearLayout)inflater.inflate(R.layout.tab_frag1_layout, container, false);
    }
}