package com.mai.airwi.bestnbaapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.IOException;
import java.net.URLEncoder;
import java.util.*;

import static com.mai.airwi.bestnbaapp.SearchFragment.read;

/*
 * Created by airwi on 4/25/2020.
 */

public class AnalyzeFragment extends Fragment {

    String server_url = "http://58a7402c.ngrok.io/";
    String username = "JimMango";

    String response;
    List<String> list;

    TextView statDisplay;

    Button nextButton;
    Button prevButton;
    Button refreshButton;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_analyze, container, false);

    statDisplay = (TextView)view.findViewById((R.id.statDisplay));
        nextButton = (Button)view.findViewById(R.id.nextButton);
        prevButton = (Button) view.findViewById(R.id.prevButton);
        refreshButton = (Button) view.findViewById(R.id.refresh);


        // FIXME: load data from intent
        //response = getIntent().getExtras().getString("response");

        /*
        // encapsulate data into object
        list = new ArrayList<String>();
        list = read(response);
        Player player = new Player(list);
*/

        return view;
    }
}
