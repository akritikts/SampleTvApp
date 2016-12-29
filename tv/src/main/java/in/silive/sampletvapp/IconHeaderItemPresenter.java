package in.silive.sampletvapp;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v17.leanback.widget.HeaderItem;
import android.support.v17.leanback.widget.ListRow;
import android.support.v17.leanback.widget.Presenter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by akriti on 27/12/16.
 */


    public class IconHeaderItemPresenter extends Presenter {
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
            LayoutInflater inflater = (LayoutInflater) viewGroup.getContext()
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

            View view = inflater.inflate(R.layout.row_header,null);

            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, Object o) {
            HeaderItem headerItem = ((ListRow) o).getHeaderItem();
            View rootView = viewHolder.view;

            ImageView iconView = (ImageView) rootView.findViewById(R.id.header_icon);
            Drawable icon = rootView.getResources().getDrawable(R.drawable.ic_launcher, null);
            iconView.setImageDrawable(icon);

            TextView label = (TextView) rootView.findViewById(R.id.header_label);
            label.setText(headerItem.getName());
        }

        @Override
        public void onUnbindViewHolder(ViewHolder viewHolder) {
            // no op
        }
    }

