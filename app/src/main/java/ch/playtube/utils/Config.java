package ch.playtube.utils;

public final class Config {

    public static final boolean DEBUG = false;

    public static final String SUGGESTIONS_URL = "http://suggestqueries.google.com/complete/search?client=youtube&ds=yt&q=";
    public static final String YOUTUBE_BASE_URL = "http://youtube.com/watch?v=";
    public static final String YOUTUBE_TYPE = "YT_MEDIA_TYPE";
    public static final String YOUTUBE_TYPE_VIDEO = "YT_VIDEO";
    public static final String YOUTUBE_TYPE_PLAYLIST= "YT_PLAYLIST";
    public static final String YOUTUBE_TYPE_PLAYLIST_VIDEO_POS = "YT_PLAYLIST_VIDEO_POS";

    public static final String YOUTUBE_API_KEY = "AIzaSyCy24NuwmEScFFcKQv7rx-8GvN7KGwHcQI";

    public static final long NUMBER_OF_VIDEOS_RETURNED = 30; //due to YouTube API rules - MAX 50

}