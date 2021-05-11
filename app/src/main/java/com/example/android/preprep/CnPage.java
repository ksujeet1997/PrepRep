package com.example.android.preprep;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class CnPage extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.cn_page, container, false);

        view.findViewById(R.id.cn_button1).setOnClickListener(this);
        view.findViewById(R.id.cn_button2).setOnClickListener(this);
        view.findViewById(R.id.cn_button3).setOnClickListener(this);
        view.findViewById(R.id.cn_button4).setOnClickListener(this);
        view.findViewById(R.id.cn_button5).setOnClickListener(this);
        view.findViewById(R.id.cn_button6).setOnClickListener(this);
        view.findViewById(R.id.cn_button7).setOnClickListener(this);
        view.findViewById(R.id.cn_button8).setOnClickListener(this);
        view.findViewById(R.id.cn_button9).setOnClickListener(this);
        view.findViewById(R.id.cn_button10).setOnClickListener(this);
        view.findViewById(R.id.cn_button11).setOnClickListener(this);
        view.findViewById(R.id.cn_button12).setOnClickListener(this);
        view.findViewById(R.id.cn_button13).setOnClickListener(this);
        view.findViewById(R.id.cn_button14).setOnClickListener(this);
        view.findViewById(R.id.cn_button15).setOnClickListener(this);
        view.findViewById(R.id.cn_button16).setOnClickListener(this);
        view.findViewById(R.id.cn_button17).setOnClickListener(this);
        view.findViewById(R.id.cn_button18).setOnClickListener(this);
        view.findViewById(R.id.cn_button19).setOnClickListener(this);
        view.findViewById(R.id.cn_button20).setOnClickListener(this);
        view.findViewById(R.id.cn_button21).setOnClickListener(this);
        view.findViewById(R.id.cn_button22).setOnClickListener(this);
        view.findViewById(R.id.cn_button23).setOnClickListener(this);
        view.findViewById(R.id.cn_button24).setOnClickListener(this);
        view.findViewById(R.id.cn_button25).setOnClickListener(this);
        view.findViewById(R.id.cn_button26).setOnClickListener(this);


        return view;
        }

    @Override
    public void onClick(View view) {
        Webview wv;
        String str;
        Intent intent;
        switch (view.getId()) {
            case R.id.cn_button1:
                wv = new Webview();
                str = "https://www.cisco.com/c/en_in/solutions/enterprise-networks/what-is-computer-networking.html";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button2:
                wv = new Webview();
                str = "https://www.geeksforgeeks.org/whats-difference-internet-web/#:~:text=The%20Internet%20is%20a%20global,on%20top%20of%20that%20infrastructure.";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button3:
                wv = new Webview();
                str = "https://www.geeksforgeeks.org/types-transmission-media/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button4:
                wv = new Webview();
                str = "https://www.certiology.com/computing/computer-networking/network-devices.html";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button5:
                wv = new Webview();
                str = "https://www.geeksforgeeks.org/difference-between-unicast-broadcast-and-multicast-in-computer-network/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button6:
                wv = new Webview();
                str = "https://www.guru99.com/type-of-network-topology.html";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button7:
                wv = new Webview();
                str = "https://www.geeksforgeeks.org/difference-between-lan-man-and-wan/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button8:
                wv = new Webview();
                str = "https://www.forcepoint.com/cyber-edu/osi-model#:~:text=The%20OSI%20Model%20(Open%20Systems,between%20different%20products%20and%20software.";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button9:
                wv = new Webview();
                str = "https://www.imperva.com/learn/application-security/osi-model/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button10:
                wv = new Webview();
                str = "https://www.practicalnetworking.net/series/packet-traveling/packet-traveling/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button11:
                wv = new Webview();
                str = "https://www.educba.com/networking-commands/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button12:
                wv = new Webview();
                str = "https://www.geeksforgeeks.org/difference-between-http-and-https/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button13:
                wv = new Webview();
                str = "https://www.ssl.com/faqs/faq-what-is-ssl/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button14:
                wv = new Webview();
                str = "https://www.cloudflare.com/en-gb/learning/cdn/glossary/reverse-proxy/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button15:
                wv = new Webview();
                str = "https://www.nginx.com/resources/glossary/load-balancing/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button16:
                wv = new Webview();
                str = "https://www.redswitches.com/blog/difference-between-horizontal-vertical-scaling/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button17:
                wv = new Webview();
                str = "https://www.kaspersky.com/resource-center/definitions/what-is-a-vpn";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button18:
                wv = new Webview();
                str = "https://www.geeksforgeeks.org/difference-between-router-and-gateway/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button19:
                wv = new Webview();
                str = "https://www.javatpoint.com/multiplexing-in-computer-network";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button20:
                wv = new Webview();
                str = "https://www.tutorialspoint.com/wireless_communication/wireless_communication_bluetooth.htm";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button21:
                wv = new Webview();
                str = "https://www.checkpoint.com/cyber-hub/network-security/what-is-firewall/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button22:
                wv = new Webview();
                str = "https://www.javatpoint.com/types-of-firewall";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button23:
                wv = new Webview();
                str = "https://www.geeksforgeeks.org/basic-network-attacks-in-computer-network/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button24:
                wv = new Webview();
                str = "https://www.geeksforgeeks.org/deniel-service-prevention/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button25:
                wv = new Webview();
                str = "https://www.geeksforgeeks.org/digital-signatures-certificates/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.cn_button26:
                wv = new Webview();
                str = "https://www.geeksforgeeks.org/types-of-email-attacks/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;
        }

    }
}
