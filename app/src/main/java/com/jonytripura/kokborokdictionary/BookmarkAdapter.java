package com.jonytripura.kokborokdictionary;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class BookmarkAdapter extends BaseAdapter {

    Context mContext;
    String[] mSource;

    public BookmarkAdapter(Context context, String[]source ) {
        this.mContext =context;
        this.mSource = source;

    }

    @Override
    public int getCount() {
        return mSource.length;
    }

    @Override
    public Object getItem(int position) {
        return mSource[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        ViewHolder viewHolder;
        if(view==null){
            viewHolder= new ViewHolder();
            view = LayoutInflater.from(mContext).inflate(R.layout.bookmark_layout, viewGroup, false);
            viewHolder.textView =  view.findViewById(R.id.textBookmark);
            viewHolder.btnDelete =  view.findViewById(R.id.btnDelete);
            view.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) view.getTag();

        }

        viewHolder.textView.setText(mSource[position]);
        return view;
    }

    class ViewHolder{

        TextView textView;
        ImageView btnDelete;
    }
}
