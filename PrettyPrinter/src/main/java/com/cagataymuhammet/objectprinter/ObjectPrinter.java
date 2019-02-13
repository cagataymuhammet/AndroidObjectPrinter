package com.cagataymuhammet.objectprinter;

import com.cagataymuhammet.objectprinter.GsonHelper.Gson;
import com.cagataymuhammet.objectprinter.GsonHelper.GsonBuilder;

public class ObjectPrinter {

    public static void printJson(Object o) {

        System.out.print("\n\n############################################\n\n");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(o));
        System.out.print("\n\n############################################\n\n");
    }


}
