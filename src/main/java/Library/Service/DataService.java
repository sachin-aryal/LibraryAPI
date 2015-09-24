package Library.Service;

import Library.Model.Data;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sachin on 9/2/15.
 */
public class DataService {

    public List<Data> getAllData(){

        Data d1=new Data("Book",201,"2015-5-16","2015-4-8");
        Data d2=new Data("Book2",211,"2015-5-16","2015-4-8");

        List<Data> list=new LinkedList<>();
        list.add(d1);
        list.add(d2);
        return list;

    }


    public List<Data> getData(){
        Data d1=new Data("Book",201,"2015-5-16","2015-4-8");
        List<Data> list=new LinkedList<>();
        list.add(d1);
        return list;
    }

}
