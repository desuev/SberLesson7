package desuev.ru.sberlesson7;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class AdditionalAdapter extends RecyclerView.Adapter<AdditionalAdapter.AdditionalHolder> {

    private List<Contact> contacts;

    AdditionalAdapter(List<Contact> contacts){
        this.contacts = contacts;
    }

    @NonNull
    @Override
    public AdditionalHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new AdditionalHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.second_recycler_item_view, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdditionalHolder additionalHolder, int i) {
        additionalHolder.setText(contacts.get(i).getFirstName() + " " + contacts.get(i).getSecondName());
    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }

    void addContact(Contact item) {
        contacts.add(item);
        notifyDataSetChanged();
    }

    class AdditionalHolder extends RecyclerView.ViewHolder{

        private TextView textView;

        public AdditionalHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.text_view_in_fourth_type);
        }

        public void setText(String text){
            textView.setText(text);
        }
    }
}
