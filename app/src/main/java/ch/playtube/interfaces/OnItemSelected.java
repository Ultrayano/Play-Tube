package ch.playtube.interfaces;

import java.util.List;

import ch.playtube.model.YouTubeVideo;

public interface OnItemSelected {
    void onVideoSelected(YouTubeVideo video);

    void onPlaylistSelected(List<YouTubeVideo> playlist, int position);
}
