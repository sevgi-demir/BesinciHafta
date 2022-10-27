package com.kodluyoruz.BesinciHafta;

/**
 * @author sevgidemir
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Todo")
public class ToDoListController {

    @Autowired
    ToDoListService listService;

    @GetMapping("/getTodo")
    public ToDo getToDoList(@RequestParam(value = "listId", required = false) int listeId){
        return ToDoListService.getToDoList(listeId);

    }

    @PostMapping("/saveTodo")
    public boolean saveToDoList(@RequestBody ToDoListSaveRequest listeSaveRequestBody){
        return listService.saveList(listeSaveRequestBody);

    }

    @DeleteMapping("/deleteTodo")
    public boolean updateToDoList(@RequestParam int listeId){
        return listService.deleteList(listeId);

    }
}
