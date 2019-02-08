package desuev.ru.sberlesson7;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class RecyclerContactViewHolder extends SampleViewHolder {

    private AdditionalAdapter adapter;

    public RecyclerContactViewHolder(@NonNull View itemView) {
        super(itemView);
        RecyclerView recyclerView = itemView.findViewById(R.id.second_recycler_view);
        List<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Ортемий", "Синдеев", "89161488666", ItemTypes.FIRST.type));
        contacts.add(new Contact("Конь", "Обыкновенный", "89161488666", ItemTypes.SECOND.type));
        contacts.add(new Contact("Тестовая заглушка", "Да", "89161488666", ItemTypes.THIRD.type));
        contacts.add(new Contact("Игорь", "Иванов", "89161488666", ItemTypes.FIRST.type));
        contacts.add(new Contact("Тестовая заглушка", "Да", "89161488666", ItemTypes.SECOND.type));
        adapter = new AdditionalAdapter(contacts);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(itemView.getContext(), LinearLayout.HORIZONTAL, false));
    }


    @Override
    public void bind(Contact contact){
        adapter.addContact(contact);
    }
}
