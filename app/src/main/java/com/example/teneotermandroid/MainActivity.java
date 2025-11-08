package com.example.teneotermandroid;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.teneotermandroid.models.OperationModel;
import com.example.teneotermandroid.models.PartModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    LinearLayout opContainer;
    TextView tvOrderLine, tvOrderNum, tvPartCode, tvPartName, tvPartVersion, tvPartSerNum;
    PartModel currentPart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        loadViews();

        currentPart = new PartModel();

        currentPart.setPartCode("Adi78aqweqqqq");
        currentPart.setPartVersion(1);
        currentPart.setOrderLine("VER");
        currentPart.setPartName("Vyrobek 1235456");
        currentPart.setPartSerialNumber("SN: B1152250008");
        currentPart.setOrderNum("123456789");

        ArrayList<OperationModel> operations = new ArrayList<>();

        OperationModel op1 = new OperationModel(1,"Operace1", 10.23f, true);
        OperationModel op2 = new OperationModel(2,"Operace2", 10.23f, false);
        OperationModel op3 = new OperationModel(3,"Operace3", 11.23f, false);
        OperationModel op4 = new OperationModel(4,"Operace4", 12.23f, false);

        operations.add(op1);
        operations.add(op2);
        operations.add(op3);
        operations.add(op4);

        currentPart.setOperations(operations);

        setupViewsFromModel();


        Log.d("Info", "onCreate: added views");
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    private void loadViews(){
        opContainer = findViewById(R.id.opContainer);
        tvOrderLine = findViewById(R.id.tvOrderLine);
        tvOrderNum = findViewById(R.id.tvOrderNum);
        tvPartCode = findViewById(R.id.tvPartCode);
        tvPartName = findViewById(R.id.tvPartName);
        tvPartVersion = findViewById(R.id.tvPartVersion);
        tvPartSerNum = findViewById(R.id.tvPartSerNum);
    }

    private void setupViewsFromModel(){

        tvOrderLine.setText(currentPart.getOrderLine());
        tvOrderNum.setText(currentPart.getOrderNum());
        tvPartCode.setText(currentPart.getPartCode());
        tvPartName.setText(currentPart.getPartName());
        tvPartVersion.setText(String.valueOf(currentPart.getPartVersion()));
        tvPartSerNum.setText(currentPart.getPartSerialNumber());

        opContainer.removeAllViews();

        for (OperationModel operation: currentPart.getOperations()){
            addOperationFromModel(operation);
        }

    }

    @SuppressLint("DefaultLocale")
    private void addOperationFromModel(OperationModel model) {

        View itemView = LayoutInflater.from(this).inflate(R.layout.op_layout, opContainer, false);

        TextView tvOpOrder, tvOpName, tvNOP;
        tvOpOrder = itemView.findViewById(R.id.tvOpOrder);
        tvOpName = itemView.findViewById(R.id.tvOpName);
        tvNOP = itemView.findViewById(R.id.tvNOperation);

        tvOpOrder.setText(String.valueOf(model.getOperationOrder()));
        tvOpName.setText(model.getOperationName());
        tvNOP.setText(String.valueOf(model.getnOperations()));
        opContainer.addView(itemView);
    }
}