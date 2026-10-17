package com.example.tp;


	public class FileItem extends FsItem {
	    
	    private long size;

	    public FileItem(String nom, long size) {
	        super(nom);
	        this.size = size;
	    }

	    @Override
	    public long getSize() {
	        long s = this.size;
	        return s;
	    }
	}


