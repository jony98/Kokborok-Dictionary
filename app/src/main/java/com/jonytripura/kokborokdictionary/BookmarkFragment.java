package com.jonytripura.kokborokdictionary;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;


public class BookmarkFragment extends Fragment {

    private  FragmentListener listener;
    String value= "Jony Tripura";
    public BookmarkFragment() {

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_bookmark, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        Button myButton = view.findViewById(R.id.goto_details);
//        myButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(listener!=null)
//                    listener.onItemClick(value);
//            }
//        });

             ListView bookmarkList = view.findViewById(R.id.bookmarkList);
             BookmarkAdapter adapter = new BookmarkAdapter(getActivity(),getListOfWords());
             bookmarkList.setAdapter(adapter);
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

    public void setFragmentListener(FragmentListener listener){

        this.listener = listener;
    }

    String[] getListOfWords(){
        String[]source = new String[]{
                "a","b","c", "d","e","f", "g", "h", "i","j","k","l","m","n", "o","p", "q","s", "t","u","v","w","x","y","z"


        };
        return  source;
    }

}
