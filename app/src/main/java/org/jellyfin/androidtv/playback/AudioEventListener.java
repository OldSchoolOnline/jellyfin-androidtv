package org.jellyfin.androidtv.playback;

import org.jellyfin.apiclient.model.dto.BaseItemDto;

/**
 * Created by Eric on 12/1/2015.
 */
public class AudioEventListener {
    public void onPlaybackStateChange(PlaybackController.PlaybackState newState, BaseItemDto currentItem) {}
    public void onProgress(long pos) {}
    public void onQueueStatusChanged(boolean hasQueue) {}
}
