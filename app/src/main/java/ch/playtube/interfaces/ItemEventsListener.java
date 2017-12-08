package ch.playtube.interfaces;

public interface ItemEventsListener<Model> {

    void onItemClick(Model model); //handle click on a row (video or playlist)
}
