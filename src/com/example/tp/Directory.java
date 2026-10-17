package com.example.tp;

	public class Directory extends FsItem {
	    private FsItem[] children;
	    private int count;

	    public Directory(String nom) {
	        super(nom);
	        this.children = new FsItem[2]; 
	        this.count = 0;
	    }

	    public void add(FsItem item) {
	        if (count >= children.length) { 
	            FsItem[] t = new FsItem[children.length + 2]; 
	            for (int i = 0; i < children.length; i++) { 
	                t[i] = children[i];
	            }
	            children = t;
	        }
	        children[count] = item;
	        count++;
	    }

	    @Override
	    public long getSize() {
	        long total = 0;
	        int i = 0;
	        while (i < count) { 
	            total += children[i].getSize();
	            i++;
	        }
	        return total;
	    }

	    public void list(int indent) {
	        System.out.println("  ".repeat(indent) + this);
	        int i = 0;
	        while (i < count) { 
	            FsItem f = children[i];
	            if (f instanceof Directory) {
	                ((Directory) f).list(indent + 1);
	            } else {
	                System.out.println("  ".repeat(indent + 1) + f);
	            }
	            i++;
	        }
	    }
	}


