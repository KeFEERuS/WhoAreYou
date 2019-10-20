package com.example.whoareyou;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameField extends Activity {
    private String text;
    private String voiceTextMass[] = {
            "Шатать не перешатать...",
            "Долго ещё шатать будешь?",
            "Зачем пошатал?",
            "За такое Юра тебе палец зашатает",
            "Всё, заканчивай шатать!"
    };
    private int numText = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game_field);

        final TextView voiceSway = (TextView) findViewById(R.id.voice);

        Button sway_btn = (Button) findViewById(R.id.btn_sway);
        sway_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                voiceSway.setText(voiceText());
            }
        });
    }
    
    private String voiceText() {
        numText = (int) (Math.random() * voiceTextMass.length);

        return voiceTextMass[numText];
    }
}
