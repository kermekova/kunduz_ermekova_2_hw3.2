package com.example.kunduz_ermekova_2_hw32;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        createPlayers();
    }

    @Override
    public String toString() {
        return "MainActivity{}";
    }

    public static ArrayList<Players> createPlayers() {
        Players fairy = new Players(1, "Bloom");
        Players warrior1 = new Players(2, "Hercules");
        Players warrior2 = new Players(3, "Achilles");
        Players magic = new Players(4, "Merlin");
        Players berserk = new Players(5, "Guts");
        Players doc = new Players(6, "Hendolf");
        Players assistant = new Players(7, "Junior");
        Players witcher = new Players(8, "Geralt");
        Players hacker = new Players(9, "Anonymous");
        Players specialist = new Players(10, "Sky");

        ArrayList<Players> players = new ArrayList<>();
        players.add(fairy);
        players.add(warrior1);
        players.add(warrior2);
        players.add(magic);
        players.add(berserk);
        players.add(doc);
        players.add(assistant);
        players.add(witcher);
        players.add(hacker);
        players.add(specialist);


        for (Players player : players) {
            System.out.println("Игроки: " + player);
        }

        return players;


    }
}
