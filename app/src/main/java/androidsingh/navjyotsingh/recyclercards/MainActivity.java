package androidsingh.navjyotsingh.recyclercards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList=new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.fourr,"Clicked at Italy"));
        exampleList.add(new ExampleItem(R.drawable.oner,"Clicked at Rome"));
        exampleList.add(new ExampleItem(R.drawable.twor,"Clicked at India"));
        exampleList.add(new ExampleItem(R.drawable.threer,"Clicked at Vietnam"));
        exampleList.add(new ExampleItem(R.drawable.fiver,"Clicked at Australia"));
        exampleList.add(new ExampleItem(R.drawable.sixr,"Clicked at Canada"));


        recyclerView=findViewById(R.id.recyclerView);

        recyclerView.setHasFixedSize(true);

        layoutManager =new LinearLayoutManager(this);
        adapter=new ExampleAdapter(exampleList);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);


    }
}
