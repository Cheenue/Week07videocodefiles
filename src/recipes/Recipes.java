package src.recipes;

import src.recipes.dao.DbConnection;

public class Recipes {

    public static void main(String[] args) {
        DbConnection.getConnection();
    }
}
