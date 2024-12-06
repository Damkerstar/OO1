package ar.edu.unlp.oo1.ejercicio1.impl;

import ar.edu.unlp.oo1.ejercicio1.WallPost;

public class WallPostImpl implements WallPost {

	public String texto;
	public int cantLikes = 0;
	public char mark = 'N';
	
	public String getText() {
		return this.texto;
	}
	
	public void setText(String text) {
		this.texto = text;
	}
	
	public int getLikes() {
		return this.cantLikes;
	}
	
	public void like() {
		this.cantLikes++;
	}
	
	public void dislike() {
		this.cantLikes--;
	}
	
	public boolean isFeatured() {
		return (mark == 'D');
	}
	
	public void toggleFeatured() {
		this.mark = mark == 'D'? 'N': 'D';
	}
	
	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de forma adecuada
	 */
    @Override
    public String toString() {
        return "WallPost {" +
            "text: " + getText() +
            ", likes: '" + getLikes() + "'" +
            ", featured: '" + isFeatured() + "'" +
            "}";
    }

}
