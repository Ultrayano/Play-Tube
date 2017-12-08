package ch.playtube.utils;

import com.google.api.services.youtube.YouTubeScopes;

/**
 * Shared class used by every sample. Contains methods for authorizing a user and caching credentials.
 */
public class Auth {

    public static final String[] SCOPES = { YouTubeScopes.YOUTUBE};
}