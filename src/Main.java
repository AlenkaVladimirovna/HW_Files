import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        File dirl = new File("C://Games");

        File src = new File(dirl, "src");
        if (src.mkdir())
            builder.append("Каталог src создан. ");

        File res = new File(dirl, "res");
        if (res.mkdir())
            builder.append("Каталог res создан. ");

        File savegames = new File(dirl, "savegames");
        if (savegames.mkdir())
            builder.append("Каталог savegames создан. ");

        File temp = new File(dirl, "temp");
        if (temp.mkdir())
            builder.append("Каталог temp создан. ");

        File main = new File(src, "main");
        if (main.mkdir())
            builder.append("Каталог main создан. ");

        File test = new File(src, "test");
        if (test.mkdir())
            builder.append("Каталог test создан. ");

        File drawables = new File(res, "drawables");
        if (drawables.mkdir())
            builder.append("Каталог drawables создан. ");

        File vectors = new File(res, "vectors");
        if (vectors.mkdir())
            builder.append("Каталог vectors создан. ");

        File icons = new File(res, "icons");
        if (icons.mkdir())
            builder.append("Каталог icons создан. ");

        File myFileMain = new File(main, "Main.java");
        try {
            if (myFileMain.createNewFile())
                builder.append("Файл Main.java создан. ");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File myFileUtils = new File(main,"Utils.java");
        try {
            if (myFileUtils.createNewFile())
                builder.append("Файл Utils.java создан. ");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        File myFileTemp = new File(temp,"temp.txt");
        try {
            if (myFileTemp.createNewFile())
                builder.append("Файл tmp.txt создан. ");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        File notesFile = new File(dirl, "tmp.txt");
        try (FileWriter writer = new FileWriter(notesFile)) {
            writer.write(builder.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        GameProgress game1 = new GameProgress(10, 3, 2, 1000);
        GameProgress game2 = new GameProgress(8, 4, 6, 4500);
        GameProgress game3 = new GameProgress(3, 5, 9, 8000);

        try (FileOutputStream fos = new FileOutputStream("game1.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(game1);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try (FileOutputStream fos = new FileOutputStream("game2.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(game2);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        try (FileOutputStream fos = new FileOutputStream("game3.dat");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(game3);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


       //public void zipFiles();
    }


}