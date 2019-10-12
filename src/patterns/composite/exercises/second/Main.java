package patterns.composite.exercises.second;

import patterns.composite.exercises.second.classes.Folder;
import patterns.composite.exercises.second.classes.SimpleFile;

public class Main {
    public static void main(String[] args) {

        Folder folderOfPhotos = new Folder("Photos 2012", 1);
        folderOfPhotos.addFile(new SimpleFile("Photo of cat.jpg", 16));
        folderOfPhotos.addFile(new SimpleFile("Photo of dog.mp4", 128));
        folderOfPhotos.addFile(new SimpleFile("Photo of Bird.exe", 1024));

        Folder folderOfGames = new Folder("Best games 2012", 1);
        folderOfGames.addFile(new SimpleFile("Soccer Game.exe", 16));
        folderOfGames.addFile(new SimpleFile("Baseball Game.exe", 16));
        folderOfGames.addFile(new SimpleFile("RPG Game.exe", 16));

        folderOfPhotos.addFile(folderOfGames);
        folderOfPhotos.info();


    }
}
