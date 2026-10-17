package com.example.tp;

	public abstract class FsItem {
	   
	    protected String nom;

	    public FsItem(String nom) {
	        this.nom = nom;
	    }

	    public String getNom() {
	        return nom;
	    }

	    public abstract long getSize();

	    @Override
	    public String toString() {
	       
	        return nom + " (" + this.getSize() + " B)";
	    }
	}

