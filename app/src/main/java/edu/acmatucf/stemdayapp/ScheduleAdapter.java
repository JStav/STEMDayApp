package edu.acmatucf.stemdayapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import edu.acmatucf.stemdayapp.schedule.ISchedule;

public class ScheduleAdapter extends RecyclerView.Adapter<ScheduleViewHolder> {

    private Context context;
    private ISchedule schedule;

    public void setSchedule(ISchedule schedule){
        this.schedule = schedule;

        notifyDataSetChanged();

    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public ScheduleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.schedule_item, parent, false);

        ScheduleViewHolder vh = new ScheduleViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ScheduleViewHolder holder, final int position){
        holder.setScheduleItem(schedule.get(position));
        TextView mTextView = (TextView) holder.itemView.findViewById(R.id.scheduleTextView);
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                ScheduleItem mScheduleItem = schedule.get(position);
//                Intent intent = new Intent(context, MapsActivity.class);
//                intent.putExtra("ScheduleItem", mScheduleItem);
//                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount(){
        return schedule == null ? 0 : schedule.size();
    }


}
