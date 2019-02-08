package desuev.ru.sberlesson7;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import desuev.ru.sberlesson7.API.CustomViewHolder;

public class SampleViewHolder extends RecyclerView.ViewHolder implements CustomViewHolder {

    public SampleViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    @Override
    public void bind(Contact contact) {

    }
}
