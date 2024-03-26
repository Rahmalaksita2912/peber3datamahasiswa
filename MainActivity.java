package com.example.datamahasiswa;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private List adapter;
    private List<dataclass> dataclassList;
    private List<dataclass> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);


        dataclassList = new ArrayList<>();
        dataclassList.add(new dataclass("Nama: Abmi Sukma Edri", "Nim: 1205012o0341", R.drawable.abmi));
        dataclassList.add(new dataclass("Nama: Ahmad Kurniawan", "Nim: 12250111514", R.drawable.adit));
        dataclassList.add(new dataclass("Nama: Aufa Hajati", "Nim: 12250120338", R.drawable.aufa));
        dataclassList.add(new dataclass("Nama: Daffa Finanda", "Nim: 12250111603", R.drawable.dafin));
        dataclassList.add(new dataclass("Nama: Daffa Ikhwan Nurfauzan", "Nim: 12250110979", R.drawable.daffa));
        dataclassList.add(new dataclass("Nama: Dwi Jelita Adhliyah", "Nim: 12250120331", R.drawable.jelita));
        dataclassList.add(new dataclass("Nama: Dwi Mahdini", "Nim: 12250111298", R.drawable.mahdi));
        dataclassList.add(new dataclass("Nama: Fajri", "Nim: 1225011082", R.drawable.fajri));
        dataclassList.add(new dataclass("Nama: Farras Lathief", "Nim: 12250111328", R.drawable.faras));
        dataclassList.add(new dataclass("Nama: Gilang Ramadhan Indra", "Nim: 12250111323", R.drawable.gilang));
        dataclassList.add(new dataclass("Nama: Hafidz Alhadid Rahman", "Nim: 12250111794", R.drawable.hafiz));
        dataclassList.add(new dataclass("Nama: Haritsah Naufaldy", "Nim: 12250110361", R.drawable.aldy));
        dataclassList.add(new dataclass("Nama: M. Nabil Dawami", "Nim: 12250111527", R.drawable.nabil));
        dataclassList.add(new dataclass("Nama: M. Zaki Erbay Syas", "Nim: 12250111134", R.drawable.zaki));
        dataclassList.add(new dataclass("Nama: Muhammad Aditya Rinaldi", "Nim: 12250111048", R.drawable.adit));
        dataclassList.add(new dataclass("Nama: Muhammad Dhimas Hadid", "Nim: 12250111231", R.drawable.dimas));
        dataclassList.add(new dataclass("Nama: Muhammad Rafly Wirayudha", "Nim: 12250111489", R.drawable.rafly));
        dataclassList.add(new dataclass("Nama: Nurika Dwi Wahyuni", "Nim: 12250120360", R.drawable.nurika));
        dataclassList.add(new dataclass("Nama: Ogya Secio Noegroho.s", "Nim: 12250111346", R.drawable.ogik));
        dataclassList.add(new dataclass("Nama: Rahma Laksita", "Nim:12250124357", R.drawable.rahma));
        dataclassList.add(new dataclass("Nama: Surya Hidayatullah Firdaus", "Nim: 12250111759", R.drawable.surya));

        items = new ArrayList<>(dataclassList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        classmahasiswa classmahasiswa = new classmahasiswa(this, items);
        recyclerView.setAdapter(classmahasiswa);

        classmahasiswa.setOnItemClick(new classmahasiswa.OnItemClick() {
            @Override
            public void onItemClick(mahasiswa mahasiswa, int position) {

            }

            @Override
            public void onItemClick(dataclass data, int position) {
                dataclass clickedData = dataclassList.get(position);

                Intent intent = new Intent(MainActivity.this, MainActivity.class);
                intent.putExtra("image", clickedData.getImage());
                intent.putExtra("name", clickedData.getName());
                intent.putExtra("nim", clickedData.getNim());
                startActivity(intent);
            }
        });
    }
}