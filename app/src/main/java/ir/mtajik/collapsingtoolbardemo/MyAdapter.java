package ir.mtajik.collapsingtoolbardemo;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class MyAdapter <T> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {


    private Context context;
    private List<T> items;

    public  MyAdapter(Context context, List<T> items) {

        this.items = items;
        this.context = context;

    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.view_holder_item, parent,
                false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

        MyViewHolder viewHolder = (MyViewHolder) holder;

        viewHolder.textView.setText(items.get(position).toString());

    }

    @Override
    public int getItemCount() {
        return  items == null ? 0 : items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

       public TextView textView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.textView);
        }
    }


}
