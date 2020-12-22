package com.ashish.zomatorestaurants.models;

public class R{
    public int res_id;
    public boolean is_grocery_store;
    public HasMenuStatus has_menu_status;

    public R(int res_id, boolean is_grocery_store, HasMenuStatus has_menu_status) {
        this.res_id = res_id;
        this.is_grocery_store = is_grocery_store;
        this.has_menu_status = has_menu_status;
    }

    public int getRes_id() {
        return res_id;
    }

    public void setRes_id(int res_id) {
        this.res_id = res_id;
    }

    public boolean isIs_grocery_store() {
        return is_grocery_store;
    }

    public void setIs_grocery_store(boolean is_grocery_store) {
        this.is_grocery_store = is_grocery_store;
    }

    public HasMenuStatus getHas_menu_status() {
        return has_menu_status;
    }

    public void setHas_menu_status(HasMenuStatus has_menu_status) {
        this.has_menu_status = has_menu_status;
    }
}

