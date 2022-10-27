package com.kodluyoruz.BesinciHafta;

/**
 * @author sevgidemir
 */

import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Random;

@Service
public class ToDoListService {

    public static ToDo getToDoList(int listeId) {
        List<ToDo> List = ToDoListConfiguration.gunlerList;
        for (ToDo deger : List) {
            if (deger.getId() == listeId) {
                return deger;
            }
        }
        return null;
    }

    public boolean saveList(ToDoListSaveRequest requestBody) {
        String listName = requestBody.getGun();

        try {
            ToDo list = new ToDo();
            list.setGun(listName);
            int id = getId();
            list.setId(id);

            List<ToDo> List = ToDoListConfiguration.gunlerList;
            List.add(list);

            return true;
        } catch (Exception e) {
            return false;
        }
    }



    private int getId() {
        Random random = new Random();
        int id = random.nextInt(1000);
        return id;
    }


    public boolean deleteList(int listeId) {

        try {
            List<ToDo> List = ToDoListConfiguration.gunlerList;
            for (ToDo deger : List) {
                if (deger.getId() == listeId) {
                    List.remove(deger);
                }
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }

}
