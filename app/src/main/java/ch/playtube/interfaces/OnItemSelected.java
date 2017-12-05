package ch.playtube.interfaces;

import java.util.List;

import ch.playtube.model.YouTubeVideo;

/**
 * Created by smedic on 5.3.17..
 */

public interface OnItemSelected {
    void onVideoSelected(YouTubeVideo video);

    void onPlaylistSelected(List<YouTubeVideo> playlist, int position);
}
