package com.example.portfolioapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list = findViewById(R.id.rv_project);

        Project[] projects = {
                new Project("Guru", "App for academy coaches, empowering them to effortlessly monitor and manage user activities with ease.", R.drawable.gurulogo),
                new Project("PPR", "Allows multiple users to showcase and promote their academies, providing a platform for players to make bookings.", R.drawable.ppr),
                new Project("BUDDY", "Sports activity app enabling users to seamlessly monitor and enhance their fitness journey.", R.drawable.buddy),
                new Project("Photo_sharing_App", "App to post photos and write descriptions about it. Users can also follow other users.", R.drawable.photo_sharing_app),
                new Project("ForRental", "Rental app allowing the landlord to rent their property on the app, allowing user to save or enquire about property.", R.drawable.forrental)
        };


        ProjectsAdapter adapter = new ProjectsAdapter(projects);

        list.setAdapter(adapter);
    }
}