package desuev.ru.sberlesson7;

import android.content.IntentFilter;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import desuev.ru.sberlesson7.API.Callback;


public class ContactAdapter extends RecyclerView.Adapter<SampleViewHolder>{

    private final List<Contact> contacts;

    ContactAdapter(){
        contacts = new ArrayList<>();
    }

    @NonNull
    @Override
    public SampleViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ItemTypes itemTypes = ItemTypes.values()[i];
        switch (itemTypes) {
            case FIRST:
                return new ContactViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.contact_layout, viewGroup, false));
            case SECOND:
                return new ContactViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.second_contact_layout, viewGroup, false));
            case THIRD:
                return new ContactViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.third_contact_layout, viewGroup, false));
            case FOURTH:
                return new RecyclerContactViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.recycler_contact_layout, viewGroup, false));
            default:
                return null;
        }
    }

    @Override
    public int getItemViewType(int position) {
        return contacts.get(position).getType();
    }


    @Override
    public void onBindViewHolder(@NonNull SampleViewHolder sampleViewHolder, int i) {
        sampleViewHolder.bind(contacts.get(i));
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    public void addContact(Contact contact){
        if(contacts.size() < 10) {
            contacts.add(contact);
            notifyDataSetChanged();
        }
    }
}
