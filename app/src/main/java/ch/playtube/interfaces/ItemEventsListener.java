package ch.playtube.interfaces;


/**
 * Created by smedic on 9.2.17..
 */

public interface ItemEventsListener<Model> {

    void onItemClick(Model model); //handle click on a row (video or playlist)
}
