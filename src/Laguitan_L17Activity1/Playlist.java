package Laguitan_L17Activity1;

import java.util.LinkedList;

public class Playlist {
	private LinkedList<Song> playlist = new LinkedList<>();
	private int currentSongIndex;
	
	public Playlist() {
		this.currentSongIndex = -1;
	}
	
	public Playlist(LinkedList<Song> playlist, int currentSongIndex) {
		this.playlist = playlist;
		this.currentSongIndex = currentSongIndex;
	}
	
	public void addSong(String sTitle, String sArtist) {
		playlist.add(new Song(sTitle, sArtist));
		System.out.println("Song added to the playlist!");
	}
	
	public void displayPlaylist() {
		System.out.println("Playlist:");
		for(int i = 0; i < playlist.size(); i++) {
			System.out.println((i + 1) + ". \'" + playlist.get(i).getTitle() + "\' by " + playlist.get(i).getArtist());
		}
	}
	
	public void removeSong(String title) {
		for(int i = 0; i < playlist.size(); i++) {
			if (playlist.get(i).getTitle().equalsIgnoreCase(title)) {
				playlist.remove(i);
				System.out.println("Song removed from the playlist.");
				currentSongIndex -= 1;
			}
		}
	}
	
	public void displayCurrentSong() {
		if (currentSongIndex == -1) {
			currentSongIndex += 1;
		}
		if (currentSongIndex < playlist.size()) {
			System.out.println("Current Song: \'" + playlist.get(currentSongIndex).getTitle() + "\' by " + playlist.get(currentSongIndex).getArtist());
		}
	}
	
	public void displayNextSong() {
		if (currentSongIndex < playlist.size() - 1) {
			currentSongIndex += 1;
			System.out.println("Next Song: \'" + playlist.get(currentSongIndex).getTitle() + "\' by " + playlist.get(currentSongIndex).getArtist());
		} else {
			System.out.println("No next song.");
		}	
	}
	
	public void searchSong(String artist) {
		playlist.forEach(s -> {if (s.getArtist().equalsIgnoreCase(artist)) {
			System.out.println("+ " + s.getTitle() + "\' by " + s.getArtist());
		}});
	}
}
