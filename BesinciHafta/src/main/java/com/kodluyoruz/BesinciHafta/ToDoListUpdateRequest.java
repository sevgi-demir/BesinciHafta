package com.kodluyoruz.BesinciHafta;

import lombok.Getter;
import lombok.Setter;

/**
 * @author sevgidemir
 */

 @Getter
 @Setter

public class ToDoListUpdateRequest {

    String gun;
    int id;
    String saat;
    String yapilacaklar;
    boolean done;

}
