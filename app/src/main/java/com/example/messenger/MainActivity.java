package com.example.messenger;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.messenger.adapters.midlistadapter;
import com.example.messenger.adapters.toplistadapter;
import com.example.messenger.models.midlistmodel;
import com.example.messenger.models.toplistmodel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerTop,recyclerMid;
    LinearLayoutManager layoutManagerTop,layoutManagerMid;
    List<toplistmodel>topList;
    List<midlistmodel>midList;
    toplistadapter topadapter;
    midlistadapter midadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //     ADAPTER COMPONENTS FOR TOP RECYCLERVİEW (HORİZONTAL)
        topList = new ArrayList<>();
        topadapter = new toplistadapter(topList);
        recyclerTop = findViewById(R.id.TopRecyclerview);
        layoutManagerTop = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);

        //     ADAPTER COMPONENTS FOR MİD RECYCLERVİEW (VERTİCAL)
        midList = new ArrayList<>();
        midadapter = new midlistadapter(midList);
        recyclerMid = findViewById(R.id.MidRecyclerview);
        layoutManagerMid = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false);

        // LİST ADD İTEMS (TOP HORİZONTAL)
        topList.add(new toplistmodel(1,"All",true));
        topList.add(new toplistmodel(2,"Work",false));
        topList.add(new toplistmodel(3,"Favorite",false));
        topList.add(new toplistmodel(4,"Love",false));
        topList.add(new toplistmodel(4,"Sports",false));
        topList.add(new toplistmodel(4,"Books",false));

        //LİST ADD İTEMS (MİD VERTİCAL)

        midList.add(new midlistmodel(1,R.drawable.face,"Carla swain","1 min",
                "Hi john,call me back please..","1",true));
        midList.add(new midlistmodel(2,R.drawable.face2,"john style","1 min",
                "i want to play counters strike global offensive,and you ? Come!!","3",true));
        midList.add(new midlistmodel(3,R.drawable.face3,"Chris HW.","13 min",
                "Not,i am not Thor.This is mythology and movie my friend..","4",false));
        midList.add(new midlistmodel(4,R.drawable.face4,"Maria don","14 min",
                "Okey,see you later","1",false));
        midList.add(new midlistmodel(5,R.drawable.face5,"Anthony lev.","14 min",
                "I'm going to France with my familiy,can you feed my cat ?","2",true));
        midList.add(new midlistmodel(3,R.drawable.face6,"lisa Connor","32 min",
                "Okey","0",false));


        // TOP RECYCLERVİEW SETTİNGS SET METHOD
        setRecyclerSettingsTop(recyclerTop,topList,layoutManagerTop,topadapter);
        setRecyclerSettingsMid(recyclerMid,midList,layoutManagerMid,midadapter);
    }

    public void setRecyclerSettingsTop (RecyclerView recyclerView, List<toplistmodel>list,
                                        LinearLayoutManager manager,toplistadapter adapter){
        adapter = new toplistadapter(list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
    }

    public void setRecyclerSettingsMid (RecyclerView recyclerView, List<midlistmodel>list,
                                        LinearLayoutManager manager,midlistadapter adapter){
        adapter = new midlistadapter(list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(manager);
    }

}