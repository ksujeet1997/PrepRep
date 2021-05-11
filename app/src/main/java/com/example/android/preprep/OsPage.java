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

public class OsPage extends Fragment implements View.OnClickListener{

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_os_page, container, false);
        view.findViewById(R.id.os_button1).setOnClickListener(this);
        view.findViewById(R.id.os_button2).setOnClickListener(this);
        view.findViewById(R.id.os_button3).setOnClickListener(this);
        view.findViewById(R.id.os_button4).setOnClickListener(this);
        view.findViewById(R.id.os_button5).setOnClickListener(this);
        view.findViewById(R.id.os_button6).setOnClickListener(this);
        view.findViewById(R.id.os_button7).setOnClickListener(this);
        view.findViewById(R.id.os_button8).setOnClickListener(this);
        view.findViewById(R.id.os_button9).setOnClickListener(this);
        view.findViewById(R.id.os_button10).setOnClickListener(this);
        view.findViewById(R.id.os_button11).setOnClickListener(this);
        view.findViewById(R.id.os_button12).setOnClickListener(this);
        view.findViewById(R.id.os_button13).setOnClickListener(this);
        view.findViewById(R.id.os_button14).setOnClickListener(this);
        view.findViewById(R.id.os_button15).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        Webview wv = new Webview();
        String str;
        Intent intent;
        switch (view.getId()) {
            case R.id.os_button1:
                str = "https://www.geeksforgeeks.org/introduction-of-operating-system-set-1/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.os_button2:
                str = "https://www.geeksforgeeks.org/types-of-operating-systems/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.os_button3:
                str = "https://www.guru99.com/difference-between-rom-ram.html";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.os_button4:
                str = "https://www.guru99.com/sram-vs-dram-difference.html";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.os_button5:
                str = "https://pediaa.com/what-is-the-difference-between-prom-eprom-and-eeprom/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.os_button6:
                str = "https://www.tutorialspoint.com/difference-between-virtualization-and-containerization";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.os_button7:
                str = "https://www.howtogeek.com/56958/htg-explains-how-uefi-will-replace-the-bios/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.os_button8:
                str = "https://www.howtogeek.com/193669/whats-the-difference-between-gpt-and-mbr-when-partitioning-a-drive/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.os_button9:
                str = "https://www.geeksforgeeks.org/difference-between-multitasking-multithreading-and-multiprocessing/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.os_button10:
                str = "https://stackoverflow.com/questions/4537850/what-is-difference-between-monolithic-and-micro-kernel";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.os_button11:
                str = "https://www.geeksforgeeks.org/difference-between-program-and-process/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;


            case R.id.os_button12:
                str = "https://www.geeksforgeeks.org/states-of-a-process-in-operating-systems/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.os_button13:
                str = "https://www.geeksforgeeks.org/process-table-and-process-control-block-pcb/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.os_button14:
                str = "https://www.geeksforgeeks.org/difference-between-process-and-thread/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.os_button15:
                str = "https://www.tutorialspoint.com/operating_system/os_process_scheduling.htm";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

        }
    }
}