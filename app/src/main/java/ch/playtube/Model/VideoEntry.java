package ch.playtube.Model;

/**
 * Created by ue70633 on 21.11.2017.
 */

public class VideoEntry {
    private final String text;
    private final String videoId;
    private final String url;

    public VideoEntry(String text, String videoId, String url) {
        this.text = text;
        this.videoId = videoId;
        this.url = url;
    }
}
