package com.jonytripura.kokborokdictionary;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class DictionaryFragment extends Fragment {

    private  FragmentListener listener;
    private  String value= "Jony Tripura";
    public DictionaryFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_dictionary, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        Button myButton = view.findViewById(R.id.goto_details);
//        myButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(listener!=null)
//                listener.onItemClick(value);
//            }
//        });

        ListView dictionaryList = view.findViewById(R.id.dictionaryList);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(getContext(),android.R.layout.simple_list_item_1,getListOfWords());
        dictionaryList.setAdapter(adapter);
        dictionaryList.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(listener!=null)
                    listener.onItemClick(getListOfWords()[position]);
            }

        });

    }
    String[] getListOfWords(){
        String[]source = new String[]{
            "a","b","c", "d","e","f", "g", "h", "i","j","k","l","m","n", "o","p", "q","s", "t","u","v","w","x","y","z"


        };
        return  source;
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
}
