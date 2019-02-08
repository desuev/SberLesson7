package desuev.ru.sberlesson7;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ContactViewHolder extends SampleViewHolder {

    private ImageView avatar;
    private TextView fullName;
    private TextView number;

    public ContactViewHolder(@NonNull View itemView) {
        super(itemView);
        avatar = itemView.findViewById(R.id.avatar);
        fullName = itemView.findViewById(R.id.name);
        number = itemView.findViewById(R.id.number);
    }

    @Override
    public void bind(Contact item){
        avatar.setImageResource(R.drawable.ic_launcher_foreground);
        fullName.setText(String.valueOf(item.getFirstName() + " " + item.getSecondName()));
        number.setText(item.getNumber());
    }

}
