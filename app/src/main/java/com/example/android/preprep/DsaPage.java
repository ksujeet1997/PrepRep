package com.example.android.preprep;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class DsaPage extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_dsa_page, container, false);

        view.findViewById(R.id.ds_button1).setOnClickListener(this);
        view.findViewById(R.id.ds_button2).setOnClickListener(this);
        view.findViewById(R.id.ds_button3).setOnClickListener(this);
        view.findViewById(R.id.ds_button4).setOnClickListener(this);
        view.findViewById(R.id.ds_button5).setOnClickListener(this);
        view.findViewById(R.id.ds_button6).setOnClickListener(this);
        view.findViewById(R.id.ds_button7).setOnClickListener(this);
        view.findViewById(R.id.ds_button8).setOnClickListener(this);
        view.findViewById(R.id.ds_button9).setOnClickListener(this);
        view.findViewById(R.id.ds_button10).setOnClickListener(this);
        view.findViewById(R.id.ds_button11).setOnClickListener(this);
        view.findViewById(R.id.ds_button12).setOnClickListener(this);
        view.findViewById(R.id.ds_button13).setOnClickListener(this);
        view.findViewById(R.id.ds_button14).setOnClickListener(this);
        view.findViewById(R.id.ds_button15).setOnClickListener(this);
        view.findViewById(R.id.ds_button16).setOnClickListener(this);
        view.findViewById(R.id.ds_button17).setOnClickListener(this);
        view.findViewById(R.id.ds_button18).setOnClickListener(this);
        view.findViewById(R.id.ds_button19).setOnClickListener(this);
        view.findViewById(R.id.ds_button20).setOnClickListener(this);
        view.findViewById(R.id.ds_button21).setOnClickListener(this);
        view.findViewById(R.id.ds_button22).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        Webview wv = new Webview();
        String str;
        Intent intent;
        switch (view.getId()) {
            case R.id.ds_button1:
                str = "https://www.javatpoint.com/data-structure-algorithm";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button2:
                str = "https://www.javatpoint.com/data-structure-pointer";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button3:
                str = "https://www.geeksforgeeks.org/introduction-to-arrays/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button4:
                str = "https://www.javatpoint.com/data-structure-2d-array";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button5:
                str = "https://www.programiz.com/dsa/linked-list";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button6:
                str = "https://www.javatpoint.com/singly-linked-list";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button7:
                str = "https://www.javatpoint.com/doubly-linked-list";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button8:
                str = "https://www.programiz.com/dsa/stack";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button9:
                str = "https://www.programiz.com/dsa/queue";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button10:
                str = "https://www.programiz.com/dsa/types-of-queue";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button11:
                str = "https://www.programiz.com/dsa/trees";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button12:
                str = "https://www.geeksforgeeks.org/binary-tree-data-structure/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button13:
                str = "https://www.javatpoint.com/avl-tree";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button14:
                str = "https://www.programiz.com/dsa/b-tree";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button15:
                str = "https://www.javatpoint.com/b-plus-tree";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button16:
                str = "https://www.geeksforgeeks.org/heap-data-structure/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button17:
                str = "https://www.geeksforgeeks.org/hashing-data-structure/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button18:
                str = "https://www.programiz.com/dsa/graph";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button19:
                str = "https://www.programiz.com/dsa/spanning-tree-and-minimum-spanning-tree";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button20:
                str = "https://www.javatpoint.com/breadth-first-search-algorithm";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button21:
                str = "https://www.programiz.com/dsa/graph-dfs";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.ds_button22:
                str = "https://www.programiz.com/dsa/bellman-ford-algorithm";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;
        }

    }
}