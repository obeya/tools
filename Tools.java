import android.util.SparseArray;
import android.view.View;

/**
 * ViewHolder的工具类实现
 * 
 * 调用 : Tools.ViewHolder.get(convertView, R.id.student_name)
 *
 * Created by  李锋 on 17-1-7.
 */

public class Tools {


    static class ViewHolder {

        public static <T extends View> T get(View view, int id) {

            SparseArray<View> viewHolder = (SparseArray<View>) view.getTag();
            if (viewHolder == null) {
                viewHolder = new SparseArray<View>();
                view.setTag(viewHolder);
            }

            View childView = viewHolder.get(id);
            if (childView == null) {
                childView = view.findViewById(id);
                viewHolder.put(id, childView);
            }

            return (T) childView;
        }

    }

//    @Override
//    public View getView(int position,View convertView,ViewGroup parent) {
//
//        if (convertView == null) {
//            convertView = inflater.inflate(R.layout.listview_item_layout, parent, false);
//        }
//        TextView name = Tools.ViewHolder.get(convertView, R.id.student_name);
//        TextView age = Tools.ViewHolder.get(convertView, R.id.student_age);
//
//        Student data = (Student)getItem(position);
//        name.setText(data.getName());
//        age.setText(data.getAge());
//        return convertView;
//    }

}
