package com.kodluyoruz.BesinciHafta;

/**
 * @author sevgidemir
 */

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Configuration
public class ToDoListConfiguration {

    public static List<ToDo> gunlerList = new CopyOnWriteArrayList<>();

    @PostConstruct
    public void fillToDoList(){

        ToDo gun1 = new ToDo();
        gun1.setId(1);
        gun1.setGun("Pazartesi");
        gun1.setSaat("15.00-17.00");
        gun1.setYapilacaklar("kitap okuma");
        gun1.setDone(true);


        ToDo gun2 = new ToDo();
        gun2.setId(2);
        gun2.setGun("Salı");
        gun2.setSaat("09.00-11.00");
        gun2.setYapilacaklar("spor yapma");
        gun2.setDone(true);


        ToDo gun3 = new ToDo();
        gun3.setId(3);
        gun3.setGun("Çarşamba");
        gun3.setSaat("19.00-21.00");
        gun3.setYapilacaklar("alışverişe çıkma");
        gun3.setDone(false);


        ToDo gun4 = new ToDo();
        gun4.setId(4);
        gun4.setGun("Perşembe");
        gun4.setSaat("20.00-21.00");
        gun4.setYapilacaklar("office hour");
        gun4.setDone(true);


        ToDo gun5 = new ToDo();
        gun5.setId(5);
        gun5.setGun("Cuma");
        gun5.setSaat("21.00-23.00");
        gun5.setYapilacaklar("kitap okuma");
        gun5.setDone(true);


        ToDo gun6 = new ToDo();
        gun6.setId(6);
        gun6.setGun("Cumartesi");
        gun6.setSaat("10.00-15.00");
        gun6.setYapilacaklar("bootcamp dersi");
        gun6.setDone(false);


        ToDo gun7 = new ToDo();
        gun7.setId(7);
        gun7.setGun("Pazar");
        gun7.setSaat("10.00-15.00");
        gun7.setYapilacaklar("bootcamp dersi");
        gun7.setDone(false);



        gunlerList.add(gun1);
        gunlerList.add(gun2);
        gunlerList.add(gun3);
        gunlerList.add(gun4);
        gunlerList.add(gun5);
        gunlerList.add(gun6);
        gunlerList.add(gun7);



    }
}
