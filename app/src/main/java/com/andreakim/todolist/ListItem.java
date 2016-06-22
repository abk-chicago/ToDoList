package com.andreakim.todolist;

/**
 * Created by andreakim on 6/21/16.
 */
public class ListItem {

    public ListItem(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        private String name;

        public String getDesc() {
            return desc;
        }

        public void setDesc(String desc) {
            this.desc = desc;
        }

        private String desc;



    }

