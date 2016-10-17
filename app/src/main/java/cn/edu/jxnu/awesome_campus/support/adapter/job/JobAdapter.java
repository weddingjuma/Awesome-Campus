package cn.edu.jxnu.awesome_campus.support.adapter.job;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import cn.edu.jxnu.awesome_campus.InitApp;
import cn.edu.jxnu.awesome_campus.R;
import cn.edu.jxnu.awesome_campus.model.job.JobBean;
import cn.edu.jxnu.awesome_campus.model.job.Post;
import cn.edu.jxnu.awesome_campus.support.recycle.NormalSwipeAdapter;

/**
 * Created by yzr on 16/10/16.
 */

public class JobAdapter extends NormalSwipeAdapter<Post> {


    public JobAdapter(List<Post >list) {
        super(list);
    }

    @Override
    public RecyclerView.ViewHolder createNormalViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_job_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void bindNormalViewHolder(final RecyclerView.ViewHolder viewHolder, final int position) {
        ViewHolder vh=(ViewHolder)viewHolder;
        Post post=getItem(position);
        vh.title.setText(post.getUserId());
        vh.date.setText(post.getRecruitmentTime());
        vh.title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }

    private static class ViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        TextView date;
        public ViewHolder(View itemView) {
            super(itemView);
            title=(TextView)itemView.findViewById(R.id.job_title);
            date=(TextView)itemView.findViewById(R.id.job_date);
        }
    }


}
