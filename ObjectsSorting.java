import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;


public class ObjectsSorting {

    static Field[] getClassFields(Object clss) {
        Field[] classFields = clss.getClass().getFields();
        return classFields;
    }

    static void sortObjects(List objList, List<String> list) {

        Field[] classFields = getClassFields(objList.get(0));

        Collections.reverse(list);

//        for (Object field : list) {
//            for (Field classField : classFields) {
//                if (field.equals(classField.getName())) {
//
//                    Collections.sort(objList, new Comparator() {
//                        @Override
//                        public int compare(o1, Object o2) {
//                            return ;
//                        }
//
//                        @Override
//                        public Comparator reversed() {
//                            return null;
//                        }
//
//                        @Override
//                        public int compare(Person a, Person b) {
//                            return a.getName().compareTo(b.getName());
//                        }
//                    }
//
//                }
//            }
//        }

    }





}
