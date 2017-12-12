package ch.playtube.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

import ch.playtube.R;
import ch.playtube.database.YouTubeSqlDb;
import ch.playtube.interfaces.ItemEventsListener;
import ch.playtube.model.YouTubeVideo;
import ch.playtube.utils.Config;

public class VideosAdapter extends RecyclerView.Adapter<VideosAdapter.ViewHolder>
        implements View.OnClickListener {

    private static final String TAG = "Play!Tube";
    private Context context;
    private final List<YouTubeVideo> list;
    private boolean[] itemChecked;
    private ItemEventsListener<YouTubeVideo> itemEventsListener;

    public VideosAdapter(Context context, List<YouTubeVideo> list) {
        super();
        this.list = list;
        this.context = context;
        this.itemChecked = new boolean[(int) Config.NUMBER_OF_VIDEOS_RETURNED];
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.video_item, null);
        view.setOnClickListener(this);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        final YouTubeVideo video = list.get(position);
        itemChecked[position] = YouTubeSqlDb.getInstance().videos(YouTubeSqlDb.VIDEOS_TYPE.FAVORITE).checkIfExists(video.getId());

        Picasso.with(context).load(video.getThumbnailURL()).into(holder.thumbnail);
        holder.title.setText(video.getTitle());
        holder.duration.setText(video.getDuration());
        holder.viewCount.setText(video.getViewCount());
        holder.itemView.setTag(video);
    }

    @Override
    public int getItemCount() {
        return (null != list ? list.size() : 0);
    }

    @Override
    public void onClick(View v) {
        if (itemEventsListener != null) {
            YouTubeVideo item = (YouTubeVideo) v.getTag();
            itemEventsListener.onItemClick(item);
        }
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView thumbnail;
        TextView title;
        TextView duration;
        TextView viewCount;

        public ViewHolder(View itemView) {
            super(itemView);
            thumbnail = itemView.findViewById(R.id.video_thumbnail);
            title = itemView.findViewById(R.id.video_title);
            duration = itemView.findViewById(R.id.video_duration);
            viewCount = itemView.findViewById(R.id.views_number);
        }
    }

    public void setOnItemEventsListener(ItemEventsListener<YouTubeVideo> listener) {
        itemEventsListener = listener;
    }
}
