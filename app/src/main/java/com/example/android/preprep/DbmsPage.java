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
import android.widget.Button;

import com.example.android.preprep.R;

public class DbmsPage extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_dbms_page, container, false);
        view.findViewById(R.id.db_button1).setOnClickListener(this);
        view.findViewById(R.id.db_button2).setOnClickListener(this);
        view.findViewById(R.id.db_button3).setOnClickListener(this);
        view.findViewById(R.id.db_button4).setOnClickListener(this);
        view.findViewById(R.id.db_button5).setOnClickListener(this);
        view.findViewById(R.id.db_button6).setOnClickListener(this);
        view.findViewById(R.id.db_button7).setOnClickListener(this);
        view.findViewById(R.id.db_button8).setOnClickListener(this);
        view.findViewById(R.id.db_button9).setOnClickListener(this);
        view.findViewById(R.id.db_button10).setOnClickListener(this);
        view.findViewById(R.id.db_button11).setOnClickListener(this);
        view.findViewById(R.id.db_button12).setOnClickListener(this);
        view.findViewById(R.id.db_button13).setOnClickListener(this);
        view.findViewById(R.id.db_button14).setOnClickListener(this);
        view.findViewById(R.id.db_button15).setOnClickListener(this);
        view.findViewById(R.id.db_button16).setOnClickListener(this);
        view.findViewById(R.id.db_button17).setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View view) {
        Webview wv;
        String str;
        Intent intent;
        switch (view.getId()) {
            case R.id.db_button1:
                wv = new Webview();
                str = "https://www.javatpoint.com/what-is-database";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.db_button2:

                str = "https://www.guru99.com/what-is-dbms.html";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.db_button3:
                wv = new Webview();
                str = "https://www.geeksforgeeks.org/need-for-dbms/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.db_button4:
                wv = new Webview();
                str = "https://www.javatpoint.com/dbms-vs-files-system";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.db_button5:
                wv = new Webview();
                str = "https://practice.geeksforgeeks.org/problems/what-are-the-functions-of-a-dba";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.db_button6:
                wv = new Webview();
                str = "https://www.geeksforgeeks.org/difference-between-two-tier-and-three-tier-database-architecture/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.db_button7:
                wv = new Webview();
                str = "https://whatisdbms.com/instances-schema-and-sub-schema-in-dbms-with-examples/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.db_button8:
                wv = new Webview();
                str = "https://www.geeksforgeeks.org/sql-ddl-dql-dml-dcl-tcl-commands/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.db_button9:
                wv = new Webview();
                str = "https://afteracademy.com/blog/what-is-data-abstraction-in-dbms-and-what-are-its-three-levels";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.db_button11:
                wv = new Webview();
                str = "https://www.tutorialspoint.com/Referential-Integrity-Rule-in-RDBMS";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.db_button10:
                wv = new Webview();
                str = "https://afteracademy.com/blog/what-is-data-abstraction-in-dbms-and-what-are-its-three-levels";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.db_button12:
                wv = new Webview();
                str = "https://www.quora.com/How-does-a-relational-DBMS-internally-store-its-data-In-what-type-of-data-structure-How-does-it-offer-the-rapid-retrieval-without-loading-the-entire-database-into-the-main-memory-I-have-heard-many-DBMS-use-B-trees";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.db_button13:
                wv = new Webview();
                str = "https://www.relationaldbdesign.com/database-design/module6/three-relationship-types.php";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.db_button14:
                wv = new Webview();
                str = "https://www.geeksforgeeks.org/types-of-keys-in-relational-model-candidate-super-primary-alternate-and-foreign/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.db_button15:
                wv = new Webview();
                str = "https://www.tutorialspoint.com/dbms/dbms_data_schemas.htm";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.db_button16:
                wv = new Webview();
                str = "https://www.geeksforgeeks.org/mapping-from-er-model-to-relational-model/";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;

            case R.id.db_button17:
                wv = new Webview();
                str = "https://www.guru99.com/relational-algebra-dbms.html";
                intent = new Intent(getActivity(), Webview.class);
                intent.putExtra("link", str);
                startActivity(intent);
                break;
        }
    }
}
