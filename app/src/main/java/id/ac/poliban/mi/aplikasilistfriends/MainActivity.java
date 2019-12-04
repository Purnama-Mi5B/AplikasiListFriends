package id.ac.poliban.mi.aplikasilistfriends;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView lvFriends;
    private String[] namateman = new String[]{
            "Ahmad Irfan", "Akhmad Indrawan", "Andre Ramadhandy",
            "Andri Sudarman", "Diana", "Gina Melati Addini",
            "Lidya Lusiana", "Iffa Nafiatunnisa",
            "Radiansyah", "M. Rizky Maulana", "Rafi'i Hidayat Noor",
            "Ratu Hana Yunita", "Sarwan", "RenaldyKambayu", "Yunita Rahmah",
            "Thasya Ismyanti Novianda", "Magfirah Maulidya", "Taufan Ryanda Utama", "Melisa Arianie",
            "Radhika Rahmadani", "Agustya Fazriani", "Muhammad Ade Setiawan", "Rezal Alfansyah"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Friend List 5B MI");
        lvFriends = (ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, namateman);

        lvFriends.setAdapter(adapter);

        lvFriends.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "Kamu mengklik : " + namateman[position], Toast.LENGTH_SHORT).show();

            }
        });
    }}

