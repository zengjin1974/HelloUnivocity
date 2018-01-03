package comparison.csvproject;

import java.io.File;

// 参照先：https://eng-entrance.com/java-file-path

public class Pathname {
    public static void main(String[] args) {
        String pathname = "C:\\temp\\abc\\def.txt";//[1]
        File file = new File(pathname);//[2]

        System.out.println("[3] getPath():[" + file.getPath() + "]");
        System.out.println("[4] getAbsolutePath():[" + file.getAbsolutePath() + "]");
        System.out.println("[5] getParent():[" + file.getParent() + "]");
        System.out.println("[6] getName():[" + file.getName() + "]");
        System.out.println("");

        String xpathnameWithOutDrive = "\\abc\\def.txt";//[7]
        File fileWithOutDrive = new File(xpathnameWithOutDrive);//[8]

        System.out.println("[9] getPath():[" + fileWithOutDrive.getPath() + "]");
        System.out.println("[10] getAbsolutePath():[" + fileWithOutDrive.getAbsolutePath() + "]");
        System.out.println("[11] getParent():[" + fileWithOutDrive.getParent() + "]");
        System.out.println("[12] getName():[" + fileWithOutDrive.getName() + "]");
    }
}